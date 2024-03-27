package com.oracle.training.data;

import lombok.Getter;
import lombok.ToString;

@Getter
@ToString
public class Oracle3 {

    public Oracle3(final int employeeNum, final int age, final String name, final String department) {
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
