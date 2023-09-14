package com.oracle.training.data;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Oracle4 {

    private int employeeNum;
    private int age;
    private String name;
    private String departmentName;


    /**
    public static class Builder {
        private Oracle4 oracle4 = new Oracle4();

        public Builder(int employeeNum){
            oracle4.employeeNum = employeeNum;
        }

        Builder age(int age){
            oracle4.age = age;
            return this;
        }

        Builder name(String name){
            oracle4.name = name;
            return this;
        }

        Builder departmentName(String departmentName){
            oracle4.departmentName = departmentName;
            return this;
        }

        Oracle4 build() {
            if(oracle4.employeeNum == 0){
                throw new IllegalArgumentException("You must specify the employee number");
            }
            return this.oracle4;
        }

        public Oracle4 getOracle4() {
            return this.oracle4;
        }
    }
     */
}