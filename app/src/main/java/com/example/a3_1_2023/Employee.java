package com.example.a3_1_2023;

public class Employee {
    private String name;
    private double salary;
    private String workOption;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getWorkOption() {
        return workOption;
    }

    public void setWorkOption(String workOption) {
        this.workOption = workOption;
    }

    public Employee(String name, double salary, String workOption) {
        this.name = name;
        this.salary = salary;
        this.workOption = workOption;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", salary=" + salary +
                ", workOption='" + workOption + '\'' +
                '}';
    }
}
