package day23_expresion;

import org.junit.Assert;
import org.junit.Test;

import day23_lamda_expresion.User_Validation;
import day23_lamda_expresion.Validation_Exp;



public class User_ValidationTest {
    @Test
    public void givenFirstName_Validation() {
        User_Validation validation = new User_Validation();
        boolean actualResult = true;
        try {
            actualResult = validation.firstNameValidation("Himanshu");
        } catch (Validation_Exp exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }

    @Test
    public void giveLastName_Validation() {
        User_Validation validation = new User_Validation();
        boolean actualResult = true;
        try {
            actualResult = validation.lastNameValidation("dhangar");
        } catch (Validation_Exp exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }

    @Test
    public void givenEmail_Validation() {
        User_Validation validation = new User_Validation();
        boolean actualResult = true;
        try {
            actualResult = validation.emailValidation("mkaubr007@gmail.com");
        } catch (Validation_Exp exception) {
            Assert.assertEquals(actualResult, exception);
        }
    }

    @Test
    public void givenPhoneNumber_Validation() {
        User_Validation validation = new User_Validation();
        boolean actualResult = true;
        try {
            actualResult = validation.phoneNumberValidation("+918002695700");
        } catch (Validation_Exp exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }

    @Test
    public void givenPassword_Validation() {
        User_Validation validation = new User_Validation();
        boolean actualResult = true;
        try {
            actualResult = validation.passwordValidation("qw1rt@Ms");
        } catch (Validation_Exp exception) {
            Assert.assertEquals(actualResult, exception.message);
        }
    }


}