# CO-ORDINATED ACADEMIC TIMETABLE & AUDIT PORTAL
## KKHM ISLAMIC & ARTS COLLEGE ( WAFY ) & AL-GAITH ISLAMIC & ARTS COLLEGE FOR GIRLS ( WAFIYYA)

A modern, institutional-grade academic scheduling, period delivery auditing, and faculty coordination portal built specifically for:
- **KKHM ISLAMIC & ARTS COLLEGE ( WAFY )** [Boys Campus]
- **AL-GAITH ISLAMIC & ARTS COLLEGE FOR GIRLS ( WAFIYYA)** [Girls Campus]

---

## 🔒 Role-Based Access Control (Admin-Only Modifications & Public Read-Only Inspection)

As strictly configured:
- **Public Viewers (Students, Teachers, Class Leaders, Visitors)**:
  - **Read-Only Access**: View live schedules, explore campus timetables, check faculty assignments, inspect daily 3:30 PM period audit statuses, view missed period ledgers, and view/print monthly & annual academic performance reports.
  - **Strictly Protected**: Cannot add, modify, or delete any data. Add/Edit/Delete buttons, timetable generation algorithms, and audit submission actions are hidden or disabled for non-authenticated users.
- **Administrators**:
  - Full authenticated access via the **Admin Login** button (Username: `admin`, Password: `kkhmadmin123`).
  - Permissions: Add/Edit/Delete Faculty and time-off constraints, Add/Edit/Delete Subject Allotments, Generate Timetables, Schedule Date-specific Special Timetables, Record/Approve daily 3:30 PM Period Audits, and configure Academic Years & Working Days.

---

## 🌟 Key Features & Capabilities

### 1. Separate Timetables for Both Institutions
- **KKHM ISLAMIC & ARTS COLLEGE ( WAFY )**:
  - Dedicated weekly timetable for all Wafy batches (Wafy Prep, Wafy Thanawiyya, etc.).
  - Emerald / Teal institutional theme with period timings and faculty assignments.
  - One-click **Print Noticeboard** button formatted for campus bulletin boards.
- **AL-GAITH ISLAMIC & ARTS COLLEGE FOR GIRLS ( WAFIYYA)**:
  - Dedicated weekly timetable for all Wafiyya batches (Wafiyya Prep, Wafiyya Thanawiyya, etc.).
  - Purple / Indigo institutional theme with period timings and faculty assignments.
  - One-click **Print Noticeboard** button formatted for campus bulletin boards.
- **Combined Institutional View (Both Campuses)**:
  - Side-by-side / stacked view for academic leadership and shared faculty.

### 2. Today's Live Active Schedule (Default Landing Screen)
- Automatically opens to Today's schedule upon app launch.
- Live clock indicator (**Ongoing Now**, Completed, Upcoming) based on real-time period timings.
- Filter by Institution (`KKHM Wafy`, `AL-GAITH Wafiyya`, or `All`) and Class.

### 3. Total Working Days Configuration & Progress Bar
- Institutional configuration for academic year working days (e.g., 200 days).
- Real-time progress bar displayed on the sidebar and setup pages tracking Conducted vs Remaining working days.

### 4. Daily 3:30 PM Period Audit System
- Daily 3:30 PM accounting of conducted and missed lectures.
- Public inspection mode allows viewing class submission status.
- Admin-authenticated recording of period statuses (Conducted vs Missed) with categorized reasons (*Teacher on Leave*, *College Event*, *Special Prayer*, *Examination*, *Weather / Hartal*, *Other*).
- Printable daily audit slips for administrative records.

### 5. Missed Periods Tracker & Action Center
- Real-time ledger of unconducted lectures across both institutions.
- Search and filter by Institution, Class, Faculty Member, and Status (*Pending* vs *Compensated*).
- One-click action for Admins to schedule make-up lectures directly into a Special Timetable.
- CSV export for academic reviews.

### 6. Special Timetable Engine (Date-Specific Swaps & Make-ups)
- Schedule date-specific timetables without altering the regular master schedule:
  - **Day Swap**: Follows another weekday's timetable.
  - **Custom Make-up**: Configure custom class lectures or import missed periods.

### 7. Monthly & Annual Academic Audit Reports
- Executive performance reporting for leadership and inspection bodies:
  - Total Scheduled vs Conducted vs Missed periods
  - Syllabus Delivery Rate percentage
  - Institutional Performance breakdown
  - Faculty workload delivery ledger
  - Official signature lines for Class Leader, Academic In-Charge, and Principal / Dean.
  - Print-ready format and CSV export.

---

## 💻 Technical Architecture
- **Language**: 100% Modern English.
- **Frontend**: HTML5, Vanilla JavaScript (ES Modules), Tailwind CSS, FontAwesome 6, Google Fonts (Inter).
- **Cloud Database**: Google Firebase Cloud Firestore v11.6.1 (`timetable_system` collection).
- **Local Fallback**: LocalStorage caching for offline resilience.

---

## 🚀 Getting Started

1. Open `index.html` in any modern web browser.
2. By default, the application is in **Public Viewer (Read-Only)** mode.
3. To access administrative controls:
   - Click **Admin Login** in the top navigation bar.
   - Username: `admin`
   - Password: `kkhmadmin123`
