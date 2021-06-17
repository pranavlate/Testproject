package test;

import org.testng.annotations.Test;

import Util.DriverUtil;

import org.testng.annotations.BeforeTest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
public class FacebookDemo {
	WebDriver driver;
  @Test
  public void FacebookDemo() {
      driver.findElement(By.id("email")).sendKeys("9421064667");
      driver.findElement(By.id("pass")).sendKeys("Pass@123");
      driver.findElement(By.name("login")).click(); 
      //driver.findElement(By.id("userNavigationLabel")).click();
      //driver.findElement(By.partialLinkText("log out")).click();
     
  }
  @BeforeTest
  public void beforeTest() {
	  driver=DriverUtil.getBrowserInstance("chrome");
	  driver.manage().window().maximize();
	  driver.get("https://www.facebook.com");
	  driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
	 
	  
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
	  //driver.quit();
  }

}
