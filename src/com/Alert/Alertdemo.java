package com.Alert;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
//
//public class Alertdemo {
//
//	public static void main(String[] args) throws InterruptedException {
//
//		ChromeDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//
//		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
//		try {
//			driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//
//			Alert alert = driver.switchTo().alert();
//			alert.accept();
//
//			Thread.sleep(3000);
//
//			driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();
//			alert = driver.switchTo().alert();
//			alert.accept();
//
//			Thread.sleep(3000);
//
//			driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
//			alert = driver.switchTo().alert();
//			alert.sendKeys("HI");
//			alert.accept();
//		} catch (NoAlertPresentException e) {
//
//			System.out.println("No alert present");
//
//		}
//
//		finally {
//			driver.findElement(By.linkText("Elemental Selenium")).click();
//			driver.quit();
//		}
//
//	}
//}

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alertdemo {
    public static void main(String[] args) throws InterruptedException {
        // Set the ChromeDriver path
       

        // Initialize ChromeDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        // Navigate to the website
//        driver.get("https://demo.guru99.com/");
//
//        // Interact with elements
//        driver.findElement(By.xpath("//a[normalize-space()='Selenium']")).click();
//        driver.findElement(By.xpath("//a[normalize-space()='Login']")).click();
//        
//        
//        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("mngr603548");
//        
//        driver.findElement(By.xpath("//input[@id='passwd']")).sendKeys("AhEhUgA");
//        
//        driver.findElement(By.cssSelector("button[id='SubmitLogin'] span")).click();
//        
//        Alert alert = driver.switchTo().alert();
//        alert.dismiss();
//        
//        Thread.sleep(4000);
//        
//        // Close the driver
        
//        driver.quit();
        
        
	driver.get("https://demo.guru99.com/V1/index.php\r\n");
	
	
	
		
		driver.findElement(By.name("uid")).sendKeys("mngr603546");
		driver.findElement(By.name("password")).sendKeys("nunYdyg");
		
		Thread.sleep(3000);
		driver.findElement(By.xpath("//input[@type='submit']")).click();
		Thread.sleep(3000);
		handleAlert(driver);
		
		driver.findElement(By.linkText("Log out")).click();
		handleAlert(driver);
		
		
        
        	
    }
    
	static boolean isALertPresent(WebDriver driver) {

		try {
			driver.switchTo().alert();
			return true;
		} catch (NoAlertPresentException e) {
			return false;
		}

	}
    
    
    static void handleAlert(WebDriver driver) {
    	
    	if(isALertPresent(driver)) {
    		 
    		driver.switchTo().alert().accept();
    	}
    	else {
    		System.out.println("Not handle");
    	}
    }
    
    
}

