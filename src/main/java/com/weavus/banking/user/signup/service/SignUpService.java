package com.weavus.banking.user.signup.service;

import com.weavus.banking.dao.UserInfoDao;
import com.weavus.banking.dto.UserInfo;
import com.weavus.banking.user.signup.entity.SignUpEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class SignUpService {

    private final UserInfoDao userInfoDao;

    public boolean signUp(SignUpEntity entity) {




        UserInfo userInfo = new UserInfo();
        userInfo.setId(entity.getId());
        userInfo.setName(entity.getName());
        userInfo.setPassword(entity.getPassword());
        userInfo.setGender(entity.getGender());


        UserInfo result =  userInfoDao.save(userInfo);

        return result != null;
    }

    public boolean checkId(String id) {

        UserInfo check = userInfoDao.findById(id).orElse(null);

        return check != null;
    }
}
