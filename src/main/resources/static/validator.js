jQuery(function ($){

    const userRegister = $('#userRegister');

    if (userRegister.validate) {
        userRegister.validate({
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
                    required: true
                },

                confirm_password:{
                    required: true
                },

                phoneNumber: {
                    // required: true,
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
                    required: 'Enter your password'
                },

                confirm_password:{
                    required: 'Re-enter password'
                },
                phoneNumber: {
                    minlength: 'Phone number should be 10 digits',
                    maxlength: 'Phone number should be 10 digits',
                    digits: 'Phone number should contain only digits'
                },

            }
        });
    }


    const userHome = $('#userHome');
    if (userHome.validate) {
        userHome.validate({
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
                    required: true
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
                    required: 'Enter your password'
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