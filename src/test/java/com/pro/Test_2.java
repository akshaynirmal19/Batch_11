package com.pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_2 {
	
	WebDriver driver;
	
	@BeforeSuite
	public void BS() {
		System.out.println("Before Suite");
	}
	
	@BeforeTest
	public void BT() {
		System.out.println("Before Test");
	}
	
	@BeforeClass
	public void BC() {
		System.out.println("Before Class");
	}
	
	@BeforeMethod
	public void BM() {
		System.out.println("Before Method");
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		driver.manage().window().maximize();
	}
	
	@Test
	public void Test_1() {
		System.out.println("Test 1");
	}
	
	@Test
	public void Test_2() {
		System.out.println("Test 2");
	}
	
	@Test
	public void Test_3() {
		System.out.println("Test 3");
	}
	
	@AfterMethod
	public void AM() {
		System.out.println("After Method");
		driver.close();
	}
	
	@AfterClass
	public void AC() {
		System.out.println("After Class");
	}
	
	@AfterTest
	public void AT() {
		System.out.println("After Test");
	}
	
	@AfterSuite
	public void AS() {
		System.out.println("After Suite");
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
