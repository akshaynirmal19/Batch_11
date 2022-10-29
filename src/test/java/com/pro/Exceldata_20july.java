package com.pro;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Exceldata_20july {
	
	
	@Test
	public void testread() throws Exception {
		
		
		WebDriverManager.chromedriver().setup();
		WebDriver de = new ChromeDriver();
		de.get("https://www.facebook.com/");
		de.manage().window().maximize();
		
		String path = "C:\\Users\\Public\\Automation\\Batch_11\\TestData\\abc.xlsx";
		FileInputStream file = new FileInputStream(path);
		XSSFWorkbook wb = new XSSFWorkbook(file);
		
	String textdata  =	wb.getSheet("Sheet1").getRow(0).getCell(0).getStringCellValue();
	String textdata1  =	wb.getSheet("Sheet1").getRow(0).getCell(1).getStringCellValue();
	System.out.println(textdata);
	System.out.println(textdata1);
	
	WebElement email = de.findElement(By.name("email"));
	WebElement pass = de.findElement(By.id("pass"));
	
	email.sendKeys(textdata);
	pass.sendKeys(textdata1);
	
	
	}

}
