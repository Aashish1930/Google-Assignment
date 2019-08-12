package com.GoogleAssignment.Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.GoogleAssignment.Base.TestBase;
import com.GoogleAssignment.Pages.GoogleApps;
import com.GoogleAssignment.Pages.YoutubePage;

import junit.framework.Assert;

public class YouTubeTest extends TestBase{
	
	
	YoutubePage p;
	GoogleApps app;
	
	public YouTubeTest(){
		super();
	}
	
	@BeforeClass
	public void Setup(){
		initilization();
		app= new GoogleApps();
		p= new YoutubePage();
		
		
	}
	
	@Test
	public void ValidateLogo(){
		
		p=app.ClickOnYoutubePage();
		boolean logo=p.ValidateLogo();
		Assert.assertTrue(logo);
		log.info("logo present ");
		
	}
	
	@Test
	public void Titile()
	{
		p=app.ClickOnYoutubePage();
		String Title=driver.getTitle();
		Assert.assertEquals(Title,"YouTube");
		System.out.println("Title is :-- "+Title);
		driver.navigate().to(prop.getProperty("url"));
	}
	
	
	
	
	@Test
	public void ValidateYouTubeSeach(){
		
		p=app.ClickOnYoutubePage();
		boolean search=p.YoutubeSearch();
		Assert.assertTrue(search);
		log.info("YoutubeSearch is present ");
		driver.navigate().to(prop.getProperty("url"));
		
	}
	
	@Test
	public void ValidateCreateVideoPost(){
		
		p=app.ClickOnYoutubePage();
		boolean PostButton=p.CreateVideoPost();
		Assert.assertTrue(PostButton);
		log.info("PostButton is present ");
		driver.navigate().to(prop.getProperty("url"));
		
	}
	
	@AfterClass
	public void Stop(){
		driver.quit();
	}
	

}
