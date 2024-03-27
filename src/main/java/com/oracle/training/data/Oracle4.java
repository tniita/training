package com.oracle.training.data;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Oracle4 {
    @Override
    public String toString() {
        return "Oracle4 [employeeNum=" + employeeNum + ", age=" + age + ", name=" + name + ", department=" + department
                + "]";
    }
    private final int employeeNum;
    private final int age;
    private final String name;
    private final String department;
}
