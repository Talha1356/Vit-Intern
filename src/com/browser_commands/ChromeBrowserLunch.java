package com.browser_commands;

import org.openqa.selenium.chrome.ChromeDriver;

public class ChromeBrowserLunch {

	public static void main(String[] args) throws InterruptedException {
		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);

	}

}
