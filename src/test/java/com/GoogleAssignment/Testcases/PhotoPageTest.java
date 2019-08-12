package com.GoogleAssignment.Testcases;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.GoogleAssignment.Base.TestBase;
import com.GoogleAssignment.Pages.GoogleApps;
import com.GoogleAssignment.Pages.GoogleDrivePage;
import com.GoogleAssignment.Pages.PhotosPage;

public class PhotoPageTest extends TestBase {

	GoogleApps apps;
	PhotosPage page;

	public PhotoPageTest() {
		super();
	}

	@BeforeClass
	public void setup() {

		initilization();
		apps = new GoogleApps();
		page = new PhotosPage();

	}

	@Test
	public void PhotoLogoTest() {

		page = apps.ClickOnPhotosPage();
		boolean flag = page.PhotoLogo();
		Assert.assertTrue(flag);
		log.info("Logo VaLidate");
		driver.navigate().to(prop.getProperty("url"));

	}

	@Test
	public void ValidateGoTOPhotoButton() {

		page = apps.ClickOnPhotosPage();
		boolean flag = page.GoTOGooglePhoto();
		Assert.assertTrue(flag);
		log.info("GotoPhotobutton VaLidate");
		driver.navigate().to(prop.getProperty("url"));

	}

	@Test
	public void TitleTest() {
		page = apps.ClickOnPhotosPage();
		String Title = driver.getTitle();
		System.out.println("Title is :- " + Title);
		Assert.assertEquals(Title, "Google Photos - All your photos organized and easy to find");
		driver.navigate().to(prop.getProperty("url"));

	}

	@AfterClass
	public void stop() {
		driver.quit();
	}

}
