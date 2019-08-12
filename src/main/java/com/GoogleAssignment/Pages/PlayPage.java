package com.GoogleAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GoogleAssignment.Base.TestBase;

public class PlayPage extends TestBase{
	
	
	
	public PlayPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(xpath="//img[@class=\"gb_ma\"]")
	WebElement PlayLogo;
	
	
	@FindBy(xpath="//*[@id=\"gbqfq\"]")
	WebElement PlaySearchBox;
	
	
	@FindBy(xpath="//*[@id=\"gbqfb\"]")
	WebElement SearchButton;
	
	
	
	
	public boolean ValidatePlayLogo() {
		return PlayLogo.isDisplayed();

	}
	
	public boolean ValidatePlaySearchBox() {
		return PlaySearchBox.isDisplayed();

	}
	
	public boolean ValidateSearchButton() {
		return SearchButton.isDisplayed();

	}
	
	
	
	
}
