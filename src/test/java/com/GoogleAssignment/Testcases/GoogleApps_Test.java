package com.GoogleAssignment.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import com.GoogleAssignment.Base.TestBase;
import com.GoogleAssignment.Pages.GoogleApps;

public class GoogleApps_Test extends TestBase {

	GoogleApps googleapps;

	//-----------------------------------------CALLING PARENT CLASS CUNSTROCTOR TO INITILIZATE PROPERTOES FILE-------------------------------------
	
	public GoogleApps_Test() {
		super();
	}

	
//------------------------------------INITILIZATION OF DRIVER AND CLREATE PAGE FILE OBJECT----------------------------------------------------	
	
	@BeforeClass
	public void setup() {
		initilization();
		googleapps = new GoogleApps();
		
	}

//---------------VALIDATE GOOGLEAPPS BUTTON----------------------------------------
	
	
	@Test
	public void GoogleAppsClick() {
		googleapps.Validate_GoogleApp();
		log.info("click on googole apps ");
	}
	
	

	// ------------------------Validate Account Button -----------------------------------------------------
	
	
	@Test
	public void Present_Account_Button() {

		boolean flag = googleapps.AccountButton();
		Assert.assertTrue(flag);

		if (flag == true) {
			System.out.println("Google Account Button is displayed");
			log.info("Google Account Button is displayed");
			
		} else {
			System.out.println("Unsuccessfully");
		}

	}

	
	//---------------------VALIDATE SEARCH BUTTON------------------------------------------------------
	
	@Test
	public void Present_Search_Button() {
		boolean flag = googleapps.SearchButton();

		if (flag = true) {
			System.out.println("Search Button is Displayed ");
			log.info("Search  Button is displayed");
			
		}

		else {
			System.out.println("Unsuccessfully");
		}
	}

//-------------------------------------	VALIDATE MAP BUTTON-------------------------------------------------------------
	
	@Test
	public void Present_MapButton() {
		boolean flag = googleapps.MapButton();
		if (flag = true) {
			System.out.println("Map Button Is Displayed ");
			log.info("Map Button is displayed");
			
		} else {
			System.out.println("Unsuccessfully");
		}

	}

	
	//------------------------------------VALIDATE YOU TUBE BUTTON---------------------------------------------------------------
	
	@Test
	public void Presen_YouTubeButton() {
		boolean flag = googleapps.YouTubeButton();
		if (flag = true) {
			System.out.println("YouTube Button is Displayed ");
			log.info("You Tube Button is displayed");
			
		} else {
			System.out.println("Unsuccessfully");
		}

	}
	
	//------------------------------------VALIDATE play BUTTON---------------------------------------------------------------
	
	@Test
	public void Presen_PlayButton() {
		boolean flag = googleapps.ValidatePlayButton();
		if (flag = true) {
			System.out.println("play Button is Displayed ");
			log.info("Play Button is displayed");
			
		} else {
			System.out.println("Unsuccessfully");
		}

	}
	
	//------------------------------------VALIDATE NEWS BUTTON---------------------------------------------------------------
	
	@Test
	public void Presen_NewsButton(){
		boolean flag = googleapps.ValidateNewsButton();
		if (flag = true) {
			System.out.println("news Button is Displayed ");
			log.info("News  Button is displayed");
			
		} else {
			System.out.println("Unsuccessfully");
		}

	}
	
	
	//------------------------------------VALIDATE GMAIL BUTTON---------------------------------------------------------------
	
	@Test
	public void Presen_GmailButton() {
		boolean flag = googleapps.ValidateGmailButton();
		if (flag = true) {
			System.out.println("gmail Button is Displayed ");
			log.info("Gmail Button is displayed");
			
		} else {
			System.out.println("Unsuccessfully");
		}

	}
	
	
//-----------------------------------------VALIDATE CONTACT BUTTON----------------------------------------------------------
	
	@Test
	public void present_ContactButton()
	{
		boolean flag = googleapps.validateContactButton();
		if(flag==true)
		{
			System.out.println("contact button is present ");
			log.info("contact present");
		}
		else {
			System.out.println("Unsuccessfully");
		}
	}
	
	
	
	
	//------------------------------------VALIDATE DRIVE BUTTON---------------------------------------------------------------
	
	@Test
	public void Presen_driveButton() {
		boolean flag = googleapps.ValidateDriveButton();
		if (flag = true) {
			System.out.println("drive  Button is Displayed ");
			log.info("drive  Button is displayed");
			
		} else {
			System.out.println("Unsuccessfully");
		}

	}
	
//------------------------------------VALIDATE CALENDER BUTTON---------------------------------------------------------------
	
	@Test
	public void Presen_calenderButton() {
		boolean flag = googleapps.validateCelanderButton();
		if (flag = true) {
			System.out.println("calender Button is Displayed ");
			log.info("calender Button is displayed");
			
		} else {
			System.out.println("Unsuccessfully");
		}

	}
	
	
	
	
//--------------------------------VALIDATE TRANSLATE BUTTON-----------------------------------------------------
	
	@Test
	public void Presen_TranslateButton() {
		boolean flag = googleapps.TranslateButton();
		if (flag = true) {
			System.out.println("translate Button is Displayed ");
			log.info("translate Button is displayed");
			
		} else {
			System.out.println("Unsuccessfully");
		}

	}
	
//-------------------------------------------------VALIDATE PHOTOS BUTTON--------------------------------------------	
	@Test
	public void Presen_PhotosButton() {
		boolean flag = googleapps.ValidatePhotosButon();
		if (flag = true) {
			System.out.println("photos Button is Displayed ");
			log.info("photos Button is displayed");
			
		} else {
			System.out.println("Unsuccessfully");
		}

	}


	
//------------------------------------------------CLICK YOU TUBE BUTTON---------------------------------------------------------------
	@Test
	public void YoutubeClick() throws InterruptedException {
		googleapps.YouTubeButtonClick();

		log.info("YouTube Button click success ");
		
		Thread.sleep(5000);
	}
	
	
	
//-----------------------------------------------------AFTER BROWSER CLOSED---------------------------------------------------------------------------	
	

	@AfterClass
	public void stop() {
		driver.quit();
	}

}
