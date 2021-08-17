package com.example.toron.common.module;

import com.example.toron.mvc.user.UserVO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

public class SessionAttributeModule {
    public static void setSessionAttribute(UserVO data, HttpServletRequest req, String gnb){
        HttpSession session = req.getSession();
        switch (gnb) {
            case "user":
                session.setAttribute("UserData", data);
                session.setMaxInactiveInterval(60*60*24);
                break;
        }

    }
}
