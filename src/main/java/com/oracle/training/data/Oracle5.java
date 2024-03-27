package com.oracle.training.data;

public record Oracle5(int employeeNum, int age, String name, String department) {

    @Override
    public String toString() {
        return "Oracle5 [employeeNum=" + employeeNum + ", age=" + age + ", name=" + name + ", department=" + department
                + "]";
    }

}
