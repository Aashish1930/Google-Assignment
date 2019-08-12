package com.GoogleAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.GoogleAssignment.Base.TestBase;

public class GoogleApps extends TestBase {

	
	public GoogleApps() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@id=\"gbwa\"]")
	WebElement GoogleApssButton;

	@FindBy(xpath = "//*[@id='gb192']")
	WebElement AccountButton;

	@FindBy(xpath = "//*[@id='gb1']")
	WebElement SearchButton;

	@FindBy(xpath = "//*[@data-pid=\"8\" and @id=\"gb8\"]")
	WebElement MapButton;

	@FindBy(xpath = "//*[@id=\"gb36\"]")
	WebElement YouTubeButton;

	@FindBy(xpath="//a[@id='gb78']")
	WebElement PlayButton;

	@FindBy(id="gb5")
	WebElement NewsButton;

	@FindBy(xpath="//*[@data-pid=\"23\"and @id=\"gb23\"]")
	WebElement GmailButton;

	
	//@FindBy(xpath="//*[@id=\"yDmH0d\"]/c-wiz/div/div/c-wiz/div/div/ul[1]/li[8]/a/span[1]")
	@FindBy(id="gb53")
	WebElement ContactButton;

	@FindBy(id = "gb49")
	WebElement DriveButton;

	@FindBy(id = "gb24")
	WebElement CelendarButton;

	@FindBy(id = "gb51")
	WebElement TranslateButton;

	@FindBy(id = "gb31")
	WebElement PhotosButton;

	

	

	// ------------------------------------------ALL VERIFYING METHOD BELLOW---------------------------------------------

	public void Validate_GoogleApp() {
		GoogleApssButton.click();
	}

	public Boolean AccountButton() {
		return AccountButton.isDisplayed();

	}

	public Boolean SearchButton() {
		return SearchButton.isDisplayed();

	}

	public Boolean MapButton() {
		return MapButton.isDisplayed();

	}

	public Boolean YouTubeButton() {
		return YouTubeButton.isDisplayed();

	}
	
	public Boolean ValidatePlayButton() {
		return PlayButton.isDisplayed();

	}
	
	public Boolean ValidateNewsButton() {
		return NewsButton.isDisplayed();

	}
	
	public boolean ValidateGmailButton() {
		return GmailButton.isDisplayed();
	}
	
	
	
	public boolean validateContactButton() {
		return ContactButton.isDisplayed();
	}	
	
	

	public boolean ValidateDriveButton() {
		return DriveButton.isDisplayed();
	}

	public boolean validateCelanderButton() {
		return CelendarButton.isDisplayed();
	}
	
	
	public boolean TranslateButton() {
		
		return TranslateButton.isDisplayed();
	}
	
	public boolean ValidatePhotosButon() {
		return PhotosButton.isDisplayed();
	}

	public void YouTubeButtonClick() {
		YouTubeButton.click();

	}

	/*
	  3. To verify that all the Google apps (My Account, Search, Maps, YouTube,
	  Play, News, Gmail, Drive, Calender, Google+, Translate, Photos) are
	  launched properly
	 ------------------------------------------------- -------------------------------------------------------------------------
	  Verification - When clicked on Google apps, appropriate apps web page
	  should be displayed. Verify the browser title or browser's tab Title +
	  object(s) marked in RED
	 */

	// ----------------------------------- Assignment 3 All Methods bellow---------------------------------------------------


	
	
	public MyAccountPage ClickMyAccount()
	{
		GoogleApssButton.click();
		AccountButton.click();
		return new MyAccountPage();
		
	}

	
	
	public SearchPage ClickOnSearchPage(){
		
		GoogleApssButton.click();
		SearchButton.click();
		return new SearchPage();
		
	}
	
     public MapPage ClickOnMapPage(){
		
		GoogleApssButton.click();
		MapButton.click();
		return new MapPage ();
		
	}
	
     public YoutubePage ClickOnYoutubePage(){
 		
 		GoogleApssButton.click();
 		YouTubeButton.click();
 		return new YoutubePage ();
 		
 	}
 	
     public PlayPage ClickOnPlayPage(){
  		
  		GoogleApssButton.click();
  		PlayButton.click();
  		return new PlayPage ();
  		
  	}
     
     public Newspage ClickOnNewspage(){
   		
   		GoogleApssButton.click();
   		NewsButton.click();
   		return new Newspage ();
   		
   	} 
     
     public GmailPage ClickOnGmailpage(){
    		
    		GoogleApssButton.click();
    		GmailButton.click();
    		return new GmailPage ();
    		
    	} 
      
     
     public GoogleDrivePage ClickOnDrivepage(){
 		
 		GoogleApssButton.click();
 		DriveButton.click();
 		return new GoogleDrivePage ();
 		
 	} 
      
     
     public PhotosPage ClickOnPhotosPage(){
  		
    	 GoogleApssButton.click();
    	 PhotosButton.click();
  		return new PhotosPage ();
  		
  	} 
       
//----------------------------------Assgnment 4 Started all method here ---------------------------------
     
     
     
     public LoginMyAccountPage SignInMyAccount(){
		
   		GoogleApssButton.click();
   		GmailButton.click();
    	 return new LoginMyAccountPage();
    	 
    	 
     }
     
     
     
     
     
     
     
     
     
	
     
     
     
     
	
}
