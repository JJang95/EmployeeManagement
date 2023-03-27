package com.jonathanjang.empapp;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class EmployeeDaoImpl implements EmployeeDaoInter {

    Connection con;

    @Override
    public void createEmployee(Employee emp) {
        con = DBConnection.createDBConnection();
        String query = "insert into employee values(?,?,?,?)";

        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1,emp.getId());
            pstm.setString(2,emp.getName());
            pstm.setDouble(3,emp.getSalary());
            pstm.setInt(4,emp.getAge());
            int cnt = pstm.executeUpdate();

            if (cnt != 0) {
                System.out.println("Employee added successfully!");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void showALlEmployee() {

    }

    @Override
    public void showEmployeeBasedOnID(int id) {

    }

    @Override
    public void updateEmployee(int id, String name) {

    }

    @Override
    public void deleteEmployee(int id) {

    }
}
