package com.testng;

import org.testng.annotations.Test;

public class DependentTestInTestNG {

	@Test
	public void login() {
		System.out.println(" Login success ...!!!");
	}

	@Test(dependsOnMethods = { "login", "createPorfile" })
	public void updatePrfoile() {
		System.out.println(" updated the profile successfully ...!!!");
	}

	@Test(dependsOnMethods = { "login", "deleteProfile" })
	public void logout() {
		System.out.println(" logout success ...!!!");
	}

	@Test(dependsOnMethods = "login")
	public void createPorfile() {
		System.out.println(" createPorfile() ");
	}

	@Test(dependsOnMethods = { "login", "updatePrfoile" })
	public void deleteProfile() {
		System.out.println(" deleteProfile() ");
	}

}