package CRM_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.*; 

public class Activity_1{

    @BeforeMethod
    public void pageopen(){
        driver.get("https://alchemy.hguy.co/crm/");

        }
	 @Test
   public void GetTitle(){
        String title = driver.getTitle();
        String PageTitle = “SuiteCRM";
        boolean flag = false;
        if (driver.getTitle().equalsIgnoreCase(PageTitle)) {
        flag = true;

   @AfterMethod
   public void close(){
           driver.close();
        }
 }
