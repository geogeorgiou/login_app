jQuery(function ($){

    const userValidator = $('#userValidator');

    if (userValidator.validate) {
        userValidator.validate({
            rules: {

                firstName: {
                    required: true
                },
                lastName: {
                    required: true
                },
                email: {
                    required: true,
                    email: true
                },

                password:{
                    required: true,
                    minlength: 8
                },


                confirm_password:{
                    required: true,
                    minlength: 8,
                    equalTo: "#password"
                },

                phoneNumber: {
                    digits: true,
                    minlength: 10,
                    maxlength: 10
                },

            },
            messages: {

                email: {
                    required: 'Enter your email! 📧',
                },
                firstName: {
                    required: 'Enter your first name'
                },
                lastName: {
                    required: 'Enter your last name'
                },
                password: {
                    required: 'Enter your password',
                    minlength: 'Password should be more than 8 characters',
                },

                confirm_password:{
                    required: 'Re-enter password',
                    minlength: 'Password should be more than 8 characters',
                    equalTo: 'Please enter the same password'
                },
                phoneNumber: {
                    minlength: 'Phone number should be 10 digits',
                    maxlength: 'Phone number should be 10 digits',
                    digits: 'Phone number should contain only digits'
                },

            }
        });
    }


});

// strongRegex = new RegExp("^(?=.*[a-z])(?=.*[A-Z])(?=.*[0-9])(?=.*[!@#\$%\^&\*])(?=.{8,})");
// var regExp = new RegExp("^(?=.{8})") //means 8 chars
//
// var regExp = new RegExp("^(?=.[0-9])") //means 1 numeric
//
// var regExp = new RegExp("(?=.*[!@#$%^&*]) ") //special char
//
//
// var regExp = new RegExp("^(?=.{8})(?=.*[a-z])") //8 chars 1 a-z
//
// var regExp = new RegExp("^(?=.{8,})(?=.*[a-z])|^(?=.{8,})(?=.*[A-Z])") //8 chars 1> a-z || 8 chars 1> A-Z
//
// var regExp = new RegExp("^((?=.*[a-z])|(?=.*[A-Z]))(?=.*[!@#$%^&*])[0-9a-zA-Z!@#$%^&*]{8,}");
//
// final check ^((?=.*[a-z])|(?=.*[A-Z]))(?=.*[!@#$%^&*])(?=.*[0-9])[0-9a-zA-Z!@#$%^&*]{8,}