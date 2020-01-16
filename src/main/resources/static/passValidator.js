
$(document).ready(function(){

    //we define a regular expression to accept
    //at least 1 char [a-z]
    //at least 1 char [A-Z]
    //at least 1 number [0-9]
    //at least 1 special char

    // var $regexname=/^( (?=.*[a-z]) | (?=.*[A-Z]) ) (?=.*[!@#$%^&*]) (?=.*[0-9]) [0-9a-zA-Z!@#$%^&*] {8,} $/;

    var $regexname = /^((?=.*[a-z])|(?=.*[A-Z]))(?=.*[!@#$%^&*])(?=.*[0-9])[0-9a-zA-Z!@#$%^&*]{8,}$/;

    $('#password').on('keypress keydown keyup',function(){
        if (!$(this).val().match($regexname)) {
            // there is a mismatch, hence show the error message
            $('.emsg').removeClass('hidden');
            $('.emsg').show();
        }
        else{
            // else, do not display message
            $('.emsg').addClass('hidden');
        }
    });
});

