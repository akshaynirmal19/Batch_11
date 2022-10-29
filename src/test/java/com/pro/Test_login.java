package com.pro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import Test.LoginForm;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Test_login {
	
	@Test
	public void test_1() {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://ww.facebook.com//");
		driver.manage().window().maximize();
		
		LoginForm login = PageFactory.initElements(driver, LoginForm.class);
		
		login.getTxt_email().sendKeys("Test");
		login.getTxt_password().sendKeys("123456");
		login.getBtn_login().click();
		
	}

}
