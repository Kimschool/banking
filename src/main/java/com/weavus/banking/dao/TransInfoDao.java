package com.weavus.banking.dao;


import com.weavus.banking.dto.TransInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransInfoDao extends JpaRepository<TransInfo, Integer>{
}
