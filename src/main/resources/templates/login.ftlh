<!DOCTYPE html>
<html lang="en">
<head>

    <#include  "partials/head.ftlh">
<#--    <#include "../partials/body.ftlh">-->
    <title>Login</title>
</head>
<body>

<#--    login form here-->
    <form class="form-login needs-validation" action="/login"  id="user-login" method="POST" >

        <div class='preload login--container'>
            <div class='login--form'>
                <div class='login--username-container'>
                    <label for="email" class="sr-only">Email</label>
                    <input type="email" name="username" id="email" class="form-control" placeholder="Email address"  value="" required >
                    <div class="invalid-feedback">
                        Valid email is required.
                    </div>
                </div>
                <div class='login--password-container'>
                    <label for="password" class="sr-only">Password</label>
                    <input type="password" name="password" id="password" class="form-control" placeholder="Password"  value="" required>
                    <div class="invalid-feedback">
                        Password is required.
                    </div>
                    <button class="js-toggle-login login--login-submit" type="submit" >Login</button>
                </div>

            </div>
        </div>

<#--        somewhere here add anchor link to register page-->
    </form>

    <#include "partials/body.ftlh">
</body>
</html>