$("#user_pwd").change(function(){
    checkPassword($('#user_pwd').val(),$('id').val());
});
function checkPassword(user_pwd,id){

    if(!/^(?=.*[a-zA-Z])(?=.*[!@#$%^*+=-])(?=.*[0-9]).{8,25}$/.test(user_pwd)){
        alert('숫자+영문자+특수문자 조합으로 8자리 이상 사용해야 합니다.');
        $('#user_pwd').val('').focus();
        return false;
    }
    var checkNumber = user_pwd.search(/[0-9]/g);
    var checkEnglish = user_pwd.search(/[a-z]/ig);
    if(checkNumber <0 || checkEnglish <0){
        alert("숫자와 영문자를 혼용하여야 합니다.");
        $('#user_pwd').val('').focus();
        return false;
    }
    if(/(\w)\1\1\1/.test(user_pwd)){
        alert('같은 문자를 4번 이상 사용하실 수 없습니다.');
        $('#user_pwd').val('').focus();
        return false;
    }

    if(user_pwd.search(id) > -1){
        alert("비밀번호에 아이디가 포함되었습니다.");
        $('#user_pwd').val('').focus();
        return false;
    }
    return true;
}


/*

$('#user_pwd').on("input",function(){
    var regex = /^(?=.*[A-Za-z])(?=.*\d)(?=.*[~!@#$%^&*()+|=])[A-Za-z\d~!@#$%^&*()+|=]{8,16}$/;
    var result = regex.exec($('#user_pwd').val())

    if(result != null){
    $('.pw.regex').html("");
    }else{
        $('.pw.regex').html("특수문자 포함 영어대소문자,숫자 8-16자리");
        $('.pw.regex').css("color","red")
    }
});

$(function user_pwd_chk(){
    $('#user_pwd').keyup(function(){
        $('#chkNotice2').html('');
    });

    $('#user_pwd_chk2').keyup(function(){

        if($('#user_pwd').val() != $('#user_pwd_chk').val()){
        $('#chkNotice2').html('비밀번호 일치하지 않음<br><br>');
        $('#chkNotice2').attr('color', '#f82a2aa3');
            }else{
            $('#chkNotice2').html('비밀번호 일치함<br><br>');
            $('#chkNotice2').attr('color', '#199894b3');
            }

    });
});
*/
