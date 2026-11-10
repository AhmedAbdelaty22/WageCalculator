# Wage Calculator

A small Java console example of **encapsulation**: an `Employee` class that protects its own data and calculates wages.

## Features

- **Private fields with validation.** Base salary and hourly rate can only be set through private setters that check the values. An invalid value throws an `IllegalArgumentException`.
  - Base salary must be greater than 0.
  - Hourly rate can't be negative.
- **Method overloading.**
  - `calculateWage(extraHours)` returns base salary + (hourly rate × extra hours).
  - `calculateWage()` returns the wage with no extra hours.
- **Static member.** `numberOfEmployees` counts how many `Employee` objects have been created. `printNumberOfEmployees()` prints the count.

## Example

```java
var employee = new Employee(50000, 20);

Employee.printNumberOfEmployees();

int wage = employee.calculateWage();
IO.println("Employee Wage is : " + wage);
```

Output:

```
Number of Employees is : 1
Employee Wage is : 50000
```

## Requirements

- Java 25 or newer. `Main.java` is a compact source file (`void main()` with no class around it) and uses the `IO` class, both standard since Java 25.

## How to run

**IntelliJ IDEA:** open the project folder and run `src/Main.java`.

**Terminal:** from the project folder, run:

```bash
java src/Main.java
```

Java finds `Employee.java` in `src/` automatically.
