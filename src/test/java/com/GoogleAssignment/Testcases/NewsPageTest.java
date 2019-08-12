package com.GoogleAssignment.Testcases;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.GoogleAssignment.Base.TestBase;
import com.GoogleAssignment.Pages.GoogleApps;
import com.GoogleAssignment.Pages.Newspage;

public class NewsPageTest extends TestBase {

	GoogleApps apps;
	Newspage Nw;

	public NewsPageTest() {
		super();
	}

	@BeforeClass
	public void setup() {

		initilization();
		apps = new GoogleApps();
		Nw = new Newspage();

	}

	@Test
	public void LogoTest() {

		Nw = apps.ClickOnNewspage();
		boolean flag = Nw.ValidateNewsLogo();
		Assert.assertTrue(flag);
		log.info("Logo VaLidate");
		driver.navigate().to(prop.getProperty("url"));

	}

	@Test
	public void TitleTest() {
		Nw = apps.ClickOnNewspage();
		String Title = driver.getTitle();
		System.out.println("Title is :- " + Title);
		Assert.assertEquals(Title, "Google News");
		driver.navigate().to(prop.getProperty("url"));

	}

	@Test
	public void TopStoriesTest() {

		Nw = apps.ClickOnNewspage();

		boolean flag = Nw.ValidateTopStories();
		Assert.assertTrue(flag);
		log.info("TopStories VaLidate");
		driver.navigate().to(prop.getProperty("url"));

	}

	@AfterClass
	public void stop() {
		driver.quit();
	}

}
