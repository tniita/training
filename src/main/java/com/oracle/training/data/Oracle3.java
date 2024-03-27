package com.oracle.training.data;

import lombok.Getter;

@Getter
public class Oracle3 {

    public Oracle3(final int employeeNum, final int age, final String name, final String department) {
        this.employeeNum = employeeNum;
        this.age = age;
        this.name = name;
        this.department = department;
    }

    @Override
    public String toString() {
        return "Oracle3 [employeeNum=" + employeeNum + ", age=" + age + ", name=" + name + ", department=" + department
                + "]";
    }

    private final int employeeNum;
    private final int age;
    private final String name;
    private final String department;
}
