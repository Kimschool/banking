package com.weavus.banking.signup.controller;

import com.weavus.banking.signup.entity.SignUpEntity;
import com.weavus.banking.signup.service.SignUpService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class SignUpController {

    private final SignUpService signUpService;

    @GetMapping("/signUp")
    public String signUp() {

        return "signup";

    }

    @PostMapping("/signUp")
    public String save(Model model, SignUpEntity entity) {

        // ID 존재 check
        boolean exist = signUpService.checkId(entity.getId());

        // 만약 입력한 아이디기 존재한다면 처리를 중단한다.
        if(exist) {
            model.addAttribute("msg", "존재하는 아이디 입니다.");
            return "signup";
        }
        boolean result = signUpService.signUp(entity);

        if(result) {
            model.addAttribute("msg", "회원가입이 성공하였습니다.");
            return "index";
        } else {
            model.addAttribute("msg", "회원가입에 실패 하였습니다.");
            return "signup";

        }
    }

}
