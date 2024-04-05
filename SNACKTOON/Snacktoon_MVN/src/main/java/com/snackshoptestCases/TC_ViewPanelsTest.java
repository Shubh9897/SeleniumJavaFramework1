package com.snackshoptestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.snackshop.pageObjects.HomePage;
import com.snackshop.pageObjects.ViewPanelsPage;

public class TC_ViewPanelsTest extends BaseClass {

	@Test
	public void viewPanelsTest() {
		// Navigate to the page where the View Panels button is available
		HomePage homePage = new HomePage(driver);
		homePage.navigateToViewPanelsPage(); // You need to implement this method in HomePage class

		// Click on the View Panels button
		ViewPanelsPage viewPanelsPage = new ViewPanelsPage(driver);
		viewPanelsPage.clickViewPanelsButton();

		// Verify that the panel is displayed
		Assert.assertTrue(viewPanelsPage.isPanelDisplayed(), "Panel is displayed after clicking View Panels button");

		// You can add more assertions or validations as needed
	}

}
