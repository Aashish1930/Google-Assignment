package com.GoogleAssignment.Pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GoogleAssignment.Base.TestBase;

public class TestCasePage_007 extends TestBase {
	
	
	public TestCasePage_007(){
		PageFactory.initElements(driver, this);
	}
	

	@FindBy(name = "q")
	WebElement SearchBox;

	@FindBy(xpath = "//*[@id=\"tsf\"]/div[2]/div/div[2]/div[2]/ul/li[1]")
	WebElement SearchButton;

	@FindBy(xpath = "//*[@id=\"rso\"]/div[2]/div/div/div/div[1]/a/h3")
	WebElement WikipediaLink;
	
	@FindBy(xpath = "//*[@id=\"rso\"]/div[4]/div/div/g-section-with-header/div[1]/div/div/div[2]/g-link/a")
	WebElement TwiterLink;
	
	@FindBy(xpath = "//*[@id=\"rso\"]/div[7]/div/div[1]/div/div/div[1]/a/h3")
	WebElement FacebookLink;
	
	
	
	
	public void EnterData(String data) throws InterruptedException{
		SearchBox.sendKeys(data);
		SearchButton.click();
	}
	
	public void CheckLink(){
		
		WikipediaLink.isDisplayed();
		FacebookLink.isDisplayed();
		TwiterLink.isDisplayed();
	}
	
	
	
	
	
}
