package com.snackshop.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	// here ldriver is the local driver
	WebDriver ldriver;

	// Create the constructor(and take the WebDriver as the parameter)
	// here rdriver is the remotedriver
	public LoginPage(WebDriver rdriver) {
		ldriver = rdriver;
		// Specify the PageFactory
		PageFactory.initElements(rdriver, this);
	}

	 @FindBy(xpath = "//input[@ name=\"email\"]")
	    private WebElement emailInput;

	    @FindBy(xpath = "//input[@ name=\"password\"]")
	    private WebElement passwordInput;

	    @FindBy(xpath = "//button[normalize-space()='Login']")
	    private WebElement loginButton;

	    @FindBy(id = "error-msg")
	    private WebElement errorMessage;

	// write action method for the above element

	    public void setEmail(String email) {
	        emailInput.sendKeys(email);
	    }

	    public void setPassword(String password) {
	        passwordInput.sendKeys(password);
	    }

	    public void clickLoginButton() {
	        loginButton.click();
	    }

	    public String getErrorMessage() {
	        return errorMessage.getText();
	    }
}
