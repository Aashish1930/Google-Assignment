package com.GoogleAssignment.Testcases;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.GoogleAssignment.Base.TestBase;
import com.GoogleAssignment.Pages.GmailPage;
import com.GoogleAssignment.Pages.GoogleApps;
import com.GoogleAssignment.Pages.Newspage;

public class GmailTest extends TestBase {

	GoogleApps apps;
	GmailPage Gp;

	public GmailTest() {
		super();
	}

	@BeforeClass
	public void setup() {

		initilization();
		apps = new GoogleApps();
		Gp= new GmailPage();

	}
	
	
	@Test
	public void SignInTest() {

		Gp=apps.ClickOnGmailpage();
		boolean flag = Gp.ValidateSignIn();
		Assert.assertTrue(flag);
		log.info("SignIn VaLidate");
		driver.navigate().to(prop.getProperty("url"));

	}
	
	
	

	@Test
	public void LogoTest() {

		Gp=apps.ClickOnGmailpage();
		boolean flag = Gp.ValidateGmailLogo();
		Assert.assertTrue(flag);
		log.info("Logo VaLidate");
		driver.navigate().to(prop.getProperty("url"));

	}

	@Test
	public void TitleTest() {
		Gp=apps.ClickOnGmailpage();
		String Title = driver.getTitle();
		System.out.println("Title is :- " + Title);
		Assert.assertEquals(Title, "Gmail - Free Storage and Email from Google");
		driver.navigate().to(prop.getProperty("url"));

	}

	@Test
	public void CreateButtonTest() {

		Gp=apps.ClickOnGmailpage();
		boolean flag = Gp.ValidateSignUp();
		Assert.assertTrue(flag);
		log.info("Button VaLidate");
		driver.navigate().to(prop.getProperty("url"));

	}
	
	
	@AfterClass
	public void stop(){
		driver.quit();
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
