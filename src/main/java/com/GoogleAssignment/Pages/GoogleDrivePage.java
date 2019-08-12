package com.GoogleAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GoogleAssignment.Base.TestBase;

public class GoogleDrivePage extends TestBase {
	
	public GoogleDrivePage() {
		PageFactory.initElements(driver, this);
	}

	
	
	
	@FindBy(xpath = "//*[@data-g-label=\"Drive logo\"]")
	WebElement DriveLogo;

	@FindBy(xpath = "//*[@data-g-label=\"Meet Drive\"]")
	WebElement MeatDrive;
	
	
	@FindBy(xpath="/html/body/span/header/nav/ul/li[2]/a")
	WebElement UsingDrive;
	
	
	
	
	public boolean ValidateLogo() {
		return DriveLogo.isDisplayed();

	}
	
	
	public boolean ValidateMeatDrive() {
		return MeatDrive.isDisplayed();

	}
	
	
	public boolean ValidateUsingDrive() {
		return UsingDrive.isDisplayed();

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
