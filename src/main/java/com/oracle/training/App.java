package com.oracle.training;

import com.oracle.training.data.*;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Oracle oracle = new Oracle(1111, 33, "Niita", "Tech");
        System.out.println(oracle.getEmployeeNum());
        Oracle2 oracle2 = new Oracle2(1111, 33, "Niita", "Tech");
        System.out.println(oracle2.getEmployeeNum());
        Oracle3 oracle3 = new Oracle3(1111, 33, "Niita", "Tech");
        System.out.println(oracle3.getEmployeeNum());
        Oracle4 oracle4 = Oracle4.builder().employeeNum(1111).age(33).department("Tech").name("Niita").build();
        System.out.println(oracle4.getEmployeeNum());
        Oracle5 oracle5 = new Oracle5(1111, 33, "Niita", "Tech");
        System.out.println(oracle5.employeeNum());
        Oracle6 oracle6 = new Oracle6.Builder(1111).age(33).department("Tech").name("Niita").build();
        System.out.println(oracle6.getEmployeeNum());
    }
}
