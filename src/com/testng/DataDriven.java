package com.testng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataDriven {

	@DataProvider(name = "data")
	public Object[][] getData() {
		return new Object[][] { { "talha", "tai", "21", "Apr", "2000", "Male", "9511892846", "talha123" },
				{ "TT", "ttt", "22", "May", "2000", "Female", "2332534345", "112345" }, };
	}

	WebDriver driver;

	@BeforeTest
	public void beforetest() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.facebook.com");
	}

	@Test(dataProvider = "data")
	public void testFacebookSignUp(String firstName, String lastName, String day, String month, String year,
			String gender, String mob, String pass) throws InterruptedException {

		driver.get("https://www.facebook.com/");

		driver.findElement(By.linkText("Create new account")).click();
		Thread.sleep(2000);

		driver.findElement(By.name("firstname")).sendKeys(firstName);
		driver.findElement(By.name("lastname")).sendKeys(lastName);

		new Select(driver.findElement(By.id("day"))).selectByVisibleText(day);
		new Select(driver.findElement(By.id("month"))).selectByVisibleText(month);
		new Select(driver.findElement(By.id("year"))).selectByVisibleText(year);

		if (gender.equals("Female")) {
			driver.findElement(By.xpath("//label[normalize-space()='Female']")).click();
		} else if (gender.equals("Male")) {
			driver.findElement(By.xpath("//label[normalize-space()='Male']")).click();
		} else if (gender.equals("Custom")) {
			driver.findElement(By.xpath("//label[normalize-space()='Custom']")).click();
		}

		driver.findElement(By.name("reg_email__")).sendKeys(mob);
		driver.findElement(By.id("password_step_input")).sendKeys(pass);

	}

	@AfterTest
	public void aftertest() {
		driver.quit();
	}
}


