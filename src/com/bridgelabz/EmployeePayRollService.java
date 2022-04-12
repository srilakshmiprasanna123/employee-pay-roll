package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayRollService {
    private List<EmployeePayrollData> employeePayrollList;
    public EmployeePayRollService() {
    }
    public EmployeePayRollService(List<EmployeePayrollData> employeePayrollList) {
        this.employeePayrollList = employeePayrollList;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<EmployeePayrollData> employeePayrollList = new ArrayList<EmployeePayrollData>();
        EmployeePayRollService employeePayrollService = new EmployeePayRollService(employeePayrollList);
        employeePayrollService.readEmployeeData(scanner);
        employeePayrollService.write();

    }

    private void readEmployeeData(Scanner scanner) {
        System.out.println("Enter your name : ");
        String name = scanner.nextLine();
        System.out.println("Enter your ID : ");
        int id = scanner.nextInt();
        System.out.println("Enter your salary : ");
        double salary = scanner.nextDouble();
        EmployeePayrollData empData = new EmployeePayrollData(id, salary, name);
        employeePayrollList.add(empData);
    }
    private void write() {
        System.out.println("Given Employee Data is : " + employeePayrollList);
    }
}

