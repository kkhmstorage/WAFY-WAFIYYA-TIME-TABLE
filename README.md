# WAFY & WAFIYYA TIME TABLE
## Coordinated Multi-Campus Academic Scheduling, Daily Audit & Faculty Allocation Portal

A modern, institutional-grade web application tailored for dual-campus Islamic & Arts Colleges (Wafy & Wafiyya streams). Designed for smooth cross-campus faculty scheduling, daily 3:30 PM period delivery auditing, missed period tracking, special make-up timetables, and comprehensive academic performance reports.

---

## 🌟 Key Features & Capabilities

### 1. 100% English Academic Interface
- Full application interface, navigation, badges, audit forms, reports, dialogs, and tables are presented in clean, modern English.

### 2. Dedicated College-Wise Timetable View
- Dedicated **"By College"** timetable mode allowing instant viewing and printing of campus-specific schedules:
  - **Wafy Campus**: Prep, Thanawiyya, and higher classes with period timings and faculty assignments.
  - **Wafiyya Campus**: Prep, Thanawiyya, and higher classes with period timings and faculty assignments.
  - **All Campuses (Combined)**: Complete institutional master view with separated campus blocks.
- One-click print noticeboard layout formatted for campus bulletin boards.

### 3. Today's Live Schedule Default Landing View
- Upon opening the application, the first interface immediately shows **Today's Active Schedule**.
- Automatically detects special schedules, day swaps, or holidays.
- Live period status indicator (**Ongoing Now**, Completed, Upcoming) based on current real-time clock.
- Campus filter (Wafy, Wafiyya, or All) to view today's active classes.

### 4. Total Working Days Target & Progress Tracking
- Institutional configuration for academic year working days (e.g., 200 days).
- Real-time progress bar displayed on sidebar and setup pages showing:
  - Total Target Working Days
  - Conducted Working Days (audited)
  - Remaining Academic Days

### 5. Daily 3:30 PM Period Delivery Audit (Class Leader Reporting)
- At 3:30 PM every afternoon, class representatives/leaders report to the administrative office to record conducted vs missed periods.
- Period-by-period status: **Conducted** or **Missed**.
- If missed, category selection:
  - *Teacher on Leave*
  - *College Event / Program*
  - *Special Prayer / Assembly*
  - *Examination / Test*
  - *Weather / Hartal / Emergency*
  - *Other Reason* (with custom remarks).
- Digital signature recording (Class Leader name and timestamp).
- Visual status grid indicating which classes have submitted and which are pending.

### 6. Missed Periods Tracker & Compensation Hub
- Centralized tracking ledger for all missed lectures across the academic year.
- Filter by Class, Faculty Member, and Status (**Pending** vs **Compensated**).
- One-click action to schedule make-up lectures directly into a Special Timetable.
- Export missed period ledger to CSV for administrative reviews.

### 7. Special Timetable Engine (Date-Specific Swaps & Custom Schedules)
- Schedule special timetables for any given calendar date without affecting the regular weekly schedule:
  - **Day Swap**: Follows another weekday's timetable (e.g., Wednesday follows a Friday timetable).
  - **Custom Make-up Schedule**: Build custom class periods and import pending missed periods with one click.
- Automatic activation: When the calendar reaches the selected date, Today's Timetable automatically switches to the special timetable.

### 8. Monthly & Annual Academic Audit Reports
- Institutional performance summaries for academic leadership:
  - Total Scheduled vs Conducted vs Missed periods
  - Syllabus Delivery Rate percentage
  - Class-wise performance table
  - Faculty workload and delivery audit table
  - Detailed missed period ledger
- Print-ready format with official signature fields (Class Leader, Academic In-Charge, Principal).
- One-click CSV export for external archiving and spreadsheet analysis.

### 9. Smart Multi-Campus Timetable Generation Algorithm
- Automated scheduling engine with intelligent constraint satisfaction:
  - **Travel Buffer**: Prevents scheduling the same teacher back-to-back across different campuses without travel time.
  - **Teacher Busy Protection**: Eliminates double-booking of shared faculty across campuses.
  - **Day & Period Blocking**: Teachers can specify restricted times or days.
  - **Soft Limits**: Distributes daily subject hours evenly across the week.

### 10. Multi-Year Support & Cloud Synchronization
- Academic year switching (e.g., `2026-2027`, `2025-2026`).
- Automatic real-time persistence to Google Firebase Cloud Firestore (`timetable_system` collection) with local storage backup.

---

## 💻 Tech Stack
- **Frontend**: Vanilla HTML5, Modern ECMAScript (ES Modules), Tailwind CSS, FontAwesome 6, Google Fonts (Inter).
- **Backend / Database**: Google Firebase Cloud Firestore v11.6.1 (NoSQL real-time cloud database).
- **Architecture**: Single-Page Application (SPA) designed for rapid loading, offline resiliency, and responsive mobile-to-desktop responsiveness.

---

## 🚀 Getting Started

1. Open `index.html` in any modern web browser (Google Chrome, Firefox, Microsoft Edge, Safari).
2. Default public view allows exploring **Today's Live Schedule**, **By College**, **By Class**, and **By Teacher** timetables.
3. For administrative access (generating schedules, auditing, configuring academic years):
   - Click the **Admin** button in the header.
   - Default credentials:
     - Username: `admin`
     - Password: `kkhmadmin123`
