package com.user.models;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.ElementCollection;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

import lombok.Data;

@Entity
@Data
public class user {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long UserId;

    private String full_name;
}
