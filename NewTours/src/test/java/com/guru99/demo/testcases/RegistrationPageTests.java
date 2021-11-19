package com.guru99.demo.testcases;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertFalse;
import static org.testng.Assert.assertTrue;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class RegistrationPageTests {

	@BeforeMethod
	public void beforMethod() {
		System.out.println("Before Method");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("Before Test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Method");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("After Test");
	}
	
	@Test(groups = "sanity")
	public void test() {
		System.out.println("Test");
		assertEquals("error msg", "error msg");
	}

	@Test(groups = "sanity")
	public void test1() {
		System.out.println("Test1 ");
		assertFalse(false, "Msg not success");
	}

	@Test(groups = {"sanity" , "regression"})
	public void test2() {
		System.out.println("Test2");
		assertTrue(true);
	}

}
