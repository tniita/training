package com.oracle.training.data;

import lombok.Getter;

@Getter
public class Oracle3 {

    public Oracle3(int employeeNum, int age, String name, String department) {
        this.employeeNum = employeeNum;
        this.age = age;
        this.name = name;
        this.department = department;
    }

    private final int employeeNum;
    private final int age;
    private final String name;
    private final String department;
}
