package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

public class ParallelTest {

	public static WebDriver driver ;
	
	
	@Test
	public static void chrome() {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Manikandan Sakthivel\\eclipse-workspace\\SeleniumDemo\\Source\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://amazon.in");
		System.out.println(Thread.activeCount());
		long id = Thread.currentThread().getId();
		System.out.println(id);
	}
	
	@Test
	public static void edge() {
		System.setProperty("webdriver.edge.driver", "C:\\Users\\Manikandan Sakthivel\\eclipse-workspace\\SeleniumDemo\\Source\\msedgedriver.exe");
		driver = new EdgeDriver();
		driver.get("https://bing.com");
	}
	
}
