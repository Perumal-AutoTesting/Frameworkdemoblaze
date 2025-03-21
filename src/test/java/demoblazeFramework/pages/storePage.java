package demoblazeFramework.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class storePage {

	WebDriver driver;

	public storePage(WebDriver ldriver) {

		this.driver = ldriver;

	}

	@FindBy(xpath = "//div[@class='row']//a[text()='Add to cart']")
	WebElement addToCartButton;

	@FindBy(id = "cartur")
	WebElement cartLink;

	public void clickAddToCartButton() {

		addToCartButton.click();
	}

	public void clickOnCartLink() {

		cartLink.click();
	}

}
