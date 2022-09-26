
package com.practice;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

import org.testng.IAnnotationTransformer;
import org.testng.annotations.ITestAnnotation;

public class TransformerEx implements IAnnotationTransformer {

	@Override
	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
		arg0.setRetryAnalyzer(RerunCode.class);
		
	}

	//Due to version issue, after implementing i am getting the below abstract method, so i have modified the 
	//same below.  
	/*@Override
	public void transform(ITestAnnotation arg0, Class arg1, Constructor arg2, Method arg3) {
		// TODO Auto-generated method stub
		
	}*/
	
		
	}

	

	

	

		
	

	

	

		
	

	
		
	

	


