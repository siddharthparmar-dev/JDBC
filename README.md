
# JDBC (Java Database Connectivity)

A beginner-friendly repository demonstrating the fundamentals of JDBC with MySQL. This repository contains examples of database connectivity, CRUD operations, PreparedStatement, ResultSet, Batch Updates, and utility classes.

---

## 📌 About

JDBC (Java Database Connectivity) is a Java API that allows Java applications to communicate with relational databases.

This project covers the complete JDBC workflow:

Java Application
↓
JDBC API
↓
MySQL JDBC Driver
↓
MySQL Database

---

## 🚀 Technologies Used

- Java
- JDBC
- MySQL
- MySQL Connector/J
- IntelliJ IDEA

---

## 📂 Topics Covered

### ✅ JDBC Basics

- Loading JDBC Driver
- Establishing Database Connection
- DriverManager
- Connection Interface
- Statement Interface

### ✅ CRUD Operations

- Insert Records
- Update Records
- Delete Records
- Select Records

### ✅ ResultSet

- Retrieving Data
- Iterating using `next()`
- Accessing data using Column Index
- Accessing data using Column Name

### ✅ PreparedStatement

- Parameterized Queries
- SQL Injection Prevention
- Insert
- Update
- Delete

### ✅ Batch Update

- Executing Multiple Queries Together
- Improving Database Performance

### ✅ Utility Class

- Reusable Database Connection Utility

---

## 📁 Project Structure

```
src/
└── com/JdbcLearning
    ├── JdbcClassForName.java
    ├── JdbcDbConnection.java
    ├── JdbcInsertData.java
    ├── JdbcExecute.java
    ├── JdbcResultSet.java
    ├── JDBCPreparedStatement.java
    ├── JDBCPreparedStatement2.java
    ├── JDBCPreparedStatement3.java
    ├── JDBCBatchUpdate.java
    └── JdbcUtil.java
```

---

## 📖 Concepts Learned

- JDBC Architecture
- JDBC Driver
- DriverManager
- Connection
- Statement
- PreparedStatement
- ResultSet
- Batch Processing
- Exception Handling
- Resource Management

---

## 🛠 Prerequisites

- Java JDK 17+
- MySQL Server
- MySQL Connector/J
- IntelliJ IDEA (or any Java IDE)

---

## ⚙️ Setup

1. Clone the repository

```bash
git clone https://github.com/siddharthparmar-dev/JDBC.git
```

2. Open the project in IntelliJ IDEA.

3. Add the MySQL Connector/J library (if not using Maven).

4. Create a MySQL database.

5. Update the database credentials in the source code.

6. Run the desired Java file.

---

## 📚 Learning Outcome

After completing this project, I gained hands-on experience with:

- Connecting Java applications to MySQL
- Executing SQL queries using JDBC
- Performing CRUD operations
- Using PreparedStatement for secure SQL execution
- Processing query results with ResultSet
- Performing Batch Updates for better performance
- Managing database resources effectively

---

## 🔜 Next Learning

- Hibernate
- JPA
- Spring Data JPA
- Spring Boot

---

## 👨‍💻 Author

**Siddharth Parmar**

- GitHub: https://github.com/siddharthparmar-dev
- LinkedIn: https://www.linkedin.com/in/siddharth-parmar-34a449370

---

⭐ If you found this repository helpful, consider giving it a star.
