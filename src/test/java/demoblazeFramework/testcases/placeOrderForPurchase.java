package demoblazeFramework.testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import demoblazeFramework.pages.BasePage;
import demoblazeFramework.pages.cartPage;
import demoblazeFramework.pages.homePage;
import demoblazeFramework.pages.storePage;
import demoblazeFramework.utility.PopupUtility;

public class placeOrderForPurchase extends BasePage {

	@Test
	public void purchaseOrder() throws InterruptedException {

		homePage homePage = PageFactory.initElements(driver, homePage.class);
		homePage.selectProduct();
		storePage storePage = PageFactory.initElements(driver, storePage.class);
		storePage.clickAddToCartButton();
		PopupUtility.handlingAlertPopup(driver);
		storePage.clickOnCartLink();
		cartPage cartPage = PageFactory.initElements(driver, cartPage.class);
		cartPage.verifySamsunProductInCart();
		cartPage.SamsunPlaceOrder();

	}

}
