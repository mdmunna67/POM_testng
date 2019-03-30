package Testcases;

import objectrepository.DriverSetup;
import objectrepository.CommodityForm;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestCommodityForm  {
	
	WebDriver driver;
	@Test
	public void test_Commodity_Details_Scenario1()
	{
//		DriverSetup d=new DriverSetup();
//		driver = d.DriverSetup();
		System.setProperty("webdriver.chrome.driver", "F:\\selenium\\chromedriver.exe");
		ChromeOptions chromeOptions = new ChromeOptions();

		Map<String, Object> prefs = new HashMap<String, Object>();

		prefs.put("intl.accept_languages", "ja");

		chromeOptions.setExperimentalOption("prefs", prefs);

		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://www.google.co.jp/search?ei=hIPQW6KaFsbVvgSmp7nQAQ&q=japanese+sites+for+used+cars+&oq=japanese+sites+for+used+cars+&gs_l=psy-ab.3..0i30k1.7506.22472.0.22878.6.6.0.0.0.0.142.713.0j6.6.0....0...1c.1.64.psy-ab..0.6.711...0i22i30k1j0i7i30k1j0i8i7i30k1j0i8i30k1.0.9Lo6To9kwfo");
		
	}
	
//	@Test
	public void test_Commodity_Details_Scenario2()
	{
		
		CommodityForm cf=new CommodityForm(driver);
		cf.name().sendKeys("Leather Sofa Set");
		cf.Weight().sendKeys("120");
		cf.Length().sendKeys("400");
		cf.Width().sendKeys("800");
		cf.Height().sendKeys("55");
		cf.btnadd().click();
		
		 String name = driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[3]/td[1]")).getText();
		 Assert.assertEquals(name, "Leather Sofa Set");
		 String Weight = driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[3]/td[2]")).getText();
		 Assert.assertEquals(Weight, "120");
		 String Length = driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[3]/td[3]")).getText();
		 Assert.assertEquals(Length, "400");
		 String Width = driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[3]/td[4]")).getText();
		 Assert.assertEquals(Width, "800");
		 String Height = driver.findElement(By.xpath("//*[@id='myTable']/tbody/tr[3]/td[5]")).getText();
		 Assert.assertEquals(Height, "55");
		 
		 Assert.assertEquals(cf.NoofCommodity().getAttribute("value"), "2");
		 Assert.assertEquals(cf.TotalWeight().getAttribute("value"), "220");
	}
	
}
