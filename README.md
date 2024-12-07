# Student Analysis Application

This project is a simple **Java-based application** for managing and analyzing student data. It includes functionalities to calculate the maximum, minimum, and average scores of a student across different subjects, with comprehensive unit tests.

---

## Features

- **Student Data Management**:
  - Manage student IDs and subject scores (English, Irish, and Maths).
  - Calculate maximum, minimum, and average scores.

- **Methods**:
  - `getMax()`: Returns the highest score among the three subjects.
  - `getMin()`: Returns the lowest score among the three subjects.
  - `average()`: Calculates the average score (rounded up to the nearest integer).
  - `getID()`: Retrieves the student's ID.
  - `setID()`: Updates the student's ID.

- **Unit Testing**:
  - Includes unit tests using JUnit for each method.
  - Parameterized tests for testing multiple datasets.

---

## Project Structure
```bash
src/
├── Student.java # Main class for managing student data
├── StudentTest.java # Unit tests for individual methods
└── StudentParamTest.java # Parameterized tests for various data sets
```


---

## Classes and Responsibilities

### 1. **`Student.java`**
   - Core class for managing student data.
   - Contains methods to compute the max, min, and average scores of a student.
   - Includes getter and setter for the student ID.

### 2. **`StudentTest.java`**
   - Unit tests for the `Student` class.
   - Ensures correctness of methods like `getMax()`, `getMin()`, `average()`, `getID()`, and `setID()`.

### 3. **`StudentParamTest.java`**
   - Parameterized tests for the `Student` class.
   - Verifies functionality across multiple datasets.

---

## Setup Instructions

### Prerequisites

- **Java Development Kit (JDK)**: Version 8 or higher.
- **JUnit**: Ensure JUnit 4 is configured in your development environment.
- A Java-compatible IDE (e.g., IntelliJ IDEA, Eclipse, or VS Code).

---

### How to Run

1. **Clone the Repository**:
   ```bash
   git clone https://github.com/CormacM22/SoftwareTesting
```
2. **Compile the Code**:
   ```bash
   java src/*.java
```
3. ** Run the Application**:
- Execute the ```Student``` class with sample inputs.

## Example Usage
### Sample Code
```bash
Student student = new Student(123456, 80, 75, 90);
System.out.println("Max Score: " + student.getMax());    // Output: 90
System.out.println("Min Score: " + student.getMin());    // Output: 75
System.out.println("Average Score: " + student.average());// Output: 82
```

## Testing

### **`StudentTest.java`**
- Verifies methods for individual student data, including:
  - `getMax()`
  - `getMin()`
  - `average()`
  - `getID()`
  - `setID()`

### **`StudentParamTest.java`**
- Runs parameterized tests with multiple datasets to ensure functionality across a variety of inputs:
  - **Dataset 1**: 
    - ID: `111`, English: `40`, Irish: `10`, Maths: `90`
  - **Dataset 2**: 
    - ID: `222`, English: `30`, Irish: `50`, Maths: `40`
  - **Dataset 3**: 
    - ID: `333`, English: `15`, Irish: `60`, Maths: `55`
## File Structure
```bash
src/
├── Student.java                # Class for managing student data
├── StudentTest.java            # Unit test class
└── StudentParamTest.java       # Parameterized test class
```
