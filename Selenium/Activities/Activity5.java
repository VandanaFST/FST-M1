package Activities;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {
    public static void main  (String []args ) {
        WebDriver driver = new FirefoxDriver();
        driver.get(" https://www.training-support.net/selenium/simple-form");
        System.out.println("Title is" + driver.getTitle());
        driver.findElement(By.xpath("//input[@id='firstName']")).sendKeys("Vandana");
        driver.findElement(By.xpath("//input[@id='lastName']")).sendKeys("T");

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("Vandana@gmail.com");
        driver.findElement(By.xpath("//input[@id='number']")).sendKeys("8970277831");
        driver.findElement(By.xpath("//input[contains(@class,'green')]")).click();

    }
}
