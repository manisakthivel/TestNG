package com.practice;

import java.sql.Driver;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.ExtentSparkReporterConfig;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ExtentReportEx {

	static WebDriver driver;
	ExtentReports extent ;
	ExtentSparkReporter spark ;
	ExtentTest test ;
	
	
	
	
	@Test
	public void orangeHrm() {
	
		extent = new ExtentReports();
		spark = new ExtentSparkReporter("spark.html");
		extent.attachReporter(spark);	
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		test = extent.createTest("verified");
		
		WebElement user = driver.findElement(By.name("username"));
		user.sendKeys("Admin");
		test.log(Status.INFO, "Username entered");
		WebElement pass = driver.findElement(By.name("password"));
		pass.sendKeys("admin123");
		WebElement loginBtn = driver.findElement(By.xpath("//button[@type='submit']"));
		loginBtn.click();
	}
	
	@AfterSuite
	public void closebrowser() {
		extent.flush();
	}
	
	
}


