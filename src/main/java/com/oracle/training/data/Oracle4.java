package com.oracle.training.data;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Oracle4 {

    private final int employeeNum;
    private final int age;
    private final String name;
    private final String departmentName;

    /**
     * public static class Builder {
     * private final int employeeNum;
     * private int age;
     * private String name;
     * private String departmentName;
     * 
     * public Builder(int employeeNum){
     * this.employeeNum = employeeNum;
     * }
     * 
     * Builder setAge(int age){
     * this.age = age;
     * return this;
     * }
     * 
     * Builder setName(String name){
     * this.name = name;
     * return this;
     * }
     * 
     * Builder setDepartment(String departmentName){
     * this.departmentName = departmentName;
     * return this;
     * }
     * 
     * public Oracle4 build() {
     * return new Oracle4(this);
     * }
     * }
     * 
     * private Oracle4(Builder builder) {
     * this.employeeNum = builder.employeeNum;
     * this.age = builder.age;
     * this.name = builder.name;
     * this.departmentName = builder.departmentName;
     * }
     * 
     * public int getEmployeeNum() {
     * return this.employeeNum;
     * }
     * 
     * public int getAge() {
     * return this.age;
     * }
     * 
     * public String getName() {
     * return this.name;
     * }
     * 
     * public String getDepartmentName() {
     * return this.departmentName;
     * }
     */
}