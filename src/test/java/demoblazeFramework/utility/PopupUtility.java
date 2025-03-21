package demoblazeFramework.utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class PopupUtility {

	public static void handlingAlertPopup(WebDriver ldriver) throws InterruptedException {

		Thread.sleep(2000);
		ldriver.switchTo().alert().accept();

	}

	public static void keyBoardShortcuts(WebDriver ldriver) {

		Actions actions = new Actions(ldriver);
		actions.click().perform();

	}

}
