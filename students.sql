-- Create students table
CREATE TABLE students (
    id INTEGER PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL,
    age INTEGER,
    city VARCHAR(255)
);

-- Insert students
INSERT INTO students (name, age, city) VALUES ('John', 20, 'New York');
INSERT INTO students (name, age, city) VALUES ('Sarah', 22, 'Boston');

-- Update Sarah's age to 23
UPDATE students SET age = 23 WHERE name = 'Sarah';

-- Query to get all students older than 21
SELECT * FROM students WHERE age > 21;

-- Query to count students from each city
SELECT city, COUNT(*) AS student_count FROM students GROUP BY city;

-- Query to get student names in alphabetical order
SELECT name FROM students ORDER BY name;