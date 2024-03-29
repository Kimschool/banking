package com.weavus.banking.dao;

import com.weavus.banking.dto.Account;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AccountDao extends JpaRepository<Account, String> {

    List<Account> findByUserId(String userId);
}
