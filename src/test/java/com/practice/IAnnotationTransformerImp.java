package com.practice;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IAnnotationTransformerImp {
	
	//Below test cases for IAnnotation transformer example
	
	@Test
		public void firstMethod() {
			Assert.assertTrue(false);
			System.out.println("Sakthivel");
		}
	@Test
		public void secondMethod() {
			System.out.println("Vasantha");
		}
	@Test
		public void thirdMethod() {
			Assert.assertTrue(false);
			System.out.println("Manikandan");
		}
	@Test
		public void fourthMethod() {
			System.out.println("Meena");
		}
	@Test
		public void fifthMethod() {
			Assert.assertTrue(false);
			System.out.println("Sidhu");
		}
		
}
