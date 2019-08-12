package com.GoogleAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GoogleAssignment.Base.TestBase;

public class PhotosPage extends TestBase{

	
	
	public PhotosPage() {
		PageFactory.initElements(driver, this);
	}

	
	
	
	@FindBy(xpath = "//*[@id=\"js-header\"]")
	WebElement PhotoLogo;

	@FindBy(xpath = "//*[@id=\"js-hero-btn\"]")
	WebElement GoTOGooglePhoto;
	
	
	
	
	
	
	public boolean PhotoLogo() {
		return PhotoLogo.isDisplayed();

	}
	

	
	public boolean GoTOGooglePhoto() {
		return GoTOGooglePhoto.isDisplayed();

	}
	
	

	
}
