# Student Management System (Console Version)

A simple console-based Student Management System written in Java.

This project demonstrates core Java concepts including OOP, exception handling, collections, and basic layered architecture.

---

## 🚀 Features

- Add a new student
- View all students
- Find a student by ID
- Delete a student by ID
- Exception handling for invalid operations

---

## 🏗 Architecture

The project follows a simple layered design:

- **Main.java** → Handles user interaction (Controller layer)
- **StudentService.java** → Business logic layer
- **Student.java** → Model class representing student entity

Data is stored in memory using `ArrayList`.

---

## 🧠 Concepts Used

- Object-Oriented Programming (Encapsulation)
- Method Overriding (`toString()`)
- Exception Handling (`RuntimeException`)
- Java Collections (`ArrayList`)
- Lambda Expressions (`removeIf`)
- Scanner for console input

---

## 📂 Project Structure

```
console-version/
├── Main.java
├── Student.java
├── StudentService.java
└── README.md
```

---

## 📊 Student Fields

| Field      | Type   | Description          |
|------------|--------|----------------------|
| ID         | int    | Unique student ID    |
| Name       | String | Student's full name  |
| Department | String | Student's department |
| CGPA       | double | Student's CGPA       |

---

## ▶ How to Run

1. Compile all Java files:

   ```bash
   javac *.java
   ```

2. Run the application:

   ```bash
   java Main
   ```

---

## ⚠ Limitations

- Data is stored in memory and does not persist after the program exits.
- No input validation for non-numeric input.

---

## 🔮 Future Improvements

- Add file-based persistence
- Integrate database using JDBC
- Convert to Spring Boot REST API
