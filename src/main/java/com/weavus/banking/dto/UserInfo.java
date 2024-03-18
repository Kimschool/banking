package com.weavus.banking.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "userinfo")
public class UserInfo {

    @Id
    private String id;
    private String name;
    private String password;
    private String gender;
    private String reg_date;
    private String status;
}
