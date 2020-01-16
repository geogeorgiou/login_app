<!DOCTYPE html>
<html lang="en">
<head>

    <#include  "../partials/head.ftlh">
    <title>Register</title>

</head>
<body>
<nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0">

    <a class="navbar-brand col-sm-3 col-md-2 mr-0">

        <span>Register Page</span>
    </a>

<#--    <ul class="navbar-nav px-3">-->
<#--        <li class="nav-item text-nowrap">-->

<#--            <a class="nav-link" href="/login">Logout</a>-->

<#--        </li>-->
<#--    </ul>-->
</nav>
<div class="container-fluid">
    <div class="row">
        <nav class="col-md-2 d-none d-md-block bg-light sidebar">
            <div class="sidebar-sticky">

            </div>
        </nav>

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <h2>Register info:</h2>

            <#include "../forms/registerForm.ftlh">

        </main>
    </div>
</div>
<#include "../partials/body.ftlh">
<script>
    feather.replace();
</script>

<#--redirects to login page without input validation-->
<script type="text/javascript">
    document.getElementById("cancelBtn").onclick = function () {
        location.href = "/login";
    };
</script>

<script src="js/passValidator.js"></script>
<script src="js/validator.js"></script>

</body>
</html>


