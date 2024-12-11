package com.testng;

import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameteriseTestInTestNG {

	
	@Test
	@Parameters({"uname","pwrd"})
	public void login(@Optional("talha@gmail.com")String username,@Optional("talha123")String password)
	{
		
		System.out.println(username);
		System.out.println(password);
	}
}
