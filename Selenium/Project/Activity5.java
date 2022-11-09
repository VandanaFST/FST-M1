package CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.Color;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Activity_5{
  @BeforeMethod
	public void pageopen(){	
	public static void main(string[] args) {
          WebDriver driver = new FirefoxDriver();
          driver.get("https://alchemy.hguy.co/crm/");

     }
}
	@Test
  public void GetColorOfPage() {
         WebElement GetColor = driver.findElement(By.id("toolbar"));
         String color = GetColor.getCssValue("color");
         String s = Color.fromString(s).asHex();
         System.out.println("Color is :" + color);
         System.out.println("Hex code for color:" + s);
    }

	@AfterMethod
	public void close(){
         driver.close();
   }
}
  
