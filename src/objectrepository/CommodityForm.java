package objectrepository;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CommodityForm  {

	WebDriver driver;
	public CommodityForm (WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}

  By name =By.id("name");
  By Weight =By.id("weight");
  By Length =By.id("length");
  By Width =By.id("width");
  By Height =By.id("height");
  By NoofCommodity =By.id("count");
  By TotalWeight =By.id("total");
  By btnadd =By.id("add");
  
  
  
   public WebElement name()
   {
	   return driver.findElement(name);
   }
         
   public WebElement Weight()
   {
	   return driver.findElement(Weight);
   }
   
   public WebElement Length()
   {
	   return driver.findElement(Length);
   }
   
   public WebElement Width()
   {
	   return driver.findElement(Width);
   }
	
   public WebElement Height()
   {
	   return driver.findElement(Height);
   }
         
   public WebElement NoofCommodity()
   {
	   return driver.findElement(NoofCommodity);
   }
   
   public WebElement TotalWeight()
   {
	   return driver.findElement(TotalWeight);
   }
   
   public WebElement btnadd()
   {
	   return driver.findElement(btnadd);
   }
	
	
	
}
