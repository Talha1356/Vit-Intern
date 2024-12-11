package com.browser_commands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Navigation;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new ChromeDriver();
		Navigation navigate = driver.navigate();
		navigate.to("https://facebook.com");
		System.out.println(driver.getCurrentUrl()+ driver.getTitle());
		
		driver.findElement(By.linkText("Forgotten password?")).click();
		System.out.println(driver.getCurrentUrl()+ driver.getTitle());
		
		navigate.back();
		System.out.println(driver.getCurrentUrl()+ driver.getTitle());
		
		navigate.forward();
		System.out.println(driver.getCurrentUrl()+ driver.getTitle());
		
		navigate.refresh();
		System.out.println(driver.getCurrentUrl()+ driver.getTitle());
		
		navigate.back();
		System.out.println(driver.getCurrentUrl()+ driver.getTitle());
		
		navigate.refresh();
		System.out.println(driver.getCurrentUrl()+ driver.getTitle());
		
		driver.close();
		
	}

}
