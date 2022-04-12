package com.bridgelabz;

public class EmployeePayrollData {
    private int id;
    private double salary;
    private String name;

    public EmployeePayrollData(int id, double salary, String name) {
        this.id = id;
        this.salary = salary;
        this.name = name;
    }
    public EmployeePayrollData(){

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "EmployeePayrollData{" +
                "id=" + id +
                ", salary=" + salary +
                ", name='" + name + '\'' +
                '}';
    }
}