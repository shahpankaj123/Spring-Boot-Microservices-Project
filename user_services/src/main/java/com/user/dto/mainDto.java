package com.user.dto;

import java.util.List;

import lombok.Data;

@Data
public class mainDto {

    private Long userId;

    private String full_name;

    List<ContactDto> contact;


    
}
