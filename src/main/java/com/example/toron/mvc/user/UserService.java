package com.example.toron.mvc.user;

import com.example.toron.common.module.OutputJavaScriptModule;
import com.example.toron.common.module.SessionAttributeModule;
import com.example.toron.mapper.user.UserMapper;
import lombok.extern.java.Log;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;
import java.io.IOException;
import java.io.PrintWriter;

@Service
@Log
public class UserService {
    @Autowired
    private UserMapper uMap;

    SessionAttributeModule sAm;
    OutputJavaScriptModule oJm;

    // String -> equals -> "" -> null check X
    // isEmpty
    // 클래스를 객체화시켰는데 static (전역)객체화를 안해줘서 작동을 안하는거임
    public String loginAction(UserVO vo, HttpServletResponse res, HttpServletRequest req) throws IOException {
        UserVO data = uMap.login(vo);

        if(data.getUser_id().equals("")){
            oJm.outPrintScript("loginAction",res);
        }else{
            System.out.println("test : " +data.getUser_id());
            sAm.setSessionAttribute(data, req,"user");
        }
        return "index";
        /*
        * int result = bSvc.board_register(vo);

        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();

        if (result == 1) {
            out.println("<script>alert('게시글이 등록 되었습니다'); location.href='/user/login';</script>");
        } else {
            out.println("<script>alert('게시글 등록 실패.'); location.href='/user/join';</script>");
        }
        out.flush();
        }*/
    }

    public void registerAction(@Valid UserVO vo , HttpServletResponse res) throws IOException {
        int result = uMap.user_join(vo);
        if(result == 1) {
            oJm.outPrintScript("registerAction",res);
        }else{
            oJm.outPrintScript("error",res);
        }
    }
}
