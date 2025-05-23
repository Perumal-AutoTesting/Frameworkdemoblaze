package demoblazeFramework.pages;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;

import demoblazeFramework.utility.BrowserFactory;

public class BasePage {

	public WebDriver driver;

	@BeforeClass
	public void setUp() {

		driver = BrowserFactory.startBrowser("chrome", "https://www.demoblaze.com", driver);
	}

	@AfterClass
	public void tearDown() {
		BrowserFactory.closeBrowser(driver);
		
	
	}

}
