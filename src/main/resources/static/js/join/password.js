function pwd_keypress(){
    var reg = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\d~!@#$%^&*()+|=]{8,16}$/;
    var chk_reg = $("#chk_reg").val();
    var pwd = $("#user_pwd").val();
    if(false == reg.test(pwd)){
    document.write("비밀번호는 8자 이상이어야 하며, 숫자/대문자/소문자/특수문자를 모두 포함해야 합니다.");

    }else{
    document.write("사용가능한 비밀번호입니다.");
    }
}

function equals(){
    var user_pwd = document.getElementById("user_pwd").value;
    var user_pwd_chk = document.getElementById("user_pwd_chk").value;

    if(user_pwd_chk == "") {
    document.getElementById("pwd_chk_text").innerHTML=""
    }else if(user_pwd != user_pwd_chk){
    document.getElementById("pwd_chk_text").innerHTML="비밀번호가 일치하지 않습니다."
    }else{
    document.getElementById("pwd_chk_text").innerHTML="비밀번호가 일치합니다."
    }
}