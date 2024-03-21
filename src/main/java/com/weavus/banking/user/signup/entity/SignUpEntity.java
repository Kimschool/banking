package com.weavus.banking.user.signup.entity;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class SignUpEntity {

    private String id;
    private String password;
    private String passwordchk;
    private String name;
    private String gender;

}
