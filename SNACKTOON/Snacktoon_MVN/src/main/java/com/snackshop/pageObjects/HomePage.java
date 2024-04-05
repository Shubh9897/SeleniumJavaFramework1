package com.snackshop.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	// here ldriver is the local driver
		WebDriver ldriver;
		//Create the constructor(and take the WebDriver as the parameter)
		// here rdriver is the remotedriver
		public HomePage(WebDriver rdriver)
		{
			ldriver=rdriver;
			//Specify the PageFactory
			PageFactory.initElements(rdriver,this);
		}
		 // WebElements
	    @FindBy(id = "simple-tab-")
	    WebElement uploadButton;
	    // Methods for upload functionality
	    public void clickUploadButton() {
	        uploadButton.click();
	    }
		public void uploadFile(String string) {
		
			
		}
		public void navigateToViewPanelsPage() {
			// TODO Auto-generated method stub
			
		}
}
