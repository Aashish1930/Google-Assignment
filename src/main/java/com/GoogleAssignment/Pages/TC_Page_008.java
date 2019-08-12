package com.GoogleAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GoogleAssignment.Base.TestBase;


//8.  To verify the Google apps/products on Google products webpage
public class TC_Page_008 extends TestBase {

	public TC_Page_008() {

		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"zippy-1-content\"]/div/ul/li[1]")
	WebElement AundroidAuto;

	@FindBy(xpath = "//*[@id=\"zippy-1-content\"]/div/ul/li[2]")
	WebElement AundroidOs;

	@FindBy(xpath = "//*[@id=\"zippy-1-content\"]/div/ul/li[3]")
	WebElement Celendar;

	@FindBy(xpath = "//*[@id=\"zippy-1-content\"]/div/ul/li[4]")
	WebElement CardBord;

	@FindBy(xpath = "//*[@id=\"zippy-1-content\"]/div/ul/li[5]")
	WebElement chrome;

	@FindBy(xpath = "//*[@id=\"zippy-1-content\"]/div/ul/li[10]")
	WebElement contact;

	@FindBy(xpath = "//*[@id=\"zippy-1-content\"]/div/ul/li[13]")
	WebElement drive;

	@FindBy(xpath = "//*[@id=\"zippy-1-content\"]/div/ul/li[32]")
	WebElement GooglePay;

	@FindBy(xpath = "//*[@id=\"zippy-1-content\"]/div/ul/li[33]")
	WebElement GooglePlay;

	@FindBy(xpath = "//*[@id=\"zippy-1-content\"]/div/ul/li[34]")
	WebElement GooglePlayBook;

	@FindBy(xpath = "//*[@id=\"zippy-1-content\"]/div/ul/li[35]")
	WebElement GooglePlayGames;

	
	
	public void verifyProduct(){
		
		driver.get("https://www.google.co.in/intl/en/about/products/");
		GooglePlayGames.isDisplayed();
		GooglePlayBook.isDisplayed();
		GooglePlay.isDisplayed();
		GooglePay.isDisplayed();
		drive.isDisplayed();
		contact.isDisplayed();
		chrome.isDisplayed();
		CardBord.isDisplayed();
		Celendar.isDisplayed();
		AundroidAuto.isDisplayed();
		 AundroidOs.isDisplayed();
				
	}
	
	
	
	
	
	
	
}
