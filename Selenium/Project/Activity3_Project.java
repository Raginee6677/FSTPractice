package com.ibm.Selenium_Projects;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.Assert;

public class Activity3_Project {
	
	public static void main(String[] args) throws InterruptedException {
		WebDriver driver;
		driver = new FirefoxDriver();
	    driver.get("https://alchemy.hguy.co/lms");
	    //String firstInfoBox = driver.findElement(By.xpath("//h3[@class='Actionable Training']")).getText();
	    Thread.sleep(4000);
		//JavascriptExecutor jsx = (JavascriptExecutor)driver; jsx.executeScript("window.scrollBy(0,450)", "");
		//Thread.sleep(4000);
		java.util.List<WebElement> wl=driver.findElements(By.xpath("//h3[@class='uagb-ifb-title']"));
		System.out.println(wl.size());
		String firstInfoBox = wl.get(0).getText();
		if (firstInfoBox.equalsIgnoreCase("Actionable Training")) {
		Thread.sleep(4000);	
		System.out.println(" it matches “Actionable Training” exactly ");
		driver.quit();}
			
				
        /*for (int i = 0; i<wl.size(); i++){
        System.out.println("value at"+i+""+ wl.get(i).getText());  */      


		//WebElement firstInfoBox = driver.findElement(By.xpath("//h3[contains(text(),'Actionable Training'])"));
	    //System.out.println("Heading of the FirstInfoBox is: " + firstInfoBox);
	    }
	    
	}


