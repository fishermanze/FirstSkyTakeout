package com.sky.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

@Data
public class EmployeeDTO implements Serializable {

    private Long id;


    private String username;


    private String name;


    private String phone;


    private String sex;


    private String idNumber;


}
