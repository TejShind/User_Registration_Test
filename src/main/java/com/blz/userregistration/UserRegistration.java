package com.blz.userregistration;

import java.util.regex.Pattern;

public class UserRegistration {
    public final String firstName = "^[A-Z]{1}[a-z]{2,}$";//Name starts with Cap and has minimum 3 characters
    public final String lastName = ("^[A-Z]{1}[a-z]{3,}$");//Name starts with Cap and has minimum 3 characters
    public final String mobileNumber = "^[0-9]{2}\s?[0-9]{10}$";//e.g 91 991981980
    public final String passWord = "^(?=.{8,})(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])[0-9a-zA-z]*[!@~#$%^&*?_][0-9a-zA-Z]*$";
    public final String sampleEmail = "^[a-z]{3,}(([.|+]{1})?([-]{1})?[0-9]{1,})?@[a-z0-9]{1,}.[a-z]{3}(.[a-z]{2,4})?$";////e.g abc.xyz@blz.co.in

    public UserRegistration() {

    }

    public boolean validateFirstName(String enteredFirstName) throws UserRegistrationException {
        try {
            if (enteredFirstName == null || enteredFirstName.isEmpty()) {
                throw new UserRegistrationException("Enter first name", UserRegistrationException.ExceptionType.FIRST_NAME_INVALID);
            } else {
                Pattern pattern = Pattern.compile(firstName);

                if (pattern.matcher(enteredFirstName).matches()) {
                    return true;
                } else {
                    throw new UserRegistrationException("Entered name is Invalid");
                }
            }
        } catch (UserRegistrationException validity) {
            throw new UserRegistrationException("Enter the valid First name");

        }
    }

    public boolean validateLastName(String enteredLastName) throws UserRegistrationException {
        try {
            if (enteredLastName == null || enteredLastName.isEmpty()) {
                throw new UserRegistrationException("Enter last name", UserRegistrationException.ExceptionType.LAST_NAME_INVALID);
            } else {
                Pattern pattern = Pattern.compile(lastName);

                if (pattern.matcher(enteredLastName).matches()) {
                    return true;
                } else {
                    throw new UserRegistrationException("Entered name is Invalid");
                }
            }
        } catch (UserRegistrationException validity) {
            throw new UserRegistrationException("Enter the valid Last name");
        }
    }

    public boolean validateEmail(String enteredEmail) throws UserRegistrationException {
        try {
            if (enteredEmail == null || enteredEmail.isEmpty()) {
                throw new UserRegistrationException("Enter Email", UserRegistrationException.ExceptionType.EMAIL_INVALID);
            } else {
                Pattern pattern = Pattern.compile(sampleEmail);

                if (pattern.matcher(enteredEmail).matches()) {
                    return true;
                } else {
                    throw new UserRegistrationException("Entered Email is Invalid");
                }
            }
        } catch (UserRegistrationException validity) {
            throw new UserRegistrationException("Enter the valid Email address");
        }
    }

    public boolean validateMobileNumber(String in) throws UserRegistrationException {

        try {
            if (in == null || in.isEmpty()) {
                throw new UserRegistrationException("Enter Mobile number", UserRegistrationException.ExceptionType.MOBILE_NUMBER_INVALID);
            } else {
                Pattern pattern = Pattern.compile(mobileNumber);

                if (pattern.matcher(in).matches()) {
                    return true;
                } else {
                    throw new UserRegistrationException("Entered number is Invalid");
                }
            }
        } catch (UserRegistrationException validity) {

            throw new UserRegistrationException("Enter the valid Mobile number");
        }
    }

    public boolean validatePassword(String enteredPassWord) throws UserRegistrationException {

        try {
            if (enteredPassWord == null || enteredPassWord.isEmpty()) {
                throw new UserRegistrationException("Enter password", UserRegistrationException.ExceptionType.PASSWORD_INVALID);
            } else {
                Pattern pattern = Pattern.compile(passWord);

                if (pattern.matcher(enteredPassWord).matches()) {
                    return true;
                } else {
                    throw new UserRegistrationException("Entered password is Invalid");
                }
            }
        } catch (UserRegistrationException validity) {

            throw new UserRegistrationException("Enter the password");
        }
    }
}