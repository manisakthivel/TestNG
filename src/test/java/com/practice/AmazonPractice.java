package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonPractice {
	public static WebDriver driver;
	
	@Test
	public static void product() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		WebElement phone = driver.findElement(By.id("twotabsearchtextbox"));
		phone.sendKeys("mobilephone");
		phone.submit();
		WebElement title = driver.findElement(By.xpath("//span[text()='Samsung Galaxy M33 5G (Mystique Green, 6GB, 128GB Storage) | 6000mAh Battery | Upto 12GB RAM with RAM Plus | Travel Adapter to be Purchased Separately']"));
		String firstTitle = title.getText();
		WebElement price = driver.findElement(By.xpath("//span[text()='18,999']"));
		String firstPrice = price.getText();
		
		Map<String,String> map = new HashMap<>();
		
		map.put(firstTitle, firstPrice);
		
		System.out.println(map);
		
	}

}
