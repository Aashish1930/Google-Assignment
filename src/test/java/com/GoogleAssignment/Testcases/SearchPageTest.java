package com.GoogleAssignment.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.GoogleAssignment.Base.TestBase;
import com.GoogleAssignment.Pages.GoogleApps;
import com.GoogleAssignment.Pages.SearchPage;

public class SearchPageTest extends TestBase {

	GoogleApps app;
	SearchPage sp;

	public SearchPageTest() {
		super();
	}

	@BeforeClass
	public void setup() {
		initilization();
		log.info("Initilized all driver");
		app = new GoogleApps();
		sp = new SearchPage();
	}

	// ------------------------ValidateSearchBox-----------------------------------------------------

	@Test
	public void ValidateSearchBox() throws InterruptedException {

		sp = app.ClickOnSearchPage();
		boolean flag = sp.ValidateSerchBox();
		Assert.assertTrue(flag);

		if (flag == true) {
			System.out.println("googleTextBoxTest is displayed");
		} else {
			System.out.println("Unsuccessfully");
		}

	}

	// ------------------------ValidateSearchButton-----------------------------------------------------

	@Test
	public void ValidateSearchButton() throws InterruptedException {

		sp = app.ClickOnSearchPage();

		boolean flag = sp.validateSearchButton();
		if (flag == true) {
			log.info("Search Button Is present");
			System.out.println("Search Button Is present ");
		} else {
			System.out.println("Unsuccessfully");
		}

	}

	// ------------------------ValidateSearchButton-----------------------------------------------------

	@Test
	public void ValidateLuckyButton() throws InterruptedException {

		sp = app.ClickOnSearchPage();
		boolean flag = sp.ValidateLuckyButton();
		if (flag == true) {
			log.info("Luckey Button Is present ");
			System.out.println("Luckey Button Is present ");
		} else {
			System.out.println("Unsuccessfully");
		}

	}

	@AfterClass
	public void Stop() throws InterruptedException {
		log.info("closed");
		Thread.sleep(5000);
		driver.quit();
	}

}
