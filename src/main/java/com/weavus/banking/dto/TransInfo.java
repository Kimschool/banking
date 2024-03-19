package com.weavus.banking.dto;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Entity
@Setter
@Getter
@ToString
@Table(name = "transinfo")
public class TransInfo {

    // リファクタリング
    @Id
    // insert시 1씩 증가하게 하는 어노테이션
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int no;
    private String userId;
}
