package com.snackshoptestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.snackshop.pageObjects.LoginPage;

public class TC_LoginTest_01 extends BaseClass {
	 @Test
	    public void testSuccessfulLogin() {
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.setEmail("shubham@tester.com");
	        loginPage.setPassword("Hello@123");
	        loginPage.clickLoginButton();
	        Assert.assertTrue(driver.getCurrentUrl().contains("home"), "Login not successful");
	    }

	    @Test
	    public void testInvalidCredentials() {
	        LoginPage loginPage = new LoginPage(driver);
	        loginPage.setEmail("invalid@example.com");
	        loginPage.setPassword("invalidpassword");
	        loginPage.clickLoginButton();
	        Assert.assertEquals(loginPage.getErrorMessage(), "Invalid credentials", "Error message mismatch");
	    }

	    @Test
	    public void testForgotPassword() {
	        @SuppressWarnings("unused")
			LoginPage loginPage = new LoginPage(driver);
	        // Click on Forgot Password link
	        // Enter email
	        // Click on Submit button
	        // Assert that the email has been sent successfully
	    }

	    @Test
	    public void testPasswordRequirements() {
	        LoginPage loginPage = new LoginPage(driver);
	        // Enter password without meeting minimum requirements
	        loginPage.setEmail("example@example.com");
	        loginPage.setPassword("password");
	        loginPage.clickLoginButton();
	        Assert.assertTrue(loginPage.getErrorMessage().contains("Password must have"), "Password requirements not shown");
	    }

	    @Test
	    public void testPasswordMasking() {
	        @SuppressWarnings("unused")
			LoginPage loginPage = new LoginPage(driver);
	        // Enter password and verify if it is masked
	        // Use JavaScriptExecutor to check if the password field has the 'type' attribute as 'password'
	    }

	    // Add more test cases as needed..
}
