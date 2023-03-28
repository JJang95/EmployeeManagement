package com.jonathanjang.empapp;

public class Employee {

    //INSTANCE VARIABLES

    private int id;
    private String name;
    private int salary;
    private int age;
    private String position;

    //CONSTRUCTORS

    public Employee () {

    }

    public Employee(int id, String name, int salary, int age, String position) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.age = age;
        this.position = position;
    }

    //GETTER AND SETTER METHODS

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    //TO STRING METHODS

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", salary=" + salary +
                ", age=" + age +
                ", position='" + position + '\'' +
                '}';
    }
}
