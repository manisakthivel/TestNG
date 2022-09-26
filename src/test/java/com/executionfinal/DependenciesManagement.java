package com.executionfinal;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenciesManagement {

	@Test(priority=1)
	public void highSchool() {
		//String result = "pass";
//		Assert.assertEquals("pass", result);
		Assert.assertTrue(true);
		System.out.println("Highschool pass");
	}
	@Test(dependsOnMethods="highSchool")
	public void higherSecondary() {
		System.out.println("HigherSecondary");
	}
	@Test(dependsOnMethods="higherSecondary")
	public void engineering() {
		System.out.println("Engineering");
	}
}
