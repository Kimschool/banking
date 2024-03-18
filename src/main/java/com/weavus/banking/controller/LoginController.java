package com.weavus.banking.controller;

import com.weavus.banking.dao.TransInfoDao;
import com.weavus.banking.dao.UserInfoDao;
import com.weavus.banking.dto.TransInfo;
import com.weavus.banking.dto.UserInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class LoginController {

    @Autowired
    public UserInfoDao userInfoDao;

    @Autowired
    public TransInfoDao transInfoDao;

    @GetMapping("/")
    public String index(Model model) {

        List<String> list = new ArrayList<>();
        list.add("1");
        list.add("2");
        list.add("3");

        UserInfo userInfo = userInfoDao.findById("apple").orElse(null);
        List<UserInfo> userInfoList = userInfoDao.findAll();

        List<TransInfo> transInfoList = transInfoDao.findAll();

        System.out.println(userInfo);
        System.out.println(userInfoList);
        System.out.println(transInfoList);


        model.addAttribute("name", "김정화");
        model.addAttribute("list", list);
        return "index";
    }


    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @PostMapping("/login")
    public String login1(String username, String password) {

        System.out.println(username + password);

        return "login";
    }
}
