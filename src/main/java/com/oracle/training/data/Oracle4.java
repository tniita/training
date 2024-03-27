package com.oracle.training.data;

import lombok.Builder;
import lombok.Getter;
import lombok.ToString;

@Builder
@Getter
@ToString
public class Oracle4 {
    private final int employeeNum;
    private final int age;
    private final String name;
    private final String department;
}
