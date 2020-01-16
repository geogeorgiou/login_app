<#--<!DOCTYPE html>-->
<#--<html lang="en">-->
<#--<head>-->

<#--    <#include  "../partials/head.ftlh">-->
<#--    <title>Home</title>-->
<#--</head>-->
<#--<body>-->

<#--    <#include "../forms/userForm.ftlh">-->

<#--    <#include "../partials/body.ftlh">-->

<#--    <script src="/validator.js"></script>-->
<#--</body>-->
<#--</html>-->

<#import "/spring.ftl" as spring />

<!DOCTYPE html>
<html lang="en">
<head>

    <#include  "../partials/head.ftlh">
    <title>Home</title>

</head>
<body>
<nav class="navbar navbar-dark sticky-top bg-dark flex-md-nowrap p-0">

    <a class="navbar-brand col-sm-3 col-md-2 mr-0">

        <span>Home Page</span>
    </a>

    <ul class="navbar-nav px-3">
        <li class="nav-item text-nowrap">

            <a class="nav-link" href="/login">Logout</a>

        </li>
    </ul>
</nav>
<div class="container-fluid">
    <div class="row">
        <nav class="col-md-2 d-none d-md-block bg-light sidebar">
            <div class="sidebar-sticky">

            </div>
        </nav>

        <main role="main" class="col-md-9 ml-sm-auto col-lg-10 pt-3 px-4">
            <h2>User's profile:</h2>

            <#include "../forms/userForm.ftlh">

        </main>
    </div>
</div>
<#include "../partials/body.ftlh">
<script>
    feather.replace();
</script>


<script src="js/passValidator.js"></script>
<script src="js/validator.js"></script>

</body>
</html>


