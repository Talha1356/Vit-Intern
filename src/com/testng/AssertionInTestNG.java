package com.testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionInTestNG {
	
	
	@Test
	public void test1()
	{
		String exp ="Facebook Title";
		String act ="Facebbok";
		
		Assert.assertEquals(act, exp,"Expected title doesn't matched with actual title");
		
		System.out.println("Statement after assertion ....!!!!");
	}
	
	@Test
	public void test2()
	{
		String exp ="Facebook Title";
		String act ="Facebook Title";
		
		Assert.assertEquals(act, exp,"Expected title doesn't matched with actual title");
		
		System.out.println("Statement after assertion ....!!!!");
	}
	
	@Test
	public void test3()
	{
		Assert.assertTrue(true);
		System.out.println("Statement after assertion ....!!!!");
	}
	
	@Test
	public void test4()
	{
		Assert.assertTrue(false,"Expected true but found false");
		System.out.println("Statement after assertion ....!!!!");
	}
	
	
	@Test
	public void test5()
	{
		Assert.assertFalse(true,"Expected false but found false");
		System.out.println("Statement after assertion ....!!!!");
	}
	
	@Test
	public void test6()
	{
		Assert.assertFalse(false);
		System.out.println("Statement after assertion ....!!!!");
	}

}