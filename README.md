# WAFY & WAFIYYA TIME TABLE

Coordinated Smart Multi-College Timetable & Faculty Management System for Wafy & Wafiyya Institutions.

## 🚀 Key Features

### 1. Multi-Academic Year Archive (അധ്യയന വർഷങ്ങൾ)
- Easily manage separate timetables for each academic year (e.g. `2024-2025`, `2025-2026`, `2026-2027`).
- Create new academic years with a single click.
- Switch between years instantly to review past records, make edits, or print archives.

### 2. Faculty Management & Short Codes (അധ്യാപകരും ഷോർട്ട് കോഡുകളും)
- Register faculty member's full name along with a compact Short Name (e.g., `AR` for Usthad Abdul Rahman).
- Short codes are displayed in compact timetable cells and print slips for neat visual layout.
- Configure customized day/period unavailability constraints per faculty.

### 3. Subject Allocations & In-Place Editing (വിഷയങ്ങളും എഡിറ്റ് സൗകര്യവും)
- Flexible data entry: College (`Wafy` / `Wafiyya`), Class/Batch, Subject, Faculty, and Total Periods per week.
- **Full Edit Facility**: Modify the assigned teacher, period count, subject, or class directly via an Edit Modal.
- Live cloud persistence on every modification.

### 4. 3-Way View & Print Engine (ടൈംടേബിൾ വ്യൂ & പ്രിന്റ് ഓപ്ഷനുകൾ)
- 👨‍🏫 **By Teacher (അധ്യാപകരുടെ ടൈംടേബിൾ)**:
  - View individual faculty member's weekly periods across both campuses.
  - Print individual faculty schedule slips.
- 🏫 **By Class (ക്ലാസുകളുടെ ടൈംടേബിൾ)**:
  - View full weekly timetable for any batch/class with subject and teacher short code.
  - Print classroom noticeboard timetables.
- 🏛️ **By College / Master (കോളേജ് മാസ്റ്റർ ടൈംടേബിൾ)**:
  - Comprehensive master view for Wafy, Wafiyya, or Combined institutions.
  - Master institution print format.

### 5. Multi-Class Anti-Clash Scheduling Logic
- Guarantees zero simultaneous double-booking across classes or colleges.
- Automatic campus travel buffer prevents back-to-back periods across different institutions.
- Balanced distribution of subjects across weekdays.

### 6. Cloud Database (Firebase Firestore)
- Real-time cloud sync across desktop, tablet, and mobile devices.
- Stored under `timetable_system` in the `kkhm-islamic-and-arts-college` Firebase project.
- Complete offline fallback with LocalStorage caching.

## 💻 Quick Start
Open `index.html` in any modern web browser or host on GitHub Pages.
