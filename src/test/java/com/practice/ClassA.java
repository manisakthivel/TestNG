package com.practice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ClassA {

	public static WebDriver driver;
	@Test
	public void launch() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.navigate().to("https://www.hyrtutorials.com/p/frames-practice.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(3);
		WebElement fname = driver.findElement(By.id("firstName"));
		fname.sendKeys("Manikandan");
		driver.switchTo().parentFrame();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().frame(4);
		WebElement drop1 = driver.findElement(By.id("selectnav1"));
		Select select = new Select(drop1);
		select.selectByIndex(1);
		
	}
}
