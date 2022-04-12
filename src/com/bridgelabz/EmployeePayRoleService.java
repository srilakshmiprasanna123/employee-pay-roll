package com.bridgelabz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeePayrollService {

    private List<EmployeePlayRoleData> employeePayrollList;

    public EmployeePayrollService() {

    }

    public EmployeePayrollService(List<EmployeePlayRoleData> employeePayrollList) {

        this.employeePayrollList = employeePayrollList;
    }

    private void write() {

        System.out.println("Given Employee Data is : " + employeePayrollList);
    }

    private void readEmployeeData(Scanner scanner) {

        System.out.println("Enter your name : ");
        String name = scanner.nextLine();

        System.out.println("Enter your ID : ");
        int id = scanner.nextInt();

        System.out.println("Enter your salary : ");
        double salary = scanner.nextDouble();

        EmployeePlayRoleData empData = new EmployeePlayRoleData(id, salary, name);

        employeePayrollList.add(empData);
    }


    public static void main(String[] args) {

        Scanner SC = new Scanner(System.in);

        ArrayList<EmployeePlayRoleData> employeePayrollList = new ArrayList<EmployeePlayRoleData>();

        EmployeePayrollService employeePayrollService = new EmployeePayrollService(employeePayrollList);

        employeePayrollService.readEmployeeData(SC);

        employeePayrollService.write();

    }
}