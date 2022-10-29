package com.pro;

import org.testng.annotations.Test;

public class Test_18july {
	
	@Test(groups="Sanity")
	public void m1() {
		System.out.println("M1");
	}
	
	@Test(groups="Regression")
	public void m2() {
		System.out.println("M2");
	}
	
	@Test(groups="Sanity,Regression")
	public void m3() {
		System.out.println("M3");
	}

}
