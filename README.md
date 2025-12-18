# Java Development Internship Test

This repository contains solutions to various programming tasks as part of a Java Development Internship Test. The project includes SQL database operations and Java programs demonstrating basic programming concepts.

## Files

### students.sql
- **Description**: SQL script for managing a students database table.
- **Features**:
  - Creates a `students` table with columns: id (primary key, auto-increment), name (not null), age, city.
  - Inserts sample data for two students: John (20, New York) and Sarah (22, Boston).
  - Updates Sarah's age to 23.
  - Includes queries to:
    - Select students older than 21.
    - Count students per city.
    - Select student names in alphabetical order.
- **How to run**: Execute the script in a MySQL, PostgreSQL, or similar database. The statements are in order: CREATE, INSERT, UPDATE, SELECT queries.

### ProgrammingSection.java
- **Description**: Java class containing two programs: a basic calculator and a student grades calculator.
- **Features**:
  - **Calculator**: Methods for add, subtract, multiply, divide (handles division by zero).
  - **Student Grades**: Takes 3 exam scores as input, calculates average, and assigns grade (A >=90, B>=80, C>=70, D>=60, F otherwise).
- **How to run**:
  1. Compile: `javac ProgrammingSection.java`
  2. Run: `java ProgrammingSection`
  - The calculator runs automatically with test cases.
  - Then prompts for student grades input.

### ShoppingCart.java
- **Description**: Java class implementing a simple shopping cart.
- **Features**:
  - Add items with name and price.
  - Remove items by name.
  - Calculate total price.
  - Apply 10% discount if total > $100.
  - Display items in cart.
- **How to run**:
  1. Compile: `javac ShoppingCart.java`
  2. Run: `java ShoppingCart`
  - Demonstrates adding items, calculating totals, applying discounts, and removing items.

### NumberGuessingGame.java
- **Description**: Java program for a number guessing game.
- **Features**:
  - Computer picks a random number between 1 and 10.
  - User has 3 attempts to guess.
  - Provides hints: "Too high" or "Too low".
  - Shows win/lose result.
- **How to run**:
  1. Compile: `javac NumberGuessingGame.java`
  2. Run: `java NumberGuessingGame`
  - Follow prompts to enter guesses.

## Prerequisites
- **Java**: JDK 17 or later installed.
- **Database**: For `students.sql`, a SQL database like MySQL or PostgreSQL.
- **Git**: For version control.

## How to Clone and Run
1. Clone the repository: `git clone https://github.com/mathew512/java-development-internship.git`
2. Navigate to the folder: `cd java-development-internship`
3. For Java files: Compile and run as described above.
4. For SQL: Run `students.sql` in your database client.

## Author
- Mathew (mathewkasnga59@gmail.com)

## Repository
- [GitHub Link](https://github.com/mathew512/java-development-internship)