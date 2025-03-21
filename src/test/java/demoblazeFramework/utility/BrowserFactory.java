package demoblazeFramework.utility;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserFactory {

	public static WebDriver startBrowser(String browerName, String url, WebDriver ldriver) {

		if (browerName.equals("chrome")) {

			WebDriverManager.chromedriver().setup();
			ldriver = new ChromeDriver();

		} else if (browerName.equals("Edge")) {

			WebDriverManager.edgedriver().setup();
			ldriver = new EdgeDriver();

		} else {

			System.out.println("Not Support this browser");
		}

		ldriver.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
		ldriver.manage().window().maximize();
		ldriver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		ldriver.get(url);

		return ldriver;

	}

	public static void closeBrowser(WebDriver driver) {

		driver.quit();

	}

}
