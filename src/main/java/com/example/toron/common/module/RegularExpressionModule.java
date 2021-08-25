package com.example.toron.common.module;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegularExpressionModule {

    public static boolean validationpasswd(String pwd){
        Pattern pt = Pattern.compile("^(?=.*[A-Za-z])(?=.*\\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\\d~!@#$%^&*()+|=]{8,16}$");
        Matcher mat = pt.matcher(pwd);

        if(mat.matches()){
            return true;
        }
        else{
            return false;
        }

    }
}
