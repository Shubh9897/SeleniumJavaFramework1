package com.snackshop.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ViewPanelsPage {
	// here ldriver is the local driver
	WebDriver ldriver;
	//Create the constructor(and take the WebDriver as the parameter)
	// here rdriver is the remotedriver
	public ViewPanelsPage(WebDriver rdriver)
	{
		ldriver=rdriver;
		//Specify the PageFactory
		PageFactory.initElements(rdriver,this);
	}
	  @FindBy(id = "view-panels-button")
	    WebElement viewPanelsButton;

	    @FindBy(id = "panel1") // Assuming this is the ID of the first panel
	    WebElement panel1;

	    // Method to click on the View Panels button
	    public void clickViewPanelsButton() {
	        viewPanelsButton.click();
	    }

	    // Method to check if the panel is displayed
	    public boolean isPanelDisplayed() {
	        return panel1.isDisplayed();
	    }
}
