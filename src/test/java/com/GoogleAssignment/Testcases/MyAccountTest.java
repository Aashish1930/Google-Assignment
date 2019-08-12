package com.GoogleAssignment.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.GoogleAssignment.Base.TestBase;
import com.GoogleAssignment.Pages.GoogleApps;
import com.GoogleAssignment.Pages.MyAccountPage;

public class MyAccountTest extends TestBase {

	
	GoogleApps app;
	MyAccountPage account;
	
	public MyAccountTest()
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initilization();
		app=new GoogleApps();
		account= new MyAccountPage();
		
	}
	
	@Test
	public void ValidateMyAccount()
	{
		
		account=app.ClickMyAccount();
		String Title=driver.getTitle();
		
		System.out.println("Title is :--"+Title);
		Assert.assertEquals(Title, "Google Account");
		
		boolean flag=	account.ValidateLogo();
		Assert.assertTrue(flag);
		
	}
	
	@AfterClass
	public void Stop(){
		
		
		driver.quit();
	}
		
	
	
	
	
	
	
}
