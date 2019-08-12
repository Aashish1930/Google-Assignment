package com.GoogleAssignment.Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.GoogleAssignment.Base.TestBase;
import com.GoogleAssignment.Pages.TeseCase_005;

public class TestCase_005 extends TestBase{

	/*5.  To verify that clicking on the language links (Hindi, Marathi etc) 
	 		launches Google in respective language
	Verification- Please see the objects marked in RED as below
*/
	
	
	
	TeseCase_005 Test;
	
	public TestCase_005(){
		super();
	}
	
	@BeforeClass
	public void setup(){
		initilization();
		Test=new TeseCase_005();
		log.info("Initilization done");
			
	}
	
	@Test
	public void TestHindiLink() throws InterruptedException{
		
		Test.ClickHindiLink();
		log.info("Test Hindi Link ");
		Thread.sleep(5000);
		System.out.println("Google Lounch in Hindi Language ");
		
	}
	
	@Test
	public void TestMarathiLink() throws InterruptedException{
		Test.ClickMarathiLink();
		log.info("Test Marathi Link");
		Thread.sleep(5000);
		System.out.println("Google Lounch in Marathi Language ");
		
	}
	
	@AfterClass
	public void Stop(){
		driver.quit();
	}
	
	
	
}
