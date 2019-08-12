package com.GoogleAssignment.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.GoogleAssignment.Base.TestBase;
import com.GoogleAssignment.Pages.GoogleHomePage;

public class HomeTestCase extends TestBase {

	GoogleHomePage googlehome;

	public HomeTestCase() {
		super();
	}

	@BeforeClass
	public void setup() {
		initilization();
		googlehome = new GoogleHomePage();
	}

	// ------------------------ValidateSearchBox-----------------------------------------------------
	@Test
	public void ValidateSearchBox() {

		boolean flag = googlehome.ValidateSerchBox();
		Assert.assertTrue(flag);

		if (flag == true) {
			System.out.println("googleTextBoxTest is displayed");
		} else {
			System.out.println("Unsuccessfully");
		}

	}

	// --------------------------ValidateSearchButton------------------------------------------------------
	@Test
	public void ValidateSearchButton() {
		boolean flag = googlehome.validateSearchButton();
		if (flag == true) {
			System.out.println("Search Button Present and Validate ");
		} else {
			System.out.println("Unsuccessfully");
		}

	}

	// -----------------------------ValidateLuckyButton---------------------------------------------------------
	@Test
	public void ValidateLuckyButton() {
		boolean flag = googlehome.ValidateLuckyButton();
		if (flag == true) {
			System.out.println("Lucky Button validate success ");
		} else {
			System.out.println("Unsuccessfully");
		}

	}

	// ---------------------------------------------VaidateSignInButton---------------------------------------------------------
	@Test
	public void VaidateSignInButton() {

		boolean flag = googlehome.ValidateSignInButton();

		if (flag == true) {
			System.out.println("Sign In Button Validate ");
		} else {
			System.out.println("Unsuccessfully");
		}

	}

	// ---------------------------------AFTER THAT QUITE THE BROWSER----------------------------------------------------

	@AfterClass
	public void Stop() {
		log.info("closed");
				
		driver.quit();
		
		

	}

}
