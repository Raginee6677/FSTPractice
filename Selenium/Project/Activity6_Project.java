package com.ibm.Selenium_Projects;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity6_Project {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver = new FirefoxDriver();
	     driver = new FirefoxDriver();
		 driver.get("https://alchemy.hguy.co/lms"); 
		 Thread.sleep(3000);
		 driver.findElement(By.xpath("//*[@id='menu-item-1507']/a")).click();
		 Thread.sleep(2000);
		 String Accountpage = driver.getTitle();
		    if(Accountpage.equalsIgnoreCase("My Account – Alchemy LMS"))
				{
		    System.out.println("Verified! We are on the correct page");
		    	}
		    
		 driver.findElement(By.xpath("//*[@class='ld-login ld-login ld-login-text ld-login-button ld-button']")).click();
		 WebElement userName = driver.findElement(By.id("user_login"));
	     WebElement password = driver.findElement(By.id("user_pass"));
	     userName.sendKeys("root");
	     password.sendKeys("pa$$w0rd");
	     driver.findElement(By.id("wp-submit")).click();
	     Thread.sleep(4000);
	     WebElement webpageHeading = driver.findElement(By.className("uagb-ifb-title-wrap"));
		 System.out.println("Heading of the webpage is: " + webpageHeading.getText());
		 if(Accountpage.equalsIgnoreCase("My Account – Alchemy LMS"))
			{
	    System.out.println("Verified! We have successfully logged in");
	    driver.close();
	    	}
	}

}
