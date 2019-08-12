package com.GoogleAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GoogleAssignment.Base.TestBase;

public class LoginMyAccountPage extends TestBase {
	
	public LoginMyAccountPage(){
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="/html/body/div[2]/div[1]/div[4]/ul[1]/li[2]/a")
	WebElement SignInButton;
	
	@FindBy(xpath="//*[@name=\"identifier\"]")
	WebElement username;
	
	
	@FindBy(xpath="//*[@id=\"identifierNext\"]")
	WebElement Next;
	
	@FindBy(xpath="//*[@id=\"password\"]/div[1]/div/div[1]/input")
	WebElement password;
	
	@FindBy(xpath="//*[@id=\"passwordNext\"]")
	WebElement PasswordNext;
	
	@FindBy(xpath = "//*[@id=\"gb\"]/div[2]/div[3]/div/div[2]/div/a")
	WebElement Abtn;

	@FindBy(xpath = "//*[@id=\"gb_71\"]")
	WebElement signoutbtn;

	
	
	public void LoginMyAccount(String user, String pass) {

		SignInButton.click();
		String ParentWin = driver.getWindowHandle();
		for (String SubWin : driver.getWindowHandles()) {

			driver.switchTo().window(SubWin);
			System.out.println("sub win " + SubWin);
		}
		System.out.println("main" + ParentWin);
		username.sendKeys(user);
		Next.click();
		password.sendKeys(pass);
		PasswordNext.click();

	}
	
	public void signout() {
		Abtn.click();
		signoutbtn.click();
		}
	

}
