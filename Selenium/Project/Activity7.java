package CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class Activity_7{
	@BeforeMethod
	public void pageopen(){	
	public static void main(string[] args) {
	WebDriver driver = new FirefoxDriver();
	driver.get("https://alchemy.hguy.co/crm/");
      }
   }
	@Test
        public void GetInfo_SalesMenu(){
        driver.findElement(By.id("tab_0")).click();

        driver.findElement(By.id("tab_9_Leads")).click();
          wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[contains(@title,'Additional Details')]")));
        driver.findElement(By.xpath("//span[contains(@title,'Additional Details')]")).click();
       String PhoneNumber=  driver.findElement(By.className("phone")).getText();
        System.out.println("Phone Number is"+PhoneNumber);
    }

    @AfterClass
    public void tearDown() {
        driver.close();
    }
}
