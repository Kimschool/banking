package com.weavus.banking.dao;


import com.weavus.banking.dto.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserInfoDao extends JpaRepository<UserInfo, String> {

//    @Query(nativeQuery = true, value = "select * from userinfo where id=? and password=?")
    UserInfo findByIdAndPassword(String id, String password);
}
