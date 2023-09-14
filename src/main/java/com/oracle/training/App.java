package com.oracle.training;

import com.oracle.training.data.*;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Oracle oracle = new Oracle(1111,33,"Niita","Tech");
        System.out.println(oracle.getEmployeeNum());
        Oracle2 oracle2 = new Oracle2(1111,33,"Niita","Tech");
        System.out.println(oracle2.getEmployeeNum());
        Oracle3 oracle3 = new Oracle3(1111,33,"Niita","Tech");
        System.out.println(oracle3.employeeNum());
        Oracle4 oracle4 = Oracle4.builder().employeeNum(1111).build();
        System.out.println(oracle4.getEmployeeNum());
    }
}
