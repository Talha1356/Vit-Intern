package com.testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterGroups;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestngTest {
	
		
	@Test
	public void test() {
		System.out.println("test1()");
	}
	
//	@Test
//	public void test2() {
//		System.out.println("test2()");
//	}
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("beforeSuite()");
	}
	
	@BeforeTest
	public void beforeTest() {
		System.out.println("beforeTest()");
	}
	
	@BeforeClass
	public void beforeClass() {
		System.out.println("beforeClass()");
	}
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("beforeMethod()");
	}
	
	@BeforeGroups
	public void beforeGroups() {
		System.out.println("beforeGroups()");
	}
	
	
	@AfterSuite
	public void afterSuite() {
		System.out.println("afterSuite()");
	}
	
	@AfterTest
	public void afterTest() {
		System.out.println("afterTest()");
	}
	
	@AfterClass
	public void afterClass() {
		System.out.println("afterClass()");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("afterMethod()");
	}
	
	@AfterGroups
	public void afterGroups() {
		System.out.println("afterGroup()");
	}
	
}
