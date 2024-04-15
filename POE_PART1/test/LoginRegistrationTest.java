/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import poe_part1.Login;
import poe_part1.Registration;

/**
 *
 * @author Talha
 */
public class LoginRegistrationTest {

    // Test data for registration
    private String regUsername1 = "kyl_1";
    private String regUsername2 = "kyle!!!!!!!";
    private String regPassword1 = "Ch&&sec@ke99!";
    private String regPassword2 = "password";

    // Test data for login
    private String loginUsername = "kyl_1";
    private String loginPassword = "Ch&&sec@ke99!";

    @Test
    public void testRegistrationUsernameFormatted() {
        Registration registration = new Registration(regUsername1, regPassword1);
        assertTrue(registration.checkUserName());
    }

    @Test
    public void testRegistrationUsernameNotFormatted() {
        Registration registration = new Registration(regUsername2, regPassword1);
        assertFalse(registration.checkUserName());
    }

    @Test
    public void testRegistrationPasswordComplexity() {
        Registration registration = new Registration(regUsername1, regPassword1);
        assertTrue(registration.checkPasswordComplexity());
    }

    @Test
    public void testRegistrationPasswordNotComplex() {
        Registration registration = new Registration(regUsername1, regPassword2);
        assertFalse(registration.checkPasswordComplexity());
    }

    @Test
    public void testLoginSuccessful() {
        Login login = new Login(loginUsername, loginPassword);
        assertTrue(login.verifyLogin(loginUsername, loginPassword));
    }

    @Test
    public void testLoginFailed() {
        Login login = new Login(loginUsername, loginPassword);
        assertFalse(login.verifyLogin(loginUsername, "wrongPassword"));
    }

    @Test
    public void testUsernameCorrectlyFormatted() {
        Registration registration = new Registration(regUsername1, regPassword1);
        assertTrue(registration.checkUserName());
    }

    @Test
    public void testUsernameIncorrectlyFormatted() {
        Registration registration = new Registration(regUsername2, regPassword1);
        assertFalse(registration.checkUserName());
    }

    @Test
    public void testPasswordMeetsComplexityRequirements() {
        Registration registration = new Registration(regUsername1, regPassword1);
        assertTrue(registration.checkPasswordComplexity());
    }

    @Test
    public void testPasswordDoesNotMeetComplexityRequirements() {
        Registration registration = new Registration(regUsername1, regPassword2);
        assertFalse(registration.checkPasswordComplexity());
    }
}