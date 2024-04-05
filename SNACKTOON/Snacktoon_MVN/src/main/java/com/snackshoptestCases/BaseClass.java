package com.snackshoptestCases;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

public class BaseClass {
	// these things are common for every test cases
	public String baseurl = "http://d1kqfimm7guqxf.cloudfront.net/signin";
	//public String username = "standard_user";
	//public String password = "secret_sauce";
	public static WebDriver driver;

	@SuppressWarnings("deprecation")
	@BeforeClass
	public void setup() {
		System.setProperty("Webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		// instanciate the driver
		driver = new ChromeDriver();
		// Maximize the browser window
        driver.manage().window().maximize();
     // Set implicit wait time
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

	}

	public void teardown() {
		driver.quit();

	}
}
