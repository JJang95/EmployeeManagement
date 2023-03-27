package com.jonathanjang.empapp;

public interface EmployeeDaoInter {

    public void addEmployee(Employee e);

    public void deleteEmployee(int id);

    public void updateEmployee(int id, Employee e);

    public Employee getEmployee(int id);

    public Employee[] getAllEmployees();
}
