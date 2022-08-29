package CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Activity_6{
	@BeforeMethod
	public void pageopen(){	
	public static void main(string[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/crm/");
      }
   }

 @Test
 public void CheckActivityOption() {
        boolean ActivityButton = driver.findElement(By.className("dropdown-toggle")).isDisplayed();
        System.out.println("Display Activity item menu: " + ActivityButton);
    }

 @AfterMethod
 public void close(){
	driver.close();
   }
}
