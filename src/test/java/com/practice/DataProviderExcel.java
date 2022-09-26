package com.practice;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DataProviderExcel {

	public static WebDriver driver ;

	//Approach 1  - Easy way by Trainer 

	
	@DataProvider(name = "data")
	public String[][] readExcel() throws IOException {
		File file = new File("D:\\Demo\\HotelData1.xlsx");
		FileInputStream fi = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet sheet = wb.getSheet("Sheet1");
		int noOfRows = sheet.getPhysicalNumberOfRows();
		int noOfCells = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[noOfRows][noOfCells];
		for(int i=0;i<noOfRows;i++) {
			for(int j=0;j<noOfCells;j++) {
				Cell cell = sheet.getRow(i).getCell(j);
				DataFormatter df = new DataFormatter();
				data[i][j] = df.formatCellValue(cell);
				}
		}
		return data;
		
		
	}


	//Approach 2 - Derived by Meena
	/*@DataProvider(name="data")
	public String[][] excelData() throws IOException {
		String value=null;
		File file = new File("D:\\Demo\\HotelData1.xlsx");
		FileInputStream fi = new FileInputStream(file);
		Workbook wb = new XSSFWorkbook(fi);
		Sheet sheet = wb.getSheet("Sheet1");
		int rowCount = sheet.getLastRowNum();
		int lastCellNum = sheet.getRow(0).getLastCellNum();
		String[][] data = new String[rowCount][lastCellNum];
		for(int i=1;i<=rowCount;i++) {
			Row row = sheet.getRow(i);
			for(int j=0;j<lastCellNum;j++) {
				Cell cell = row.getCell(j);
				 int cellType = cell.getCellType();
				if(cellType==1) {
					value = cell.getStringCellValue();
					data[i-1][j]=value;
					System.out.println(Arrays.deepToString(data));
				}
				else if(cellType==0) {
					if(DateUtil.isCellDateFormatted(cell)) {
					Date DateCellValue = cell.getDateCellValue();
					SimpleDateFormat sf = new SimpleDateFormat("dd/mm/YYY");
					value = sf.format(DateCellValue);

					data[i-1][j]=value;
					System.out.println(Arrays.deepToString(data));

				}
				else {
					double numericCellValue = cell.getNumericCellValue();
					long l = (long) numericCellValue;
					value = String.valueOf(l);
				//	System.out.println(valueOf);
					data[i-1][j]=value;
					System.out.println(Arrays.deepToString(data));
				}
				}
			}
		}
				return data;
	}*/





	@Test(dataProvider="data")
	public void loginPage(String id, String pass) {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://adactinhotelapp.com/");
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys(id);
		WebElement passWord = driver.findElement(By.id("password"));
		passWord.sendKeys(pass);
		driver.findElement(By.id("login")).click();

	}
}


