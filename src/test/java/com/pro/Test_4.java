package com.pro;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_4 {
	
	@Test(priority=0,enabled=false)
	public static void A() {
		System.out.println("Akshay A");
	}
	
	@Test(priority=-1,invocationCount=2)
	public static void B() {
		System.out.println("Akshay B");
	}
	
	@Test(priority=1)
	public static void C() {
		System.out.println("Akshay C");
	}
	
	@Test(priority=1)
	public static void H() {
		System.out.println("Akshay H");
		Assert.assertTrue(false);
	}
	
	@Test(priority=1,dependsOnMethods= {"H"})
	public static void G() {
		System.out.println("Akshay G");
	}
	

}
