package com.example.toron.common.config.error;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Msg {
    private String chkLoginData = "로그인 정보를 확인하세요.";
    private String failedRegister = "회원가입에 실패하였습니다.";
    private String successRegister = "회원가입에 성공하였습니다.";
    private String writeDone = "글 작성이 완료되었습니다.";
    private String error = "에러발생, 관리자에게 문의하세요.";
    private String listLoc = "/board/list.go";
    private String loginLoc = "/user/login.go";
    private String indexLoc = "/";
    private String registerLoc = "/user/register.go";
    private String historyBack = "history.go(-1)";
}
