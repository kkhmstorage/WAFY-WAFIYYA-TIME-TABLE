# CO-ORDINATED ACADEMIC TIMETABLE & AUDIT PORTAL
## KKHM ISLAMIC & ARTS COLLEGE ( WAFY ) & AL-GAITH ISLAMIC & ARTS COLLEGE FOR GIRLS ( WAFIYYA)

A modern, institutional-grade academic scheduling, period delivery auditing, and faculty coordination portal built specifically for:
- **KKHM ISLAMIC & ARTS COLLEGE ( WAFY )** [Boys Campus]
- **AL-GAITH ISLAMIC & ARTS COLLEGE FOR GIRLS ( WAFIYYA)** [Girls Campus]

---

## 🔒 Role-Based Access Control & Dual Institution Administrators

### 1. Dual Campus Administrator Accounts (Full Global Access)
Two dedicated administrator credentials are provided for both institutions, with both holding overall administrative power across all sections and data:

| Institution | Username | Password | Role & Authority |
|---|---|---|---|
| **KKHM ISLAMIC & ARTS COLLEGE ( WAFY )** | `admin_kkhm` | `kkhmadmin123` | **KKHM Campus Administrator** (Full overall access across both colleges) |
| **AL-GAITH ISLAMIC & ARTS COLLEGE FOR GIRLS ( WAFIYYA)** | `admin_algaith` | `algaithadmin123` | **Al-Gaith Campus Administrator** (Full overall access across both colleges) |
| **General Administration** | `admin` | `kkhmadmin123` | **Super Administrator** (Universal access fallback) |

- **One-Click Quick Fill**: In the Admin Login dialog, administrators can click either campus badge to automatically populate their username and password.
- **Full Privileges**: Either administrator can configure academic working days, add/edit/delete faculty, adjust timetable allocations, generate master schedules, record and approve daily 3:30 PM audits, and sync changes with the cloud.

---

### 2. Public Inspection Mode (View & Inspect Everything, Edit Restricted)
In accordance with institutional guidelines:
- **Full Visibility & Navigation**: Everyone (teachers, students, class leaders, public visitors) can freely view and inspect **all 8 portal sections**:
  1. **Schedule & Timetable**: View Today's schedule, college-wise schedules, class-wise schedules, faculty schedules, and master matrix.
  2. **3:30 PM Daily Period Audit**: Inspect date-wise daily audits, review conducted/missed periods, and print daily audit slips.
  3. **Missed Periods Tracker**: Inspect missed period logs, filter by date/teacher/class, and export CSV.
  4. **Special Timetable**: Inspect special exam/event timetables and print custom schedules.
  5. **Academic Reports**: Inspect monthly summaries, annual working day statistics, and department completion rates.
  6. **Config & Working Days**: Inspect total working days, periods per day, and period timings in read-only mode.
  7. **Faculty & Codes**: Inspect faculty roster, teacher codes, subject specializations, and day constraints.
  8. **Subject Allocations**: Inspect weekly hours and teacher allotments for every class across both colleges.
- **Strict Modification Protection**: Adding, editing, deleting, generating schedules, resetting data, and saving daily audits are securely reserved for logged-in Administrators. Public visitors see clear "Public Inspection Mode" notices and disabled edit controls.

---

## 🌟 Key Features & Capabilities

### 1. Separate & Combined College Timetables
- Under **Schedule & Timetable > By College**, dedicated switcher buttons allow immediate one-click toggling:
  - **Both Campuses (Combined)**
  - **KKHM ISLAMIC & ARTS COLLEGE ( WAFY )**
  - **AL-GAITH ISLAMIC & ARTS COLLEGE FOR GIRLS ( WAFIYYA)**
- Clean, institutional-themed schedules with distinct badges (Emerald for KKHM Wafy, Purple for Al-Gaith Wafiyya).

### 2. Total Working Days Target & Progress
- Configurable annual working days target (default: 200 days) displayed prominently in the sidebar widget and header.
- Real-time tracking of conducted days, remaining days, and progress percentage.

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

---

## 🛠️ Technology Stack
- **Frontend**: Vanilla JavaScript (ES Modules), HTML5, Tailwind CSS
- **Icons**: FontAwesome 6 Free
- **Database**: Google Cloud Firebase Firestore
- **Deployment**: GitHub Pages
