package testNGTests;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;

public class Activity1_Project {
 WebDriver driver;
	
 @BeforeMethod
 public void beforeMethod() {
	 driver = new FirefoxDriver();
	 driver.get("https://alchemy.hguy.co/lms"); 
 }
  @Test
  public void test1() throws InterruptedException {
	  String title = driver.getTitle();
      System.out.println("Title of the page is: " + title);
      Assert.assertEquals("Alchemy LMS – An LMS Application", title);
      Thread.sleep(3000);
  }
  
  @AfterMethod
  public void afterMethod() {
 driver.close();
  }

}
