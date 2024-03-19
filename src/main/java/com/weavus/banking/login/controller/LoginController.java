package com.weavus.banking.login.controller;

import com.weavus.banking.dao.TransInfoDao;
import com.weavus.banking.dao.UserInfoDao;
import com.weavus.banking.dto.UserInfo;
import com.weavus.banking.login.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class LoginController {

    @Autowired
    public UserInfoDao userInfoDao;

    @Autowired
    public TransInfoDao transInfoDao;

    @Autowired
    public LoginService loginService;

    @GetMapping("/")
    public String index(Model model) {

        return "index";
    }


    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @PostMapping("/login")
    public String login1(String id, String password, Model model) {

        UserInfo userInfo = loginService.login(id, password);

        if(userInfo == null) {
            model.addAttribute("msg", "아이디 또는 패스워드를 확인해 주세요");
            return "index";
        } else {
            model.addAttribute("name", userInfo.getName());
            return "main";
        }
    }

}
