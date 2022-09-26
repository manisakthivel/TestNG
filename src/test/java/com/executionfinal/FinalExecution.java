package com.executionfinal;

import org.testng.annotations.Test;

public class FinalExecution {

	@Test(priority=0)
	public void one() {
		System.out.println("start the car");
	}
	@Test(groups= {"blackteam"})
	public void two() {
		System.out.println("put 1st gear");
	}
	@Test(priority=3)
	public void three() {
		System.out.println("put 2nd gear");
	}
	@Test(priority=1)
	public void music() {
		System.out.println("music on");
	}
	
}
