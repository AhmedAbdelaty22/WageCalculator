void main() {
    var employee = new Employee(50000, 20);

    Employee.printNumberOfEmployees();

    int wage = employee.calculateWage();
    IO.println("Employee Wage is : " + wage);
}