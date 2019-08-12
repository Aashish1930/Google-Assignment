package com.GoogleAssignment.Testcases;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.GoogleAssignment.Base.TestBase;
import com.GoogleAssignment.Pages.GmailPage;
import com.GoogleAssignment.Pages.GoogleApps;
import com.GoogleAssignment.Pages.GoogleDrivePage;

public class GoogleDriveTest extends TestBase {

	GoogleApps apps;
	GoogleDrivePage drive;

	public GoogleDriveTest() {
		super();
	}

	@BeforeClass
	public void setup() {

		initilization();
		apps = new GoogleApps();
		drive = new GoogleDrivePage();

	}

	@Test
	public void DriveLogoTest() {

		drive = apps.ClickOnDrivepage();
		boolean flag = drive.ValidateLogo();
		Assert.assertTrue(flag);
		log.info("Logo VaLidate");
		driver.navigate().to(prop.getProperty("url"));

	}

	@Test
	public void ValidateMeatDrive() {

		drive = apps.ClickOnDrivepage();
		boolean flag = drive.ValidateMeatDrive();
		Assert.assertTrue(flag);
		log.info("MeatDrive VaLidate");
		driver.navigate().to(prop.getProperty("url"));

	}

	@Test
	public void ValidateUsingDrive() {

		drive = apps.ClickOnDrivepage();
		boolean flag = drive.ValidateUsingDrive();
		Assert.assertTrue(flag);
		log.info("UsingDrive VaLidate");
		driver.navigate().to(prop.getProperty("url"));

	}

	
	@Test
	public void TitleTest() {
		drive = apps.ClickOnDrivepage();
		String Title = driver.getTitle();
		System.out.println("Title is :- " + Title);
		Assert.assertEquals(Title, "Google Drive: Free Cloud Storage for Personal Use");
		driver.navigate().to(prop.getProperty("url"));

	}



	@AfterClass
	public void stop() {
		driver.quit();
	}

}
