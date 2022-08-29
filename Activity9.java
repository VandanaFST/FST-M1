package CRM_Project;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

public class Activity_9{
	@BeforeMethod
	public void pageopen(){	
	public static void main(string[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/crm/");
      }
   }

	@Test
        public void AccountPage(){
        driver.findElement(By.id("tab_0")).click();

        driver.findElement(By.id("tab_9_Leads")).click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@title,'Additional Details')]")));



        for(int i=1; i<=10; i++) {
                      WebElement row = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[3]"));
                WebElement row2 = driver.findElement(By.xpath("//table/tbody/tr[" + i + "]/td[8]"));
                System.out.println("rows  " + i + ": " + row.getText()+"  User Nmae  is :"+row2.getText());


        }

    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}
