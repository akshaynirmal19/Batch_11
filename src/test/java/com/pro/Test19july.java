package com.pro;

import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Test19july {
	
	
	@Test
	public void  A1() {
		
		SoftAssert soft = new SoftAssert();
		
		System.out.println("username");
		System.out.println("password");
		System.out.println("Login Button");
		
		
		String ExpectedTitle = "Test";
		String actuleTitle = "Test1";
		
		soft.assertEquals(actuleTitle, ExpectedTitle);
		
		System.out.println("Browser Close");
		
		soft.assertAll();
		
	}

}
