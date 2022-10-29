package com.pro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_3 extends BaseClass{
	
	
	
	@Test
	public void Test_1() {
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("akshay@123");
		driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("akshay@123");
		
	}
	
	

}
