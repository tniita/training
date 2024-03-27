package com.oracle.training.data;

public class Oracle2 {
    private final int employeeNum;
    private final int age;
    private final String name;
    private final String department;

    public Oracle2(final int employeeNum, final int age, final String name, final String department) {
        this.employeeNum = employeeNum;
        this.age = age;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Oracle2 [employeeNum=" + employeeNum + ", age=" + age + ", name=" + name + ", department=" + department
                + "]";
    }

    public int getEmployeeNum() {
        return employeeNum;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

}
