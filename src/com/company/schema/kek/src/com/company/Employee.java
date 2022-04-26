package com.company;

public class Employee extends Person{
    private Role role;
    private double salary;

    public Employee(String name, int age, Role role, double salary) {
        super(name, age);
        this.role = role;
        this.salary = salary;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "role='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }
}
