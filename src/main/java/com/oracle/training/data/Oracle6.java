package com.oracle.training.data;


public class Oracle6{
    private int employeeNum;
    private int age;
    private String name;
    private String department;

    @Override
    public String toString() {
        return "Oracle6 [employeeNum=" + employeeNum + ", age=" + age + ", name=" + name + ", department="
                + department + "]";
    }

    public static class Builder {
        private int employeeNum;
        private int age;
        private String name;
        private String department;

        public Builder(int employeeNum){
            this.employeeNum = employeeNum;
        }

        public Builder age(int age){
            this.age = age;
            return this;
        }

        public Builder name(String name){
            this.name = name;
            return this;
        }

        public Builder department(String department){
            this.department = department;
            return this;
        }

        public Oracle6 build(){
            return new Oracle6(this);
        }
    }


    private Oracle6(Builder builder){
        this.employeeNum = builder.employeeNum;
        this.age = builder.age;
        this.name = builder.name;
        this.department = builder.department;
    }

    public int getEmployeeNum(){
        return employeeNum;
    }

    public int getAge(){
        return age;
    }

    public String getName(){
        return name;
    }

    public String getDepartment() {
        return department;
    }
}