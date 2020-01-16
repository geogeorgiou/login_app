<#--<!DOCTYPE html>-->
<#--<html lang="en">-->
<#--<head>-->

<#--    <#include  "../partials/head.ftlh">-->
<#--    <title>Login</title>-->
<#--</head>-->
<#--<body>-->

<#--&lt;#&ndash;    login form here&ndash;&gt;-->
<#--    <form class="form-login needs-validation" action="/login"  id="user-login" method="POST" >-->

<#--        <div class='preload login--container'>-->
<#--            <div class='login--form'>-->
<#--                <div class='login--username-container'>-->
<#--                    <label for="email" class="sr-only">Email</label>-->
<#--                    <input type="email" name="username" id="email" class="form-control" placeholder="Email address"  value="" required >-->
<#--                    <div class="invalid-feedback">-->
<#--                        Valid email is required.-->
<#--                    </div>-->
<#--                </div>-->
<#--                <div class='login--password-container'>-->
<#--                    <label for="password" class="sr-only">Password</label>-->
<#--                    <input type="password" name="password" id="password" class="form-control" placeholder="Password"  value="" required>-->
<#--                    <div class="invalid-feedback">-->
<#--                        Password is required.-->
<#--                    </div>-->
<#--                    <button class="js-toggle-login login--login-submit" type="submit" >Login</button>-->
<#--                </div>-->

<#--            </div>-->
<#--        </div>-->

<#--&lt;#&ndash;        somewhere here add anchor link to /register page&ndash;&gt;-->
<#--&lt;#&ndash;        **insert text Have you registered yet?**&ndash;&gt;-->
<#--    </form>-->

<#--    <#include "../partials/body.ftlh">-->
<#--</body>-->
<#--</html>-->

<!DOCTYPE html>
<html lang="en">
<head>

    <link rel="stylesheet" href="https://getbootstrap.com/docs/4.0/examples/sign-in/signin.css">
    <link rel="stylesheet" href="https://getbootstrap.com/docs/4.0/examples/checkout/form-validation.css">
    <link rel="stylesheet" type="text/css" href="css/login_styles.css">

    <title>Login</title>
    <#include  "../partials/head.ftlh">

</head>
<body class="text-center">

<form class="form-login needs-validation" action="/home"  id="user-login" >
    <svg xmlns="http://www.w3.org/2000/svg" width="24" height="24" viewBox="0 0 24 24" fill="none" stroke="currentColor"
         stroke-width="2" stroke-linecap="round" stroke-linejoin="round" class="mb-4">
        <rect x="3" y="3" width="18" height="18" rx="2" ry="2"></rect>
        <circle cx="8.5" cy="8.5" r="1.5"></circle>
        <polyline points="21 15 16 10 5 21"></polyline>
    </svg>
    <h1 class="h3 mb-3 font-weight-normal">Please login</h1>
    <div class="mb-3">
        <label for="inputEmail" class="sr-only">Email address</label>
        <input type="email" name="email" id="inputEmail" class="form-control" placeholder="Email address"  value="" required >
        <div class="invalid-feedback">
            Valid email is required.
        </div>
    </div>
    <div class="mb-3">
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" name="id" id="inputPassword" class="form-control" placeholder="Password"  value="" required>
        <div class="invalid-feedback">
            Password is required.
        </div>
    </div>
    <button class="btn btn-lg btn-primary btn-block mt-4" type="submit">Login</button>

    <div class="register_anchor_container">
        <a class="register_anchor" href="/register">Have you registered yet?</a>
    </div>

</form>
<#include "../partials/body.ftlh">

<script>
    feather.replace();
</script>

</body>
</html>

