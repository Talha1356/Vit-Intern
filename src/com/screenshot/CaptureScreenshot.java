package com.screenshot;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class CaptureScreenshot {

	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
		
		TakesScreenshot ts = (TakesScreenshot)driver;
		File scrFile = ts.getScreenshotAs(OutputType.FILE);
		File target = new File("./Screenshot/fb.png");
		
		FileHandler.copy(scrFile, target);
		
		driver.findElement(By.name("email")).sendKeys("talha");
		driver.findElement(By.name("pass")).sendKeys("talha1234");
		
	    File scrFile1 = ts.getScreenshotAs(OutputType.FILE);
	    File target1 = new File("./Screenshot/fb2.png");
	    
	    FileHandler.copy(scrFile1,target1);

	}

}
