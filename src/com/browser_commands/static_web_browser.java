package com.browser_commands;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;



public class static_web_browser {

	static WebDriver driver;
	
	static void LaunchBrowser(String browsername, String url)
	{
		if(browsername.equals("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (browsername.equals("edge"))
		{
			driver = new EdgeDriver();
	}
	else if (browsername.equals("firefox"))
	{
		driver = new FirefoxDriver();
	} else
	{
		System.out.println("Browser is not availble");
	}
	driver.get(url);
	driver.close();
	}
public static void main (String[]args) {
	LaunchBrowser("chrome","https://www.facebook.com");
	LaunchBrowser("edge","https://www.google.com");
	LaunchBrowser("firefox","https://www.gmail.com");
}
}