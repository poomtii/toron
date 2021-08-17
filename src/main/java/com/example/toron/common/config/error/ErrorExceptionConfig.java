package com.example.toron.common.config.error;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import java.text.SimpleDateFormat;
import java.util.Date;

@Slf4j
@Controller
public class ErrorExceptionConfig implements ErrorController {
    private String VIEW_PATH = "/error/";

    public String getDate(){
        Date now = new Date();
        SimpleDateFormat format = new SimpleDateFormat("yyyyMMdd hh:mm");
        String date = format.format(now);
        return date;
    }

    @RequestMapping(value = "/error")
    public String handleError(HttpServletRequest request) {
        Object status = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);

        if (status != null) {
            int statusCode = Integer.valueOf(status.toString());
            if (statusCode == HttpStatus.NOT_FOUND.value()) {
                log.info("########## ERROR!!! ##########");
                log.info("에러 구분  : " + status.toString());
                log.info("발생일     : " +  getDate());
                log.info("##############################");
                return VIEW_PATH + statusCode;
            }
            if (statusCode == HttpStatus.FORBIDDEN.value()) {
                log.info("########## ERROR!!! ##########");
                log.info("에러 구분  : " + status.toString());
                log.info("발생일     : " +  getDate());
                log.info("##############################");
                return VIEW_PATH + statusCode;
            }
            else {
                log.info("########## ERROR!!! ##########");
                log.info("에러 구분  : " + status.toString());
                log.info("발생일     : " +  getDate());
                log.info("##############################");
                return VIEW_PATH + "etc";
            }
        }
        return "error";
    }
}