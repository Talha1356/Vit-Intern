package com.browser_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBrowserCommand {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		driver.manage().window().maximize();
		
		
		String pagetittle = driver.getTitle();
		System.out.println("facebook login page tittle ; "+pagetittle);
		
		String currentURL = driver.getCurrentUrl();
		System.out.println("facebook current url ; "+currentURL);
		
		String pagesource = driver.getPageSource();
		System.out.println(pagesource.contains(pagetittle));
		
		driver.close();
		
		
	}

}
