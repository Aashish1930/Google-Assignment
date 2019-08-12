package com.GoogleAssignment.Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.GoogleAssignment.Base.TestBase;
import com.GoogleAssignment.Pages.TeseCase_005;
import com.GoogleAssignment.Pages.TestCasePage_007;

public class TestCase_007 extends TestBase{
	
	TestCasePage_007 test;
	
	public TestCase_007(){
		super();
	}
	
	@BeforeClass
	public void setup(){
		initilization();
		test= new TestCasePage_007();
		log.info("Initilization done");
	}	
	
	@Test
	public void AllLinkCheck() throws InterruptedException{
		
		
		
		test.EnterData("amitabh bachchan");
		test.CheckLink();
		System.out.println("Test amitabh bachchan All link");
		log.info("Amitabh Bachchan all link test");
		
		
	}

	@AfterClass
	public void close(){
		driver.quit();
	}
	
	
	

}