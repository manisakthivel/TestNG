package com.practice;

import org.testng.annotations.Test;

public class GroupClass {

	@Test(groups = {"red"})
	public void one() {
		System.out.println("Hello red team ");

	}
	@Test
	public void two() {
		System.out.println("Hello white team");

	}
	@Test
	public void three() {
		System.out.println("Hello white team");

	}
	@Test(groups= {"red"})
	public void four() {
		System.out.println("Hello red team");

	}
	
}
