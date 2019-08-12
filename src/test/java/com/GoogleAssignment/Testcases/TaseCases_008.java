package com.GoogleAssignment.Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.GoogleAssignment.Base.TestBase;
import com.GoogleAssignment.Pages.TC_Page_008;




//8.  To verify the Google apps/products on Google products webpage
public class TaseCases_008 extends TestBase {

	TC_Page_008 tc;

	public TaseCases_008() {
		super();
	}

	@BeforeClass
	public void setup() {

		initilization();
		tc = new TC_Page_008();
	}

	@Test
	public void ProductVerify() {

		tc.verifyProduct();
		log.info("all product verify");
		System.out.println("all product verify");

	}
	
	
	@AfterClass
	public void close(){
		driver.quit();
	}
	

}
