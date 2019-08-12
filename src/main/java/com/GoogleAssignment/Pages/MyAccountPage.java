 package com.GoogleAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GoogleAssignment.Base.TestBase;

public class MyAccountPage extends TestBase{
	
	
	
	
	public  MyAccountPage() {
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//*[@id=\"sdgBod\"]")
	WebElement GoogleAcountLogo;
	
	
	
	
	
	public boolean ValidateLogo()
	{
		return GoogleAcountLogo.isDisplayed();
	}
	
	
	
}
