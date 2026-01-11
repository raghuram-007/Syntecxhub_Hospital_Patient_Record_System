

# 🏥 Hospital Patient Record System (Java + JDBC)

A **console-based Hospital Patient Record Management System** developed using **Core Java, JDBC, and MySQL**.
This project allows hospitals to **manage patient details**, **update medical history**, and **store all data securely**.

---

## 📌 Project Overview

The Hospital Patient Record System is designed to:

* Add new patients with complete information
* Update patient medical history
* View all patient details
* Ensure secure database operations using JDBC
* Maintain a simple and clear console interface

This project is part of an **internship / academic project** to demonstrate **Java CRUD operations with MySQL integration**.

---

## 🛠️ Technologies Used

* ☕ **Java (Core Java)**
* 🔗 **JDBC (Java Database Connectivity)**
* 🗄️ **MySQL**
* 🧰 **MySQL Workbench**
* 💻 **VS Code / IntelliJ / Eclipse**

---

## ✨ Features

* ➕ Add new patients
* 👀 View patient records
* 📝 Update patient medical history
* 🔐 Secure database operations using `PreparedStatement`
* ⚠️ Proper exception handling for reliability

---

## 🗃️ Database Design

### 📂 Database: `hospital_db`

#### 🧾 Patients Table

| Column          | Type                              |
| --------------- | --------------------------------- |
| patient_id      | INT (Primary Key, Auto Increment) |
| name            | VARCHAR(100)                      |
| age             | INT                               |
| gender          | VARCHAR(10)                       |
| contact         | VARCHAR(15)                       |
| medical_history | TEXT                              |

---

## 📁 Project Structure

```
Hospital_Patient_Record_System/
│
├── Main.java
├── PatientDAO.java
├── Patient.java
├── DBConnection.java
├── README.md
└── lib/
    └── mysql-connector-j.jar
```

---

## ▶️ How to Run the Project

1️⃣ Clone the repository

```bash
git clone https://github.com/your-username/Hospital-Patient-Record-System.git
```

2️⃣ Import the project into your IDE

3️⃣ Create the database using `hospital_db.sql` or manually in MySQL

4️⃣ Update database credentials in `DBConnection.java`

5️⃣ Compile and run:

```bash
javac *.java
java Main
```

---

## 📸 Sample Console Output

```
1. Add Patient
2. View Patients
3. Update Medical History
4. Exit
Choice: 1
Name: Arun
Age: 30
Gender: Male
Contact: 9876543210
Medical History: Diabetes
✅ Patient Added Successfully
```

---

## 🎯 Learning Outcomes

* Strong understanding of JDBC
* CRUD operations in Java
* Database integration using MySQL
* Secure SQL handling with `PreparedStatement`
* Console-based UI for real-world applications

---

## 🚀 Future Enhancements

* 🖥️ GUI using JavaFX or Swing
* 📤 Export patient records (PDF / Excel)
* 🔐 Role-based access control
* 🩺 Appointment scheduling and tracking

---

## 👨‍💻 Author

**Raghuram S**
Java Developer Intern


---

## 📜 License

This project is for **educational and internship purposes only**.

---

If you want, bro, I can **also make a full LinkedIn post for this project** ready to publish ✅
Do you want me to do that next?
