# WAFY & WAFIYYA TIME TABLE

Coordinated Smart Timetable & Faculty Clash Management System for Wafy & Wafiyya Institutions.

## 🚀 Features
- **Two-Institution Support**: Seamlessly schedule across Wafy and Wafiyya campuses.
- **Intelligent Anti-Clash Engine**: Zero faculty double-booking across institutions.
- **Travel Buffer**: Automatic travel buffer prevention so teachers aren't assigned back-to-back periods across campuses.
- **Custom Availability Constraints**: Easily block specific days/periods per faculty member.
- **Cloud Database (Firebase Firestore)**:
  - Real-time cloud sync across devices (mobile, tablet, desktop).
  - Hosted under the KKHM project (`kkhm-islamic-and-arts-college`).
  - Isolated database collection: `timetable_system/wafy_wafiyya`.
  - Offline cache fallback for seamless use without an active internet connection.
- **Multiple View Modes**:
  - Combined View (Wafy & Wafiyya side-by-side)
  - Wafy Only
  - Wafiyya Only
  - By Teacher View
- **Export & Print**:
  - Direct print-ready academic layout
  - Export to CSV format

## 🗄️ Database Architecture
- **Provider**: Google Cloud Firebase Firestore
- **Project**: `kkhm-islamic-and-arts-college`
- **Collection / Document**: `timetable_system/wafy_wafiyya`
- **Schema**:
  - `institutions`: Array of institution names (e.g. `["Wafy", "Wafiyya"]`)
  - `days`: Number of working days (e.g. `5` or `6`)
  - `periods`: Number of periods per day (e.g. `6`)
  - `enableTravelBuffer`: Boolean flag for campus transit prevention
  - `teachers`: Array of registered faculty with their unavailability constraints
  - `classes`: Array of subject allocations with hours and assigned faculty
  - `timetable`: 3D schedule matrix `[day][period][institution]`
  - `lastUpdated`: Cloud server timestamp

## 💻 Quick Start
Simply open `index.html` in any modern web browser or host it via GitHub Pages.
