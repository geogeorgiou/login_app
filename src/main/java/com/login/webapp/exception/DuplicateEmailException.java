package com.login.webapp.exception;

public class DuplicateEmailException extends RuntimeException{



    public DuplicateEmailException() {
    }

    public DuplicateEmailException(String errorMessage, Throwable err) {
        super(errorMessage, err);
    }

}
