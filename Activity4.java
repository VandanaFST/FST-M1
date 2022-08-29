package CRM_Project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Activity_4{
	@BeforeMethod
	public void pageopen(){	
	public static void main(string[] args) {
          WebDriver driver = new FirefoxDriver();
          driver.get("https://alchemy.hguy.co/crm/");
        }  

	@Test
	public void LoginPage(){
          WebElement userName = driver.findElement(By.xpath("//input[starts-with(@class, 'username')]"));
          WebElement password = driver.findElement(By.xpath("//input[contains(@class, 'password')]"));
          userName.sendKeys("admin");
          password.sendKeys("pa$$word");
          driver.findElement(By.xpath("//button[contains(text(), 'Log in')]")).click();
          String loginMessage = driver.findElement(By.id("action-confirmation")).getText();
          System.out.println("Login message: " + loginMessage);

	@AfterMethod
  public void close(){
          driver.close();
        }
 }
