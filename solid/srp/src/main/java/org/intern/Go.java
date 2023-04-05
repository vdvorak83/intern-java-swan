package org.intern;

public class Go {
    public static void main(String[] args) {
        Address address = new Address("123 Main St", "Anytown", "Anystate", "12345");
        PhoneNumber phone = new PhoneNumber("123", "12", "5553535");
        Employee employee = new Employee("John Doe", address, phone);
        double salary = employee.calculateSalary();
        EmployeeDataPersister.saveSalary(salary);
        System.out.println("Employee salary saved: " + salary);
    }
}


