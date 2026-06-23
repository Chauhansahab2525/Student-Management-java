# Student Result Management System

A console-based Java application to manage student records with MySQL database integration using JDBC.

## Features
- Add students and store records in MySQL database
- Auto-calculate grades (A/B/C/F)
- View all students from database
- Search student by ID
- Topper detection with Scholarship Award (marks >= 90)
- Inheritance & Polymorphism using TopperStudent class
- Persistent data storage using JDBC and MySQL

## Tech Stack
- Java 17
- MySQL 8
- JDBC (MySQL Connector/J)
- IntelliJ IDEA
- Git & GitHub

## Concepts Used
- Class & Object
- Constructor
- Encapsulation
- Inheritance
- Polymorphism
- Method Overriding
- JDBC Connectivity
- PreparedStatement
- ResultSet
- Exception Handling
- MySQL Database Operations (CRUD)

## Database Schema

Database: `studentdb`

Table: `students`

| Column | Type            |
|--------|------ ----------|
| id     | INT PRIMARY KEY |
| name   | VARCHAR(50)     |
| marks  | INT             |
| grade  | VARCHAR(2)      |

## How to Run

1. Clone the repository:

git clone https://github.com/Chauhansahab2525/Student-Management-java.git


2. Open the project in IntelliJ IDEA.

3. Add MySQL Connector/J dependency.

4. Create database:

CREATE DATABASE studentdb;
USE studentdb;

CREATE TABLE students (
    id INT PRIMARY KEY,
    name VARCHAR(50),
    marks INT,
    grade VARCHAR(2)
);


5. Update database credentials inside:

DatabaseConnection.java


6. Run:

Main.java


## Sample Output

=== Student Result Management System ===
1. Add Student
2. View All Students
3. Search Student by ID
4. Exit


## Author

Adarsh Chauhan
B.Tech CSE | Java Developer
