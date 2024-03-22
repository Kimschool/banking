package com.weavus.banking.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import org.hibernate.annotations.DynamicInsert;

@Entity
@Getter
@Setter
@DynamicInsert
@Table(name = "account")
public class Account {

    @Id
    private String account;

//    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int no;

    private String branchCode;

    private long amount;

    private String userId;
}
