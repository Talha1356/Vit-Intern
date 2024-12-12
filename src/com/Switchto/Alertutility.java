package com.Switchto;

import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertutility {

	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https://demo.guru99.com/V1/index.php");
		
		driver.findElement(By.name("uid")).sendKeys("mngr603546");
		driver.findElement(By.name("password")).sendKeys("nunYdyg");
		
		driver.findElement(By.name("btnLogin")).click();
		handleAlert(driver);
			
		Thread.sleep(3000);
		
		driver.findElement(By.linkText("Log out")).click();
		handleAlert(driver);
		
		driver.findElement(By.name("uid")).sendKeys("mngr6035");
		driver.findElement(By.name("password")).sendKeys("nunYdyg");
		
		driver.findElement(By.name("btnLogin")).click();
		handleAlert(driver);
		
		
	}
	
	
	static void handleAlert(WebDriver driver)
	{
		if(isALertPresent(driver))
		{
			driver.switchTo().alert().accept();
		}
		else
		{
			System.out.println("Alert is not present on the page hence ignored");
		}
		
	}	
	static boolean isALertPresent(WebDriver driver)
	{
		try {
			driver.switchTo().alert();
			return true;
			
		} catch (NoAlertPresentException e) {
			return false;
		}
		
	}

}