package com.testng;

import org.testng.annotations.Test;

public class PriortiseTestInTestNG {

	@Test(priority = -1)
	public void login() {
		System.out.println("Login success");
	}

	@Test(priority = 0)
	public void updateProfile() {
		System.out.println("Updated profile successfully");
	}

	@Test(priority = 1)
	public void logout() {
		System.out.println(" logout success ...!!!");
	}

	@Test
	public void createPorfile() {
		System.out.println(" createPorfile() ");
	}

	@Test
	public void deleteProfile() {
		System.out.println(" deleteProfile() ");
	}
}
