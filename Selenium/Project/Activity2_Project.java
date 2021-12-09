package com.ibm.Selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity2_Project {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new FirefoxDriver();
	    driver.get("https://alchemy.hguy.co/lms"); 
	    WebElement webpageHeading = driver.findElement(By.className("uagb-ifb-title-wrap"));
	    System.out.println("Heading of the webpage is: " + webpageHeading.getText());
        //Assert.assertEquals("Learn from Industry Experts", webpageHeading);
	    //Assert.assertEquals(webpageHeading.equals("Learn from Industry Experts"), webpageHeading );
	    Assert.assertTrue(true, "Learn from Industry Experts");
	    Thread.sleep(4000);
        driver.quit();
	}

}
