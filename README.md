
# 📆 Java Leap Year Checker CLI  

A simple command-line Java application to check whether a given year is a leap year. Includes user input validation and year format verification (four-digit format).

## ❓ What is a Leap Year?
A **leap year** is a year with an extra day added to the calendar—**February 29**—to keep it synchronized with the Earth's orbit around the sun. According to the **Gregorian calendar**:
- A year **is a leap year** if it is **divisible by 4**;  
- **Except** if it is **divisible by 100**, then it **is not** a leap year;  
- **Unless** it is also **divisible by 400**, in which case it **is** a leap year.

🧮 **Examples**:  
- 2020 → ✅ Leap year  
- 1900 → ❌ Not a leap year  
- 2000 → ✅ Leap year    

## 📌 Features
- Accepts user input from the terminal  
- Validates that the input is a valid integer  
- Ensures the year is in a four-digit format (1000–9999)  
- Checks and reports if the year is a leap year based on Gregorian calendar rules  
- Clear and user-friendly messages for invalid input

## 📁 Project Structure

```text
src/
├── Main.java
├── LeapYearValidation.java
└── UserInputHandler.java
```

## 🧪 Requirements
- Java JDK 11 or higher
- An IDE (e.g., IntelliJ, VS Code) or terminal with ```javac```

## 🚀 How to run
1. Clone the repository:
   ```bash
     git clone https://github.com/tarsila-byte/leap-year-checker.git
     cd leap-year-checker
   ```
2. Compile and run the `Main` class located at `src/Main.java`.

---
| This project was created to practice basic Java concepts. 

Made with 💻 by Tarsila Fritz
