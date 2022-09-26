package com.practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

//Dataprovider return 2Dimensional array 
public class DataProviderEx {
	
	@DataProvider(name = "value")
	public String[][] credentials() {
		String[][] data = {
				{"ManikandanSakthivel1","123456"},  
				{"ManikandanSakthivel","123456"},
				{"ManikandanSakthivel1","12345"},
				{"ManikandanSakthivel","12345"}
				};
		return data;
	}
	
	
	public static WebDriver driver ;
	
	@Test(dataProvider="value")
	public static void launchBrowser(String user, String pass) {
		
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://adactinhotelapp.com/");
		driver.manage().window().maximize();
		WebElement username = driver.findElement(By.id("username"));
		username.sendKeys(user);
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys(pass);
		WebElement loginBtn = driver.findElement(By.id("login"));
		loginBtn.click();
	}
	
	
}
