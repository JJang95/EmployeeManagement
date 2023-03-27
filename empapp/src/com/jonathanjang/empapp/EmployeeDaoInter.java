package com.jonathanjang.empapp;

public interface EmployeeDaoInter {

    //create employee
    public void createEmployee();
    //show all employee
    public void showALlEmployee();
    //show employee based on id
    public void showEmployeeBasedOnID(int id);
    //update employee
    public void updateEmployee(int id, String name);
    //delete employee
    public void deleteEmployee(int id);
}
