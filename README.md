# WAFY & WAFIYYA TIME TABLE

Coordinated Multi-College Academic Timetable & Faculty Management System for Wafy & Wafiyya Institutions.

## 🚀 Key Features

### 1. Admin Authentication & Role Protection (അഡ്മിൻ സുരക്ഷ)
- **Public View (Teachers & Students)**: View-only access to Teacher Timetables, Class Timetables, and Master Timetables. Printing and CSV export available. No editing or configuration tools are accessible.
- **Admin Access**:
  - Secure Login with Username and Password.
  - **Default Credentials**:
    - **Username**: `admin`
    - **Password**: `kkhmadmin123`
  - Admin Mode unlocks: Academic Configuration, Period Timings setup, Faculty registration & Short Names, Subject Allotments, In-place Editing, Schedule Generation, and Cloud Database Saving.
  - Custom Admin Password change option.

### 2. Period Timings (പിരീഡ് സമയങ്ങൾ)
- Each period displays its custom start and end time (e.g., `09:00 - 09:45`, `09:45 - 10:30`).
- Configurable per period in the Admin Configuration tab.
- Automatically included in Teacher Slips, Classroom Noticeboard sheets, and College Master prints.

### 3. Public Sharing (ഷെയർ ചെയ്യാനുള്ള ലിങ്ക്)
- One-click shareable Web URL:  
  **`https://kkhmstorage.github.io/WAFY-WAFIYYA-TIME-TABLE/`**
- Includes direct **"Share via WhatsApp"** button.

#### How to Enable GitHub Pages (1 minute setup):
1. Open your GitHub Repository: [https://github.com/kkhmstorage/WAFY-WAFIYYA-TIME-TABLE](https://github.com/kkhmstorage/WAFY-WAFIYYA-TIME-TABLE)
2. Click **Settings** (tab at the top).
3. In the left sidebar, click **Pages**.
4. Under **Build and deployment** -> **Branch**, select **`main`** and click **Save**.
5. Within 1 minute, your site will be live at: `https://kkhmstorage.github.io/WAFY-WAFIYYA-TIME-TABLE/`!

### 4. Multi-Academic Year Archive (അധ്യയന വർഷങ്ങൾ)
- Switch between academic years (e.g. `2024-2025`, `2025-2026`, `2026-2027`) anytime.
- Previous years' records remain preserved and viewable at any time.

### 5. 3-Way View & Print Engine
- 👨‍🏫 **By Teacher**: Weekly schedule per faculty with personalized print slips.
- 🏫 **By Class**: Classroom noticeboard schedule with subject and faculty short codes.
- 🏛️ **By College / Master**: Complete master timetable for Wafy, Wafiyya, or Combined.

### 6. Cloud Database (Firebase Firestore)
- Real-time sync across all devices via Firestore.
- Offline cache ensures zero downtime if internet is interrupted.
