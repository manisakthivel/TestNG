package com.executionfinal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Sample {
	
	WebDriver driver;
	long startTime;
	long totaltime;
	long endTime;
	
	@BeforeSuite
	public void loadBrowser() {
		WebDriverManager.chromedriver().setup();
		startTime = System.currentTimeMillis();
		driver = new ChromeDriver();
		System.out.println("Welcome");
		}
	@AfterSuite
	public void closeBrowser() {
		driver.close();
		System.out.println("bye");

		}
	@Test(groups={"blackteam"})
	public void amazon() {
		driver.get("https://www.amazon.in/");
		endTime = System.currentTimeMillis();
		totaltime=endTime-startTime;
		System.out.println("total time of amazon: "+totaltime);
	}
	
	@Test(groups= {"whiteteam"})
	public void flipKart() {
		driver.get("https://www.flipkart.com/");
		endTime = System.currentTimeMillis();
		totaltime=endTime-startTime;
		System.out.println("total time of flipkart: "+totaltime);

	}
	
	@Test(groups={"blackteam"})
	public void shopee() {
		driver.get("https://shopee.com/");
		endTime = System.currentTimeMillis();
		totaltime=endTime-startTime;
		System.out.println("total time of shopee: "+totaltime);

	}
}
