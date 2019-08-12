package com.GoogleAssignment.Testcases;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.GoogleAssignment.Base.TestBase;
import com.GoogleAssignment.Pages.GoogleApps;
import com.GoogleAssignment.Pages.LoginMyAccountPage;
import com.GoogleAssignment.Pages.MyAccountPage;
import com.GoogleAssignment.Pages.PhotosPage;

public class LoginMyAccountTest_004 extends TestBase {

	GoogleApps apps;
	LoginMyAccountPage Page;

	public LoginMyAccountTest_004() {
		super();
	}

	@BeforeClass
	public void setup() {

		initilization();
		apps = new GoogleApps();
		Page = new LoginMyAccountPage();

	}

	@Test(priority=1)
	public void LoginAccount() {
		Page = apps.SignInMyAccount();
		Page.LoginMyAccount(prop.getProperty("username"),prop.getProperty("password"));

	}
	@Test(priority=2)
	public void LogOutAccount() {
		Page.signout();

	}

	@AfterClass
	public void stop(){
		driver.quit();
	}
	
	
	
}
