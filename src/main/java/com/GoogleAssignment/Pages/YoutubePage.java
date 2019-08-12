package com.GoogleAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GoogleAssignment.Base.TestBase;

public class YoutubePage extends TestBase {

	
	public YoutubePage()
	{
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//ytd-topbar-logo-renderer[@id=\"logo\"]")
	WebElement YoutubeLogo;
	
	@FindBy(xpath="//*[@name=\"search_query\"]")
	WebElement YoutubeSearch;
	
	@FindBy(xpath="//*[@aria-label='Create a video or post']")
	WebElement  CreateVideoPost;
	
	
	
	public boolean ValidateLogo(){
		return YoutubeLogo.isDisplayed();
	}
	
	public boolean YoutubeSearch(){
		return YoutubeSearch.isDisplayed();
	}
	
	
	public boolean CreateVideoPost()
	{
		return CreateVideoPost.isDisplayed();
	}
	
	
	
	
	
	
	
	
	
	
}
