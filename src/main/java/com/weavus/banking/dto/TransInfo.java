package com.weavus.banking.dto;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "transinfo")
public class TransInfo {

    @Id
    private int no;
    private String userId;
}
