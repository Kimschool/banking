package com.weavus.banking.user.login.controller;

import com.weavus.banking.dao.TransInfoDao;
import com.weavus.banking.dao.UserInfoDao;
import com.weavus.banking.dto.UserInfo;
import com.weavus.banking.user.login.service.LoginService;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/user")
public class LoginController {

    @Autowired
    public UserInfoDao userInfoDao;

    @Autowired
    public TransInfoDao transInfoDao;

    @Autowired
    public LoginService loginService;


    @GetMapping("/login")
    public String login() {

        return "login";
    }

    @PostMapping("/login")
    public String login1(String id, String password, Model model, HttpServletRequest req) {

        UserInfo userInfo = loginService.login(id, password);

        if(userInfo == null) {
            model.addAttribute("msg", "아이디 또는 패스워드를 확인해 주세요");
            return "index";
        } else {
            HttpSession session = req.getSession();
            session.setAttribute("id", userInfo.getId());

            return "redirect:/account/";
        }
    }

}
