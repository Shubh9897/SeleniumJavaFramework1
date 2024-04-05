package snippet;

public class Snippet {
	System.setProperty("webdriver.chrome.driver", "C:\\Program Files\\chromedriver-win64\\chromedriver.exe");
	
			ChromeOptions options = new ChromeOptions();
			  options.addArguments("--remote-allow-origins=*");
			  // Create Selenium web Driver instance
			  ChromeDriver driver = new ChromeDriver(options);
}

