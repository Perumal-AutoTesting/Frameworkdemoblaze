package demoblazeFramework.utility;

import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class PopupUtility {

	public static void handlingAlertPopup(WebDriver ldriver) throws InterruptedException {

		try {
			
			ldriver.switchTo().alert().accept();
			
		} catch (NoAlertPresentException e) {
			
		}
		

	}


}
