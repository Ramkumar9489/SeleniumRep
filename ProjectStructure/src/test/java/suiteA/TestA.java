package suiteA;

import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import TestBase.testBase;

public class TestA extends testBase{
	
	
	@Test
	public void testA()
	{
		
		System.out.println("Starting Test A");
		
		test.log(Status.INFO, "Starting A");
		test.log(Status.INFO, "Endig A");
		test.log(Status.PASS, "Test Passed");
	}
	
	

}
