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
}
