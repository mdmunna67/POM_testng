package objectrepository;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Parameters;

public class DriverSetup  {

	
	public WebDriver DriverSetup () {
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
//		ChromeOptions chromeopt = new ChromeOptions();
//		Map<String, Object> prefs = new HashMap<String, Object>();
//		prefs.put("intl.accept_languages", "en");
//		chromeopt.setExperimentalOption("prefs", prefs);
//		WebDriver driver=new ChromeDriver(chromeopt);
		DesiredCapabilities jsCapabilities = DesiredCapabilities.chrome();
		ChromeOptions options = new ChromeOptions();
		Map<String, Object> prefs = new HashMap<>();
		prefs.put("intl.accept_languages", "--lang=en");
		options.setExperimentalOption("prefs", prefs);
		jsCapabilities.setCapability(ChromeOptions.CAPABILITY, options);
		ChromeDriver driver = new ChromeDriver(options);
		return driver;
	}
	
	
	
}
