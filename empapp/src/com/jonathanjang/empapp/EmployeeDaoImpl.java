package com.jonathanjang.empapp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class EmployeeDaoImpl implements EmployeeDaoInter {

    Connection con;

    @Override
    public void createEmployee(Employee emp) {
        con = DBConnection.createDBConnection();
        String query = "insert into employee values(?,?,?,?,?)";

        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1,emp.getId());
            pstm.setString(2,emp.getName());
            pstm.setInt(3,emp.getSalary());
            pstm.setInt(4,emp.getAge());
            pstm.setString(5,emp.getPosition());
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
        con= DBConnection.createDBConnection();
        String query = "select * from employee";
        System.out.println("Employee Info: ");
        System.out.println("----------------------------------------------------");
        System.out.format("%s\t%s\t%s\t%s\t%s\n","ID","Name","Salary","Age","Position");
        System.out.println("----------------------------------------------------");

        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);

            while (result.next()) {
                System.out.format("%d\t%s\t%d\t%d\t%s\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getInt( 3),
                        result.getInt(4),
                        result.getString(5));
                System.out.println("----------------------------------------------------");
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void showEmployeeBasedOnID(int id) {
        con = DBConnection.createDBConnection();
        String query = "select * from employee where id =" + id;

        try {
            Statement stmt = con.createStatement();
            ResultSet result = stmt.executeQuery(query);

            while (result.next()) {
                System.out.format("%d\t%s\t%d\t%d\t%s\n",
                        result.getInt(1),
                        result.getString(2),
                        result.getInt( 3),
                        result.getInt(4),
                        result.getString(5));
            }

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void updateEmployee(int id, String name) {
        con = DBConnection.createDBConnection();
        String query = "update employee set name = ? where id = ?";

        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setString(1,name);
            pstm.setInt(2, id);
            int cnt = pstm.executeUpdate();

            if (cnt != 0)
                System.out.println("Employee updated successfully!");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    @Override
    public void deleteEmployee(int id) {
        con = DBConnection.createDBConnection();
        String query = "delete from employee where id = ?";

        try {
            PreparedStatement pstm = con.prepareStatement(query);
            pstm.setInt(1, id);
            int cnt = pstm.executeUpdate();

            if (cnt != 0)
                System.out.println("Employee deleted successfully!");

        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
