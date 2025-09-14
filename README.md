# Report Builder (Java)

## Introduction
This project demonstrates the Builder design pattern by implementing a Report.Builder class in Java.  
The Builder pattern helps to construct complex objects step by step and improves code readability.  
The project also follows Clean Code principles for better maintainability.

---

## Clean Code Principles Applied
- Meaningful names: Classes, methods, and variables are named clearly and consistently.  
- Single Responsibility Principle (SRP): Report class only stores data, while Builder class is responsible for object creation.  
- Method chaining: Builder methods return this, so the client code is readable.  
- Immutability: Once created, the Report object is not modified from outside.  
- Consistent formatting: Code is formatted properly and warnings are minimized.

---

## Code Structure
- Report.java → Product class (fields: title, author, content, footer, etc.)  
- Report.Builder → Inner static class with setTitle(), setAuthor(), setContent(), etc. methods and build() method.  
- Main.java → Demonstrates creating different reports using the builder.

---

## Example Usage

```java
public class Main {
    public static void main(String[] args) {
        Report report = new Report.Builder()
                .setTitle("Clean Code Report")
                .setAuthor("Student")
                .setContent("This report demonstrates Builder pattern.")
                .setFooter("2025 © University")
                .includeTable(true)
                .includeChart(true)
                .build();

        System.out.println("Title: " + report.getTitle());
        System.out.println("Author: " + report.getAuthor());
    }
}
