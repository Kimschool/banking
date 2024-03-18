package com.weavus.banking.dao;


import com.weavus.banking.dto.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoDao extends JpaRepository<UserInfo, String> {
}
