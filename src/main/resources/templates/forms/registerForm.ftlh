
<#--needs an action here and perhaps i could make just one form for register and edit user-->
<#--should action direct me to /user/mail-->
<#--***********************************************do i need to specify required here-->

<#--register form is defined here-->
<#--whether user registers or not will be directed to login page-->
<#--and prompted to login-->
<form class="needs-validation" action="/login" id="userValidator" method="POST">

<#--    row with first and last name input-->
    <div class="row">

        <div class="col-md-6 mb-3">
            <label for="firstName">First name</label>
            <input type="text" class="form-control" id="firstName" name="firstName" placeholder="Enter first name" required>
<#--            value=${owner.firstName}>-->
        </div>

        <div class="col-md-6 mb-3">
            <label for="lastName">Last name</label>
            <input type="text" class="form-control" id="lastName" name="lastName" placeholder="Enter last name" required>
        </div>

    </div>

    <#--    row with email and phone input-->
    <div class="row">

        <div class="col-md-6 mb-3">
            <label for="email">Email</label>
            <input type="email" class="form-control" id="email" name="email" placeholder="Enter email" required>
        </div>

        <div class="col-md-6 mb-3">
            <label for="phoneNumber">Phone Number</label>
            <input type="text" class="form-control" id="phoneNumber" name="phoneNumber" placeholder="Enter phone number">
        </div>

    </div>

    <#--    row with company-->
    <div class="row">
        <div class="col-md-6 mb-3">
            <label for="company">Company</label>
            <input type="text" class="form-control" id="company" name="company" placeholder="Enter Company">
        </div>
    </div>

    <#--    row with password-->
    <div class="row">

        <div class="col-md-6 mb-3">
            <label for="password">Password</label>
            <input type="password" class="form-control" id="password" name="password" placeholder="Enter password" required>

<#--            <span id="pass_err_msg"></span>-->
            <p><span class="emsg hidden">Please Enter a Valid Password</span></p>
        </div>

    </div>

    <#--    row with re-entered password-->
    <div class="row">

        <div class="col-md-6 mb-3">
            <label for="confirm_password">Confirm Password</label>
            <input type="password" class="form-control" id="confirm_password" name="confirm_password" placeholder="Re-enter password" required>

<#--            <span id="pass_err_msg"></span>-->
        </div>

    </div>

<#--    submit button-->
    <div class="col-md-6 order-md-1">
        <div class="row">
            <button class="btn btn-primary btn-lg mt-4" type="submit" >Register</button>&nbsp&nbsp&nbsp
            <span id="buttonAppear"></span>

            <button class="btn btn-primary btn-lg mt-4" type="submit" >Cancel</button>&nbsp&nbsp&nbsp
            <span id="buttonAppear"></span>
        </div>
    </div>
</form>