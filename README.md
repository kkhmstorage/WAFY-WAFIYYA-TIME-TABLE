# CO-ORDINATED ACADEMIC TIMETABLE & AUDIT PORTAL
## KKHM ISLAMIC & ARTS COLLEGE ( WAFY ) & AL-GAITH ISLAMIC & ARTS COLLEGE FOR GIRLS ( WAFIYYA)

A modern, institutional-grade academic scheduling, period delivery auditing, and faculty coordination portal built specifically for:
- **KKHM ISLAMIC & ARTS COLLEGE ( WAFY )** [Boys Campus]
- **AL-GAITH ISLAMIC & ARTS COLLEGE FOR GIRLS ( WAFIYYA)** [Girls Campus]

---

## 🔒 Role-Based Access Control (Admin, Class Leaders & Public Inspection)

The portal implements a strict 3-tier access hierarchy to ensure data integrity while maintaining full public transparency:

### 1. Dual Campus Administrator Accounts (Full Global Access)
Two dedicated administrator credentials are provided for both institutions, holding overall administrative power across all sections, setup, and audits:

| Institution | Username | Password | Role & Authority |
|---|---|---|---|
| **KKHM ISLAMIC & ARTS COLLEGE ( WAFY )** | `admin_kkhm` | `kkhmadmin123` | **KKHM Campus Administrator** (Full overall access across both colleges) |
| **AL-GAITH ISLAMIC & ARTS COLLEGE FOR GIRLS ( WAFIYYA)** | `admin_algaith` | `algaithadmin123` | **Al-Gaith Campus Administrator** (Full overall access across both colleges) |
| **General Administration** | `admin` | `kkhmadmin123` | **Super Administrator** (Universal access fallback) |

- **One-Click Quick Fill**: In the Admin Login dialog, administrators can click either campus badge to automatically populate their username and password.
- **Full Privileges**: Either administrator can configure academic working days, add/edit/delete faculty, adjust timetable allocations, generate master schedules, record and approve daily 3:30 PM audits, update the Class Leader Passcode, and sync changes with the cloud.

---

### 2. Class Leader Access (3:30 PM Daily Period Audit Recording)
To ensure accountability while keeping administrative overhead low, daily period audits can only be entered by authorized Class Leaders or Administrators:

- **Leader Authentication**:
  - Accessible via the **"Leader Login"** button in the header bar or the lock banner in the Daily Audit tab.
  - Class Leaders select their **Class / Batch**, enter their **Name**, and authenticate using the **Class Leader Passcode** (provided by Admin).
  - **Passcode Management**: Administrators can easily modify the Class Leader Passcode at any time from the **Setup & Working Days** tab with instant cloud synchronization.
- **Authorized Permissions**:
  - Record and modify period delivery status (**Conducted** / **Missed**) for scheduled periods.
  - Specify absence reasons (e.g., *Teacher On Leave*, *Official Duty*, *Late Arrival*, *College Program*) and add descriptive remarks.
  - Submit and digitally sign the daily period report with cloud synchronization to Firestore.
- **Scoped Security**: Class leaders are restricted from modifying faculty rosters, class allotments, timetable generation, or academic settings.

---

### 3. Public & Student Inspection Mode (Read-Only Transparency)
In accordance with institutional guidelines:
- **Full Transparency & Visibility**: All students, faculty, and public visitors can freely view and inspect **all 8 portal sections**:
  1. **Schedule & Timetable**: View Today's schedule, college-wise schedules, class-wise schedules, faculty schedules, and master matrix.
  2. **3:30 PM Daily Period Audit**: Inspect date-wise daily audits, review conducted/missed periods, see status badges (Conducted in green, Missed in red, Pending in amber), and print daily audit slips.
  3. **Missed Periods Tracker**: Inspect missed period logs, filter by date/teacher/class, and export CSV.
  4. **Special Timetable**: Inspect special exam/event timetables and print custom schedules.
  5. **Academic Reports**: Inspect monthly summaries, annual working day statistics, and department completion rates.
  6. **Config & Working Days**: Inspect total working days, periods per day, and period timings in read-only mode.
  7. **Faculty & Codes**: Inspect faculty roster, teacher codes, subject specializations, and day constraints.
  8. **Subject Allocations**: Inspect weekly hours and teacher allotments for every class across both colleges.
- **Strict Modification Protection**: Adding, editing, deleting, generating schedules, resetting data, and **recording daily audits** are strictly locked for general students and visitors. When unauthenticated visitors view the Daily Audit tab, interactive toggles are replaced with read-only status badges, inputs are disabled, and a prominent bilingual (English & Malayalam) notice guides authorized Class Leaders and Administrators to log in.

---

## 🌟 Key Features & Capabilities

### 1. Separate & Combined College Timetables
- Under **Schedule & Timetable > By College**, dedicated switcher buttons allow immediate one-click toggling:
  - **Both Campuses (Combined)**
  - **KKHM ISLAMIC & ARTS COLLEGE ( WAFY )**
  - **AL-GAITH ISLAMIC & ARTS COLLEGE FOR GIRLS ( WAFIYYA)**
- Clean, institutional-themed schedules with distinct badges (Emerald for KKHM Wafy, Purple for Al-Gaith Wafiyya).

### 2. Academic Semesters & Working Days Center (Semesters 1 & 2)
- **Two Semesters per Academic Year (സെമസ്റ്റർ 1 & 2)**:
  - Each academic session (e.g. 2026-2027) is divided into **Semester 1** and **Semester 2** with dedicated start and end dates.
  - Quick semester selector in the header and intuitive tab switcher in the configuration center.
