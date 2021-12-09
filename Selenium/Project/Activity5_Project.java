package com.ibm.Selenium_Projects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;

public class Activity5_Project {

			public static void main(String[] args) throws InterruptedException {
			WebDriver driver;
			driver = new FirefoxDriver();
		    driver.get("https://alchemy.hguy.co/lms"); 
		    Thread.sleep(3000);
		    driver.findElement(By.xpath("//*[@id='menu-item-1507']/a")).click();
		    Thread.sleep(2000);
		    String Accountpage = driver.getTitle();
		    if(Accountpage.equalsIgnoreCase("My Account – Alchemy LMS"))
				{
		    System.out.println(driver.getTitle());
		    driver.close();
		    		    } 


}}