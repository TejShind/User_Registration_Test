package com.blz.userregistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {
    public final String firstName = "^[A-Z]{1}[a-z]{2,}$";//Name starts with Cap and has minimum 3 characters
    public final String lastName = ("^[A-Z]{1}[a-z]{3,}$");//Name starts with Cap and has minimum 3 characters
    public final String mobileNumber = "^[0-9]{2}\s?[0-9]{10}$";//e.g 91 991981980
    public final String passWord = "(?=.{8,})(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])[0-9a-zA-Z]*[@#$%_!^&*][0-9a-zA-Z]*";
    public final String sampleEmail = "^[a-z]{3,}(([.|+]{1})?([-]{1})?[0-9]{1,})?@[a-z0-9]{1,}.[a-z]{3}(.[a-z]{2,4})?$";

    public boolean validateFirstName(String enteredFirstName) {
        Pattern pattern = Pattern.compile(firstName);
        Matcher matcher = pattern.matcher(enteredFirstName);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validateLastName(String enteredLastName) {
        Pattern pattern = Pattern.compile(lastName);
        Matcher matcher = pattern.matcher(enteredLastName);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validateEmail(String enteredEmail) {
        Pattern pattern = Pattern.compile(sampleEmail);
        Matcher matcher = pattern.matcher(enteredEmail);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validateMobileNumber(String in) {
        Pattern pattern = Pattern.compile(mobileNumber);
        Matcher matcher = pattern.matcher(in);
        if (matcher.matches())
            return true;
        else
            return false;
    }

    public boolean validatePassword(String password) {
        Pattern pattern = Pattern.compile(passWord);
        Matcher matcher = pattern.matcher(password);
        if (matcher.matches())
            return true;
        else
            return false;
    }

}
