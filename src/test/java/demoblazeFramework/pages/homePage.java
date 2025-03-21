package demoblazeFramework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homePage {

	WebDriver driver;

	public homePage(WebDriver ldriver) {

		this.driver = ldriver;

	}

	@FindBy(xpath = "//div[@class='card-block']//a[text()='Samsung galaxy s6']")
	WebElement selectSamsungProduct;

	public void selectProduct() {

		selectSamsungProduct.click();

	}

}
