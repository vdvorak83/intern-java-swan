package org.intern;

/*створено клас, який не відповідає умовам srp
public class Employee {
    private String name;
    private String address;
    private String phone;

    public void calculateSalary() {
        // Some code to calculate salary
    }

    public void printEmployeeDetails() {
        // Some code to print employee details
    }

    public void saveEmployeeData() {
        // Some code to save employee data
    }

*/
public class Employee {
    private String name;
    private Address address;
    private PhoneNumber phone;
    private SalaryCalculator salaryCalculator;
    private EmployeeDataPersister employeeDataPersister;

    public Employee(String name, Address address, PhoneNumber phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
        this.salaryCalculator = new SalaryCalculator();
        this.employeeDataPersister = new EmployeeDataPersister();
    }

    public double calculateSalary() {
        double salary = salaryCalculator.calculateSalary(this);
        // Some code to save the calculated salary
        EmployeeDataPersister.saveSalary(salary);
        return salary;
    }

    public String getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public PhoneNumber getPhone() {
        return phone;
    }
}