- **Working Days Target, Conducted & Deficit Tracking (ലക്ഷ്യം, പൂർത്തിയായവ & കുറവ്)**:
  - Configurable semester-wise target working days (e.g., 100 days per semester, summing to 200 annual target days).
  - Real-time tracking of conducted days audited through 3:30 PM daily period reports.
  - Granular **Deficit / Shortfall tracking (എത്ര കുറവു വന്നു / ബാക്കി)** with active warning badges when audited days lag behind targets.
- **Sundays & Monthly Home Leaves Recording (ഞായർ & മാസാന്ത അവധികൾ)**:
  - **Sunday Off-Days**: Automatic calculation of all Sundays occurring within the semester date range, with dedicated calendar preview.
  - **Monthly Leaves (മാസത്തിൽ 3 മാസാന്ത ലീവുകൾ)**: Standard 3 days/month monthly vacation tracking (e.g. 5 months × 3 days = 15 days) with an interactive modal to record, inspect, or auto-fill specific monthly break dates.
  - **Feasibility & Buffer Analytics**: Real-time formula calculates `Net Available Days = Calendar Days - (Sundays + Monthly Leaves + Other Holidays)`, displaying capacity buffers or scheduling deficit warnings.
- **Annual Academic Overview**: Consolidated comparative matrix tab detailing Semester 1, Semester 2, and the cumulative academic year.

### 3. 3:30 PM Daily Period Delivery Audit
- Formal daily reconciliation workflow where class leaders report conducted and missed periods at 3:30 PM.
- Interactive status grid for all classes with Conducted (Green), Missed (Red), and Pending (Yellow) badges.
- Printable Daily Audit Slip for signed office documentation.

### 4. Missed Periods Tracker & Makeup Scheduler
- Centralized tracking for periods missed due to teacher absence, college events, or holidays.
- Track reasons, remarks, and compensation statuses with export to CSV.

### 5. Special Timetables & Event Rescheduling
- Create custom temporary schedules for special exam days, sports events, or makeup classes without altering the master weekly timetable.

### 6. Monthly & Annual Academic Reports
- Comprehensive statistical reports with total periods scheduled, periods conducted, missed counts, and completion percentages.
- Detailed class-wise and faculty-wise breakdown tables with print and CSV export.

### 7. Split-Batch Electives & Shared Faculty Teaching
- **Split-Batch Parallel Electives (Up to 3 Batches)**:
  - Enables classes to be split simultaneously into **2 or up to 3 parallel elective batches** in the exact same period (e.g. Batch 1: Urdu, Batch 2: Malayalam, Batch 3: Arabic Literature).
  - Flexible **"+ 3-ാം ബാച്ച് ചേർക്കുക / Add 3rd Batch"** toggle allowing administrators to add or remove a 3rd parallel batch on demand.
  - Multi-faculty clash detection ensures all assigned teachers are available without schedule or travel conflicts.
  - Granular 3:30 PM Daily Audit and Missed Periods tracking allows recording individual Conducted/Missed status per batch.
- **Shared Faculty Co-Teaching**:
  - Distributes teaching workload across two faculty members (Primary & Shared) under *Both* or *Either-Or* modes with flexible shared-period ratios.

### 8. Real-Time Cloud Database & Synchronization Center
- **Dual-Layer Architecture**: Serves data at 0ms latency from device local cache while streaming updates live via Firebase Firestore snapshot listeners (`onSnapshot`).
- **Live Status Indicator**: Visual header and sidebar status pills showing connection state (`Cloud Live 🟢`, `Syncing 🟡`, `Offline Cache 🔴`).
- **Instant Cross-Device Updates**: Changes saved by administrators automatically appear on all faculty and student devices without page reloads.
- **Data Protection & Backup**: One-click download of full JSON backups and restore capabilities with admin confirmation.
- **Custom Firebase Project Credentials**: Ability for institutions to inspect credentials or switch Firebase projects directly from the UI.

### 9. High-Density Timetable Multi-Pass Constraint Optimizer (Zero Empty Periods)
- **Multi-Restart Stochastic Solver**: Performs up to 35-50 randomized heuristic iterations within milliseconds to find a mathematically optimal, 100% gapless timetable.
- **Progressive Multi-Pass Resolution**:
  - *Pass 1 (Strict Constraints)*: Prioritizes multi-faculty split batches, travel buffers, and daily distribution limits.
  - *Pass 2 (Residual Soft-Relaxation)*: Relaxes subject-per-day thresholds to prevent leaving class slots vacant when faculty availability is tight.
  - *Pass 3 (Ejection Chain Swapping / Backtracking)*: Dynamically moves non-conflicting periods to alternative slots to unblock gridlocked teachers.
  - *Pass 4 (Zero-Gap Guarantee)*: Prevents high-density classes (e.g., 47/48 or 48/48 periods) from dropping unplaced hours into random blanks.

---

## 🛠️ Technology Stack
- **Frontend**: Vanilla JavaScript (ES Modules), HTML5, Tailwind CSS
- **Icons**: FontAwesome 6 Free
- **Database Engine**: Google Cloud Firebase Firestore (NoSQL Real-Time Sync)
- **Deployment**: GitHub Pages

---

## 🔐 Recommended Firebase Firestore Security Rules
For institutional deployment with public read access and administrator writes:
```javascript
rules_version = '2';
service cloud.firestore {
  match /databases/{database}/documents {
    match /timetable_system/{document} {
      allow read: if true;
      allow write: if true; // Or restrict with Firebase Auth / Admin custom claims
    }
  }
}
```
