package com.blz.userregistration;

import org.junit.Assert;
import org.junit.Test;

public class UserRegistrationTest {
    UserRegistration userRegistration = new UserRegistration();

    @Test
    public void givenFirstNameStartWithCapitalAndMinimumThreeCharacter() {
        Boolean actual = userRegistration.validateFirstName("Tejaswini");
        Assert.assertEquals(true, actual);
    }

    @Test
    public void givenFirstNameStartWithLowercaseAndMinimumThreeCharacter() {
        Boolean actual = userRegistration.validateFirstName("tejaswini");
        Assert.assertEquals(false, actual);
    }

    @Test
    public void givenFirstNameStartWithCapitalAndMinimumTwoCharacter() {
        Boolean actual = userRegistration.validateFirstName("Tej");
        Assert.assertEquals(true, actual);
    }

    @Test
    public void givenLastNameStartWithCapitalAndMinimumThreeCharacter() {
        Boolean actual = userRegistration.validateLastName("Gholap");
        Assert.assertEquals(true, actual);
    }

    @Test
    public void givenLastNameStartWithLowerCaseAndMinimumThreeCharacter() {
        Boolean actual = userRegistration.validateLastName("gholap");
        Assert.assertEquals(false, actual);
    }

    @Test
    public void givenMobileNumberCountryFollowBySpaceWithTenDigitNumber() {
        Boolean actual = userRegistration.validateMobileNumber("91 9890305550");
        Assert.assertEquals(true, actual);

    }

    @Test
    public void givenPasswordOneUpperCaseOneSpecialCharacterOneNumericNumberMinimumEightCharacter() {
        Boolean actual = userRegistration.validatePassword("Green4*apple");
        Assert.assertEquals(true, actual);
    }
}