package com.GoogleAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GoogleAssignment.Base.TestBase;

public class GmailPage extends TestBase {

	public GmailPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "/html/body/div[2]/div[1]/div[2]/div[2]/div")
	WebElement GmailLogo;

	@FindBy(xpath = "/html/body/div[2]/div[1]/div[4]/ul[1]/li[3]/a")
	WebElement CreateAccount;
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")
	WebElement SignIn;

	public boolean ValidateSignIn() {
		return SignIn.isDisplayed();

	}
	
	
	public boolean ValidateGmailLogo() {
		return GmailLogo.isDisplayed();

	}

	public boolean ValidateSignUp() {
		return CreateAccount.isDisplayed();

	}

	
}
