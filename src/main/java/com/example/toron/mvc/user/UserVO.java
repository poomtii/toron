package com.example.toron.mvc.user;

import com.example.toron.common.module.RegularExpressionModule;
import lombok.Data;


import javax.validation.constraints.*;

@Data
public class UserVO {
    RegularExpressionModule rEm;

    private int result;
    private String user_code;
    @NotBlank(message = "이름은 공백일 수 없습니다.")
    @Size(min = 2, max = 25, message = "이름은 2~25자 이내로 입력하세요.")
    private String user_name;
    @NotBlank(message = "닉네임은 공백일 수 없습니다.")
    @Size(min = 2, max = 10, message = "2~10자 이내로 해주세요.")
    private String user_nickname;
    @NotBlank(message = "아이디는 공백일 수 없습니다.")
    @Size(min = 2, max = 25, message = "2~25자 이내로 입력하세요.")
    private String user_id;
    @NotBlank(message = "비밀번호는 공백일 수 없습니다.")
    @Size(min = 8, max = 16, message = "8~16자 이내로 해주세요")
    @Pattern(regexp = "^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\\d~!@#$%^&*()+|=]{8,16}$",
             message = "비밀번호는 '숫자', '문자', '특수문자' 무조건 1개 이상, 비밀번호 '최소 8자에서 최대 16자'입니다.")
    private String user_pwd;
    @Email
    @NotBlank(message = "이메일은 공백일 수 없습니다.")
    private String user_email;
    private String user_phone_number;
    private String user_flag;
    private String create_date;
    private String update_date;
    private String login_date;
    private String msg = "";




}
