package com.GoogleAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GoogleAssignment.Base.TestBase;

public class Newspage extends TestBase {

	public Newspage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "sdgBod")
	WebElement NewsLogo;

	@FindBy(xpath="//a[@class='SFllF KKjvXb']")
	WebElement TopStories;

	@FindBy(xpath = "//*[@aria-label=\"Main menu\"]")
	WebElement Menu;

	
	
	public boolean ValidateNewsLogo() {
		return NewsLogo.isDisplayed();

	}

	public boolean ValidateTopStories() {

		Menu.click();
		return TopStories.isDisplayed();

	}

	
	
	
	
}
