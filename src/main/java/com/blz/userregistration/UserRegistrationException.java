package com.blz.userregistration;

class UserRegistrationException extends Exception {

    public String message;
    public ExceptionType exceptionType;

    UserRegistrationException(String message) {
        this.message = message;

    }

    UserRegistrationException(String message, ExceptionType exceptionType) {

        this.message = message;
        this.exceptionType = exceptionType;
    }

    @Override
    public String toString() {
        return "UserRegistrationException{" +
                "message='" + message + '\'' +
                ", exceptionType=" + exceptionType +
                '}';
    }

    public enum ExceptionType {
        FIRST_NAME_INVALID, LAST_NAME_INVALID, EMAIL_INVALID, MOBILE_NUMBER_INVALID, PASSWORD_INVALID;
    }
}
