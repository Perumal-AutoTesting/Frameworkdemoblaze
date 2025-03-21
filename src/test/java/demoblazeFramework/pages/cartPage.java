package demoblazeFramework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;

public class cartPage {

	WebDriver driver;

	public cartPage(WebDriver ldriver) {

		this.driver = ldriver;
	}

	@FindBy(xpath = "//tr[@class='success']//td[text()='Samsung galaxy s6']")
	WebElement verifySamsungGalaxyProduct;

	@FindBy(xpath = "//tr[@class='success']//a[text()='Delete']")
	WebElement deleteSamsungGalaxyProduct;

	@FindBy(xpath = "//div[@class='panel panel-info']/following-sibling::button[1]")
	WebElement placeSamsunGalaxyOrder;

	public void verifySamsunProductInCart() {

		Assert.assertTrue(verifySamsungGalaxyProduct.isDisplayed(), "Samsung Galaxy S6 is not present in the cart");
	}

	public void deleteSamsunProductFromCart() {

		deleteSamsungGalaxyProduct.click();

	}

	public void SamsunPlaceOrder() {

		placeSamsunGalaxyOrder.click();
	}

}
