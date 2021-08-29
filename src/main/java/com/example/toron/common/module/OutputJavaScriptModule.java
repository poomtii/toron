package com.example.toron.common.module;

import com.example.toron.common.config.error.Msg;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class OutputJavaScriptModule {
    public static void outPrintScript(String gnb, HttpServletResponse res) throws IOException {
        Msg msg = new Msg();
        res.setContentType("text/html; charset=UTF-8");
        PrintWriter out = res.getWriter();
        switch (gnb) {
            case "loginAction" :
                out.println(makeContentMsg(msg.getChkLoginData(),msg.getLoginLoc()));
                out.flush();
                break;
            case "registerAction" :
                out.println(makeContentMsg(msg.getSuccessRegister(),msg.getLoginLoc()));
                out.flush();
                break;
            case "bbsWriteAction" :
                out.println(makeContentMsg(msg.getWriteDone(),msg.getListLoc()));
                out.flush();
                break;
            case "error" :
                out.println(makeContentMsg(msg.getError(),msg.getIndexLoc()));
                out.flush();
                break;
            case "historyBack" :
                out.println(makeContentMsg(msg.getError(),msg.getHistoryBack()));
                out.flush();
                break;

            case "logout" :
                out.println(makeContentMsg(msg.getIndexLoc(),msg.getSuccessLogout()));
                out.flush();
                break;
        }
    }

    private static String makeContentMsg(String msg, String location) {
        String rsMsg;
        rsMsg = "<script>alert('"+msg+"');  location.href='"+location+"'</script>'";
        return rsMsg;
    }
}
