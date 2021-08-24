package com.example.toron.mvc.user;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class UserVO {

    private int result;
    private String user_code;
    @NotBlank(message = "이름은 공백일 수 없습니다.")
    @Size(min = 2, max = 25, message = "이름은 2~25자 이내로 입력하세요.")
    private String user_name;

    @NotBlank(message = "닉네임은 공백일 수 없습니다.")
    @Size(min = 2, max = 10, message = "2~10자 이내로 해주세요.")
    private String user_nickname;
    @NotBlank(message = "아이디응 공백일 수 없습니다.")
    @Size(min = 2, max = 25, message = "2~25자 이내로 입력하세요.")
    private String user_id;
    @NotBlank(message = "비밀번호는 공백일 수 없습니다.")
    @Size(min = 10, max = 20, message = "10~20자 이내로 해주세요")
    private String user_pwd;
    @Email
    private String user_email;
    private String user_phone_number;
    private String user_flag;
    private String create_date;
    private String update_date;
    private String login_date;
    private String msg = "";




}
