package com.example.toron.mvc.user;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@Controller
@RequestMapping(value = "/user")
public class UserController {
    @Autowired
    private UserService uSvc;

    //지금은 벨류에 폴더 주소를 적나라하게 적어주었지만 그럴 필요는 없다.
    //개발자가 알아볼 수만 있으면 된다.
    // 항상 변수든 함수명이든 첫 영문은 소문자로 시작하고
    // goLogin
    // ex) boolean isChk;
    // .do -> action
    // .go -> page redirection
    // 모델링 이런 구조를 잡아서 계속 가져가는게 모델링이라고 하는거임
    @GetMapping(value = "/login.go")
    public String goLoginPage() { return "body/user/login"; }

    @GetMapping(value = "/register.go")
    public String goRegister() { return "body/user/join"; }

    @GetMapping(value = "/user_info.go")
    public String goUserInfo() { return "body/user/user_info"; }

    @PostMapping(value = "/register.do")
    public void registerAction(UserVO vo , HttpServletResponse res) throws IOException { uSvc.registerAction(vo, res); }

    @PostMapping(value = "/login.do")
    public String loginAction(UserVO vo, HttpServletResponse res, HttpServletRequest req) throws IOException {
        return uSvc.loginAction(vo,res,req);
    }
}