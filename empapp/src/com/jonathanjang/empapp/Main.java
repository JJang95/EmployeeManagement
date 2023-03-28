package com.jonathanjang.empapp;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        EmployeeDaoInter dao = new EmployeeDaoImpl();
        System.out.println("Welcome to Employee Management application");

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("1. Create Employee\n" +
                    "2. Show All Employee\n" +
                    "3. Show Employee Based on ID\n" +
                    "4. Update Employee\n" +
                    "5. Delete Employee\n");

            System.out.println("Please enter your choice: ");
            int ch = sc.nextInt();

            switch (ch) {
                case 1:
                    Employee emp = new Employee();
                    System.out.println("Enter ID: ");
                    int id = sc.nextInt();
                    System.out.println("Enter Name: ");
                    String name = sc.next();
                    System.out.println("Enter Salary: ");
                    int salary = sc.nextInt();
                    System.out.println("Enter Age: ");
                    int age = sc.nextInt();
                    System.out.println("Enter Position: ");
                    String position = sc.next();
                    emp.setId(id);
                    emp.setName(name);
                    emp.setSalary(salary);
                    emp.setAge(age);
                    emp.setPosition(position);
                    dao.createEmployee(emp);
                    break;

                case 2:
                    dao.showALlEmployee();
                    break;

                    case 3:
                        System.out.println("Enter ID to show detail: ");
                        int empid = sc.nextInt();
                        dao.showEmployeeBasedOnID(empid);
                        break;


                case 6:
                    System.out.println("Thank you for using our application!");
                    System.exit(0);
                default:
                    System.out.println("That was not a valid choice please try again.\n");
                    break;
            }

        } while (true);
    }
}
