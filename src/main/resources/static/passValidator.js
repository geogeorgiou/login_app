
//function to call when submitting changes to password
function passValidator() {

    //we define a regular expression to accept
    //at least 1 char [a-z]
    //at least 1 char [A-Z]
    //at least 1 number [0-9]
    //at least 1 special char

    var $regexname = /^((?=.*[a-z])|(?=.*[A-Z]))(?=.*[!@#$%^&*])(?=.*[0-9])[0-9a-zA-Z!@#$%^&*]{8,}$/;

    var password = document.getElementById("password").value;

    //check if password matches regular expression format
    if ($regexname.test(password)){
        $('.emsg').addClass('hidden');
        return true;
    }
    $('.emsg').removeClass('hidden');
    $('.emsg').show();
    return false;

}
