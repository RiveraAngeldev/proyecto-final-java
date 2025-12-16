# 🧮 CPEN 358 – Final Project: Rainfall Analysis

**Department of Engineering, Design and Architecture**  
**Universidad Ana G. Méndez – Gurabo Campus**  
**Due Date:** Tuesday, December 16th, 2025 @ 11:59 PM  

---

## 👥 Students
**Partner 1:** (S01583071) Angel Rivera Merly

**Partner 2:** (S01556281) Christopher J. Martinez

---

## 📘 Project Description

This repository contains the final programming project for the course **CPEN 358 – Object Oriented Programming**.  

The goal is to apply **Java OOP concepts** to design, implement, and test a **Rainfall Analysis System**.  
The system stores rainfall data (in inches) for **imaginary years 2022, 2023, and 2024**, across all **12 months**.  

The Rainfall class uses a **2D array of doubles** as a data field and provides methods to calculate:

- Total rainfall inches per year  
- Average rainfall per month for all years  
- Total rainfall for a specific year chosen by the user  
- Year with the most rain  
- Year with the least rain  
- Month with the most rain in a specific year (month + inches)  
- Month with the least rain in a specific year (month + inches)  
- Display rainfall data in tabular format  

---

## 🧩 Class Design

### **Rainfall Class**
**Attributes:**
- `double[][] rainfall` → stores rainfall data  
- `int[] years` → stores years 2022–2024  
- `String[] months` → stores month names  

**Methods:**
- `displayYearData(int year)`  
- `getYearIndex(int year)`  
- `viewTotals()`  
- `viewYearPeaks()`  
- `displayDataTable()`  

The UML diagram and method flowcharts are included in the written report.

---

## 🖥️ Program Execution

The project includes a **driver program (`Main.java`)** that demonstrates the Rainfall class.  
Users can:
- Select a year to display totals and extremes  
- View total and average rainfall  
- Identify year/month with most and least rainfall  
- Display a formatted table of all rainfall data  

---

## 📁 Project Files

- `Rainfall.java` → Rainfall class  
- `Main.java` → Driver program  
- `README.md` → Project overview and documentation  

---