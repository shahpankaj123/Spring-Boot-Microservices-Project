package com.contact.dto;

import lombok.Data;

@Data
public class ContactDto {
    private String phone_number;

    private String email;

    private Long user_id;
}
