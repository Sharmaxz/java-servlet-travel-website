$(function(){
    function runEffect() {
        $("#formLogin").fadeOut(1);
        $("#formRegistration").fadeIn(450);
    }

    $( "#signUp" ).on("click", function() {
        runEffect();
        return false;
    });

    $( ".fas" ).on("click", function() {
        $("#formRegistration").fadeOut(1);
        $("#formLogin").fadeIn(450);
        return false;
    });


    //Registration. Checking the password and email

    setInterval(function () {
        //Submit
       /* $("#ButtonRegistration").on('click',function() {
            $(this).prop("disabled",true);
        }); */


        //email
        let emailRCheck = $("#InputREmail").val();
        if (CheckEmail(emailRCheck) === false && emailRCheck == null){
            $("#InputREmail").addClass("invalid");
        }

         //password
        let passwordRCheck = $("#InputRPassword").val();
        let passwordScore = 0;
        PasswordStr(passwordRCheck, passwordScore);

        let passwordRCCheck = $("#InputRCPassword").val();
        CheckPassword(passwordRCheck, passwordRCCheck);





    },500);
    var array = [];
    function CheckSubmit(value){
        let submit = false;
        console.log(array);
        if(array.indexOf(value) >-1){
            array.push(value);
        }

        if(submit) {
            $("#ButtonRegistration").prop("disabled", true);
        }
        else{
            $("#ButtonRegistration").prop('disabled', false);
        }
    }

    function DeletObjectArray(value){
        let index = array.indexOf(value);
        if(index >-1){
            array.splice(index, 1);
        }
    }

    function CheckEmail(email) {
        let regex = /^([\w\!\#$\%\&\'\*\+\-\/\=\?\^\`{\|\}\~]+\.)*[\w\!\#$\%\&\'\*\+\-\/\=\?\^\`{\|\}\~]+@((((([a-z0-9]{1}[a-z0-9\-]{0,62}[a-z0-9]{1})|[a-z])\.)+[a-z]{2,6})|(\d{1,3}\.){3}\d{1,3}(\:\d{1,5})?)$/i
        if(email != null){
            CheckSubmit("email");
        }
        else{
            DeletObjectArray(email);
        }

        return regex.test(email);

    }

    function CheckPassword(password, passwordC){
        if(passwordC != null) {
            if (passwordC != password) {
                $("#InputRCPassword").addClass("invalid");
                console.log("Delet Password");
                DeletObjectArray("password");
            } else  {
                $("#InputRCPassword").removeClass("invalid");
                console.log("Ok Password");
                CheckSubmit("password");
            }
        }
    }

    function PasswordStr(password, score) {
        if (password.replace(/\s+/g, '').length >= 8) {
            score += 25;

        }
        if (/[a-z]/.test(password)) {
            score += 10;
        }
        if (/[A-Z]/.test(password)) {
            score += 15;
        }
        if (/[0-9]/.test(password)) {
            score += 15;
        }
        if (/[^\w ]/.test(password)){
            score += 35;
        }
        if (password.replace(/\s+/g, '').length <= 4) {
            score -= 10;
        }
        else {
            if (score < 20) {
                $(".progress-bar").css("background-color", "red")
            }
            if (score >= 35) {
                $(".progress-bar").css("background-color", "#FF4A00");
            }
            if (score >= 50) {
                $(".progress-bar").css("background-color", "yellow");
            }
            if (score >= 75) {
                $(".progress-bar").css("background-color", "green");
            }
        }

        $(".progress-bar").width(score.toString() + "%");

    }
});