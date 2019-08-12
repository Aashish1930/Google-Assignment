package com.GoogleAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GoogleAssignment.Base.TestBase;

public class SearchPage extends TestBase {

	public SearchPage() {

		PageFactory.initElements(driver, this);

	}

	
	@FindBy(xpath = "//*[@name=\"q\"]")
	WebElement Searchbox;

	@FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[1]")
	WebElement Searchbutton;

	@FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div/div[3]/center/input[2]")
	WebElement Luckybutton;

	
	
//  -------------------------ALL VALIDATE METHOD BELLOW -----------------------------------
	
	
public boolean ValidateSerchBox() 
{
return Searchbox.isDisplayed();
}

public boolean validateSearchButton()
{
return Searchbutton.isDisplayed();
}

public boolean ValidateLuckyButton()
{
return Luckybutton.isDisplayed();
}

	
	
	
	
	
	
	
	
	
}
