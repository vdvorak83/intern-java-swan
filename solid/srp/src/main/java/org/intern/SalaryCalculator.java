package org.intern;

public class SalaryCalculator {
    public double calculateSalary(Employee employee) {
        double hourlyRate = 10.0; // for example
        int hoursWorked = 160; // for example
        double salary = hourlyRate * hoursWorked;
        return salary;
    }
}
