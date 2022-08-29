package CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class Activity_2{
  @BeforeMethod
	public void pageopen(){
        public static void main(string[] args) {
          WebDriver driver = new FirefoxDriver();
          driver.get("https://alchemy.hguy.co/crm/");
        }
 	@Test
        public void PrintTitle(){
          String title = driver.getTitle();
          System.out.println("Page title is: " + title);

 	@AfterMethod
        public void close(){
          driver.close();
        }
}
