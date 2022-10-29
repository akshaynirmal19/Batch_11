package com.pro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_19july {
	
	
	@Test
	public void  A1() {
		
		System.out.println("username");
		System.out.println("password");
		System.out.println("Login Button");
		
		
		String ExpectedTitle = "Test";
		String actuleTitle = "Test1";
		
		Assert.assertEquals(actuleTitle, ExpectedTitle);
		
		
		System.out.println("Browser Close");
		
		
		
		
	}
	
	@Test
	public void  B1() {
		
		System.out.println("B1");
		
	}

}
