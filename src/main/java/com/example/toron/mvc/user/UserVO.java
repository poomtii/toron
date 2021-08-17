package com.example.toron.mvc.user;

import lombok.Data;

@Data
public class UserVO {

    private int result;
    private String user_code;
    private String user_name;
    private String user_nickname;
    private String user_id = "";
    private String user_pwd;
    private String user_email;
    private String user_phone_number;
    private String user_flag;
    private String create_date;
    private String update_date;
    private String login_date;
    private String msg = "";




}
