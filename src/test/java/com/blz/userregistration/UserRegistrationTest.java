package com.blz.userregistration;
import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    //handling exceptions to given first names in improper format.
    @Test
    public void handleExceptionForGivenFirstNameStartWithCapitalAndNoMinimumThreeCharacter() {
        try {
            Assert.assertEquals(true, userRegistration.validateFirstName("Tei"));
        } catch (UserRegistrationException exception) {
            System.out.println(exception);
        }
    }

    @Test
    public void handleExceptionForGivenFirstNameStartWithLowercase() {
        try {
            Assert.assertEquals(true, userRegistration.validateFirstName("tejasWini"));
        } catch (UserRegistrationException exception) {
            System.out.println(exception);
        }
    }

    @Test
    public void handleNOExceptionForGivenFirstNameStartWithCapitalAndMinimumThreeCharacter() {
        try {
            Assert.assertEquals(true, userRegistration.validateFirstName("Tejaswini"));
        } catch (UserRegistrationException exception) {
            System.out.println(exception);
        }
    }

    //handling exceptions to given last names in improper format.
    @Test
    public void handleNoExceptionForGivenLastNameStartWithCapitalAndMinimumThreeCharacter() {
        try {
            Assert.assertEquals(true, userRegistration.validateLastName("Shinde"));
        } catch (UserRegistrationException exception) {
            System.out.println(exception);
        }
    }

    @Test
    public void handleCustomExceptionForGivenLastNameStartWithLowerCaseAndMinimumThreeCharacter() {
        try {
            Assert.assertEquals(true, userRegistration.validateLastName("gholap"));
        } catch (UserRegistrationException exception) {
            System.out.println(exception);
        }
    }

    @Test
    public void handleCustomExceptionForGivenLastNameStartWithUpperCaseAndNoMinimumThreeCharacter() {
        try {
            Assert.assertEquals(true, userRegistration.validateLastName("Gh"));
        } catch (UserRegistrationException exception) {
            System.out.println(exception);
        }
    }

    //handling exceptions to given Mobile number in improper format.
    @Test
    public void handleCustomExceptionForGivenMobileNumberWithoutCountryCode() {
        try {
            Assert.assertEquals(true, userRegistration.validateMobileNumber("9030555124"));
        } catch (UserRegistrationException exception) {
            System.out.println(exception);
        }
    }

    @Test
    public void handleCustomExceptionForGivenMobileNumberCountryFollowBySpaceMoreThanTenDigitNumber() {
        try {
            Assert.assertEquals(true, userRegistration.validateMobileNumber("91 9305550007870"));
        } catch (UserRegistrationException exception) {
            System.out.println(exception);
        }
    }

    @Test
    public void handleNoCustomExceptionGivenMobileNumber() {
        try {
            Assert.assertEquals(true, userRegistration.validateMobileNumber("91 9890306020"));
        } catch (UserRegistrationException exception) {
            System.out.println(exception);
        }

    }

    //handling exceptions to given Password in improper format.
    @Test
    public void handleNoCustomExceptionForGivenPassword() throws UserRegistrationException {
        try {
            Assert.assertEquals(true, userRegistration.validatePassword("Cat@12345"));
        } catch (UserRegistrationException exception) {
            System.out.println(exception);
        }
    }

    @Test
    public void handleCustomExceptionForGivenPasswordWithoutUppercase() {
        try {
            Assert.assertEquals(true, userRegistration.validatePassword("cat@12345"));
        } catch (UserRegistrationException exception) {
            System.out.println(exception);
        }
    }

    @Test
    public void handleCustomExceptionForGivenPasswordWithMoreThanOneSpecialCharacter() {
        try {
            Assert.assertEquals(true, userRegistration.validatePassword("Hi!@#12345"));
        } catch (UserRegistrationException exception) {
            System.out.println(exception);
        }
    }

    //  handling exceptions to given EmailId in improper format.
    @Test
    public void handleNoCustomExceptionGivenEmailId() {
        try {
            Assert.assertEquals(true, userRegistration.validateEmail("abc25@gmail.com"));
        } catch (UserRegistrationException exception) {
            System.out.println(exception);
        }
    }

    @Test
    public void handleCustomExceptionGivenMandatoryTwoParts() {
        try {
            Assert.assertEquals(true, userRegistration.validateEmail("xyz25@gmail.co.in"));
        } catch (UserRegistrationException exception) {
            System.out.println(exception);
        }
    }

    @Test
    public void handleCustomExceptionGivenEmailInImproperFormat() {
        try {
            Assert.assertEquals(true, userRegistration.validateEmail("2514gho@com.in"));
        } catch (UserRegistrationException exception) {
            System.out.println(exception);
        }
    }


}
