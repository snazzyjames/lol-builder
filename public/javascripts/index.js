$(document).ready(function(){
    var toggle = 1;
    $("#login-form").show();
    $("#register-form").hide();
    $("#login-register-switch").text("Create an Account").click(function(){
        if(toggle == 1) {
            $("#login-form").hide();
            $("#register-form").show();
            $("#login-register-switch").text("Already have an account?");
            toggle = 0;
        }
        else{
            $("#register-form").hide();
            $("#login-form").show();
            $("#login-register-switch").text("Create an Account");
            toggle = 1;
        }
    });
});
