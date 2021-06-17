package test;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import Util.DriverUtil;

@Test
public class AmazonDemo {
	WebDriver driver;
  public void AmazonLoginTest() {
	  driver.findElement(By.xpath("//*[@id=\"nav-link-accountList-nav-line-1\"]")).click();
	  driver.findElement(By.xpath("//*[@id=\"ap_email\"]")).sendKeys("+919421064667");
	  driver.findElement(By.xpath("//*[@id=\"continue\"]")).click();
      driver.findElement(By.xpath("//*[@id=\"ap_password\"]")).sendKeys("Pass@123");
      driver.findElement(By.xpath("//*[@id=\"signInSubmit\"]")).click(); 
      //driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/i")).click();
     
      
      driver.findElement(By.id("twotabsearchtextbox")).click();
      driver.findElement(By.id("twotabsearchtextbox")).clear();
      driver.findElement(By.id("twotabsearchtextbox")).sendKeys("charger");
      driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
      driver.findElement(By.id("nav-search-bar-form")).submit();
      driver.findElement(By.id("a-autoid-0-announce")).click();
      driver.findElement(By.xpath("//*[@id=\"search\"]/div[1]/div/div[1]/div/"
              + "         span[3]/div[2]/div[2]/div/span/div/div/div/div/div[2]/div[2]/div/div[1]/h2/a/span")).click();
      //driver.findElement(By.xpath("//*[@id=\"submit.add-to-cart-announce\"]")).click();
    
      //driver.findElement(By.xpath("//input[@name=\"submit.add-to-cart\"]")).click();
     
      //driver.findElement(By.xpath("//*[@id=\"buy-now-button\"]")).click();
      
      Set<String> ids = driver.getWindowHandles();
      Iterator<String> it = ids.iterator();
      String parentId = it.next();
      String childId = it.next();
      driver.switchTo().window(childId);
      driver.findElement(By.id("buy-now-button")).click();

     
      //driver.findElement(By.linkText("SignOut")).click();
	  //driver.findElement(By.xpath("//a[@id='nav-item-signout']")).click();
  }
  @BeforeTest
  public void beforeTest() {
	  driver=DriverUtil.getBrowserInstance("chrome");
	  driver.manage().window().maximize();
	  driver.get("https://www.amazon.in/");
	  driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	 
	  
  }

  @AfterTest
  public void afterTest() {
	  //driver.close();
  }

}
