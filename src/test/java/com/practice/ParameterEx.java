package com.practice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParameterEx {
	
	@Parameters("browserName")
	@Test
	public void browser(String name) {
		switch(name) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			WebDriver driver = new ChromeDriver();
			break;
		case "Edge":
			WebDriverManager.edgedriver().setup();
			WebDriver driver1 = new EdgeDriver();
			break;

		default:
			System.out.println("Not available");
		}
	}
}

