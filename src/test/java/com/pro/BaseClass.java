package com.pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	
WebDriver driver;
	
	@BeforeMethod
	public void BM() {
		System.out.println("Before Method");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	
	@AfterMethod
	public void AM() {
		System.out.println("After Method");
		driver.close();
	}

}
