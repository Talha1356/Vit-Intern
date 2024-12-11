package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class FB_Login {
	
	WebDriver driver;
	
	@BeforeTest
	public void setUP() {
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}
	
	@Test
	public void verifyFBTitle() {
		String expTitle = "Facebook – log in or sign up";
		String actTitle = driver.getTitle();
		
		Assert.assertEquals(actTitle, expTitle);
	}
	
	@Test
	public void validateFBVisibleTxt()
	{
		String expTxt ="Facebook helps you connect and share with the people in your life.";
		String actTxt = driver.findElement(By.className("_8eso")).getText();	
		Assert.assertEquals(actTxt, expTxt);		
	}
	
	@Test
	public void isFacebookLogoDisplayed()
	{
		boolean status = driver.findElement(By.xpath("//img[@alt='Facebook']")).isDisplayed();
		Assert.assertTrue(status);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.close();
	}

}
