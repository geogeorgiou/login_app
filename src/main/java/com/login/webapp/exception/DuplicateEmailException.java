package com.login.webapp.exception;

public class DuplicateEmailException extends RuntimeException{


    public DuplicateEmailException() {
    }

    public DuplicateEmailException(String message)
    {
        super(message + " mail already exists in DB!");
    }

}
