package com.example

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.print.PrintAttributes
import android.print.PrintManager
import android.view.ViewGroup
import android.webkit.ValueCallback
import android.webkit.WebChromeClient
import android.webkit.WebResourceRequest
import android.webkit.WebSettings
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.activity.ComponentActivity
import androidx.activity.compose.BackHandler
import androidx.activity.compose.rememberLauncherForActivityResult
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CalendarMonth
import androidx.compose.material.icons.filled.Print
import androidx.compose.material.icons.filled.Refresh
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableFloatStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.platform.testTag
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.ui.viewinterop.AndroidView
import com.example.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {

  private var filePathCallback: ValueCallback<Array<Uri>>? = null

  override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    enableEdgeToEdge()
    setContent {
      MyApplicationTheme {
        TimetableAppScreen(
          onFileChooser = { callback, intent ->
            filePathCallback?.onReceiveValue(null)
            filePathCallback = callback
            fileChooserLauncher.launch(intent)
          }
        )
      }
    }
  }

  private val fileChooserLauncher =
    registerForActivityResult(ActivityResultContracts.StartActivityForResult()) { result ->
      filePathCallback?.let { callback ->
        val uris = WebChromeClient.FileChooserParams.parseResult(result.resultCode, result.data)
        callback.onReceiveValue(uris)
        filePathCallback = null
      }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TimetableAppScreen(
  onFileChooser: (ValueCallback<Array<Uri>>?, Intent) -> Unit
) {
  val context = LocalContext.current
  var webViewInstance by remember { mutableStateOf<WebView?>(null) }
  var canGoBack by remember { mutableStateOf(false) }
  var pageProgress by remember { mutableFloatStateOf(0f) }

  BackHandler(enabled = canGoBack) {
    webViewInstance?.goBack()
  }

  Scaffold(
    topBar = {
      TopAppBar(
        colors = TopAppBarDefaults.topAppBarColors(
          containerColor = MaterialTheme.colorScheme.primary,
          titleContentColor = Color.White,
          actionIconContentColor = Color.White
        ),
        title = {
          Row(verticalAlignment = Alignment.CenterVertically) {
            Surface(
              shape = RoundedCornerShape(8.dp),
              color = Color.White.copy(alpha = 0.2f),
              modifier = Modifier.size(34.dp)
            ) {
              Box(contentAlignment = Alignment.Center) {
                Icon(
                  imageVector = Icons.Default.CalendarMonth,
                  contentDescription = "Timetable Logo",
                  tint = Color.White,
                  modifier = Modifier.size(20.dp)
                )
              }
            }
            Column(modifier = Modifier.padding(start = 10.dp)) {
              Text(
                text = "Wafy & Wafiyya Timetable",
                fontSize = 15.sp,
                fontWeight = FontWeight.Bold,
                color = Color.White,
                lineHeight = 18.sp
              )
              Text(
                text = "KKHM & Al-Gaith Colleges Portal",
                fontSize = 10.sp,
                color = Color.White.copy(alpha = 0.85f),
                lineHeight = 12.sp
              )
            }
          }
        },
        actions = {
          IconButton(
            onClick = {
              webViewInstance?.let { wv ->
                printWebPage(context, wv)
              }
            },
            modifier = Modifier.testTag("action_print_timetable")
          ) {
            Icon(
              imageVector = Icons.Default.Print,
              contentDescription = "Print Timetable Noticeboard"
            )
          }

          IconButton(
            onClick = {
              val shareIntent = Intent(Intent.ACTION_SEND).apply {
                type = "text/plain"
                putExtra(
                  Intent.EXTRA_SUBJECT,
                  "WAFY & WAFIYYA Academic Timetable & Audit Portal"
                )
                putExtra(
                  Intent.EXTRA_TEXT,
                  "KKHM & Al-Gaith Wafy & Wafiyya Timetable Portal:\nhttps://kkhmstorage.github.io/WAFY-WAFIYYA-TIME-TABLE/"
                )
              }
              context.startActivity(Intent.createChooser(shareIntent, "Share Timetable Portal"))
            },
            modifier = Modifier.testTag("action_share_timetable")
          ) {
            Icon(
              imageVector = Icons.Default.Share,
              contentDescription = "Share Timetable"
            )
          }

          IconButton(
            onClick = {
              webViewInstance?.reload()
            },
            modifier = Modifier.testTag("action_reload_timetable")
          ) {
            Icon(
              imageVector = Icons.Default.Refresh,
              contentDescription = "Reload Timetable"
            )
          }
        }
      )
    }
  ) { innerPadding ->
    Column(
      modifier = Modifier
        .fillMaxSize()
        .padding(innerPadding)
    ) {
      if (pageProgress in 0.01f..0.99f) {
        LinearProgressIndicator(
          progress = { pageProgress },
          modifier = Modifier
            .fillMaxWidth()
            .height(3.dp),
          color = MaterialTheme.colorScheme.tertiary,
          trackColor = MaterialTheme.colorScheme.primary.copy(alpha = 0.3f)
        )
      }

      AndroidView(
        modifier = Modifier
          .fillMaxSize()
          .testTag("portal_webview"),
        factory = { ctx ->
          WebView(ctx).apply {
            layoutParams = ViewGroup.LayoutParams(
              ViewGroup.LayoutParams.MATCH_PARENT,
              ViewGroup.LayoutParams.MATCH_PARENT
            )

            settings.apply {
              javaScriptEnabled = true
              domStorageEnabled = true
              databaseEnabled = true
              allowFileAccess = true
              allowContentAccess = true
              loadWithOverviewMode = true
              useWideViewPort = true
              setSupportZoom(true)
              builtInZoomControls = true
              displayZoomControls = false
              mixedContentMode = WebSettings.MIXED_CONTENT_ALWAYS_ALLOW
              cacheMode = WebSettings.LOAD_DEFAULT
            }

            addJavascriptInterface(
              object {
                @android.webkit.JavascriptInterface
                fun print() {
                  (ctx as? ComponentActivity)?.runOnUiThread {
                    printWebPage(ctx, this@apply)
                  }
                }
              },
              "AndroidPrinter"
            )

            webChromeClient = object : WebChromeClient() {
              override fun onProgressChanged(view: WebView?, newProgress: Int) {
                pageProgress = newProgress / 100f
                canGoBack = view?.canGoBack() ?: false
              }

              override fun onShowFileChooser(
                webView: WebView?,
                filePathCallback: ValueCallback<Array<Uri>>?,
                fileChooserParams: FileChooserParams?
              ): Boolean {
                val intent = fileChooserParams?.createIntent()
                  ?: Intent(Intent.ACTION_GET_CONTENT).apply {
                    type = "*/*"
                  }
                onFileChooser(filePathCallback, intent)
                return true
              }
            }

            webViewClient = object : WebViewClient() {
              override fun shouldOverrideUrlLoading(
                view: WebView?,
                request: WebResourceRequest?
              ): Boolean {
                val url = request?.url?.toString() ?: return false
                // Handle WhatsApp or external intent links gracefully
                if (url.startsWith("https://api.whatsapp.com") || url.startsWith("whatsapp://")) {
                  try {
                    val intent = Intent(Intent.ACTION_VIEW, Uri.parse(url))
                    ctx.startActivity(intent)
                    return true
                  } catch (e: Exception) {
                    return false
                  }
                }
                return false
              }

              override fun onPageFinished(view: WebView?, url: String?) {
                super.onPageFinished(view, url)
                canGoBack = view?.canGoBack() ?: false
              }
            }

            // Load the local bug-fixed portal asset
            loadUrl("file:///android_asset/index.html")
            webViewInstance = this
          }
        },
        update = { wv ->
          webViewInstance = wv
          canGoBack = wv.canGoBack()
        }
      )
    }
  }
}

private fun printWebPage(context: Context, webView: WebView) {
  val printManager = context.getSystemService(Context.PRINT_SERVICE) as? PrintManager
  val jobName = "Wafy_Wafiyya_Timetable"
  val printAdapter = webView.createPrintDocumentAdapter(jobName)
  val attributes = PrintAttributes.Builder()
    .setMediaSize(PrintAttributes.MediaSize.ISO_A4.asLandscape())
    .build()
  printManager?.print(jobName, printAdapter, attributes)
}
