package com.GoogleAssignment.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.GoogleAssignment.Base.TestBase;
import com.GoogleAssignment.Pages.GoogleApps;
import com.GoogleAssignment.Pages.PlayPage;

public class PlayPageTest extends TestBase {

	PlayPage play;
	GoogleApps app;
	
	
	public PlayPageTest(){
		super();
	}
	
	
	@BeforeClass
	public void setup() {
		
		initilization();
		app= new GoogleApps();
		play=new PlayPage();
		
		
	}
	
	@Test
	public void TitleTest(){
		play=app.ClickOnPlayPage();
		String Title =driver.getTitle();
		System.out.println("Title is :- "+Title);
		Assert.assertEquals(Title, "Google Play");
		driver.navigate().to(prop.getProperty("url"));
		
	}
	
	
	
	
	@Test
	public void validatePlayLogo(){
		
		play=app.ClickOnPlayPage();
		boolean logo=play.ValidatePlayLogo();
		Assert.assertTrue(logo);
		System.out.println("vallidate logo");
		driver.navigate().to(prop.getProperty("url"));
	}
	
	@Test
	public void validatePlaySearchbox(){
		
		play=app.ClickOnPlayPage();
		boolean searchbox=play.ValidatePlaySearchBox();
		Assert.assertTrue(searchbox);
		System.out.println("vallidate searchbox");
		driver.navigate().to(prop.getProperty("url"));
	}
	
	
	@Test
	public void validatePlaySearchbutton(){
		
		play=app.ClickOnPlayPage();
		boolean searchbutton=play.ValidateSearchButton();
		Assert.assertTrue(searchbutton);
		System.out.println("search button validate");
		driver.navigate().to(prop.getProperty("url"));
	}
	
	
	@AfterClass
	public void Stop(){
		
		driver.quit();
	}
	
}
