package com.GoogleAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GoogleAssignment.Base.TestBase;

public class MapPage extends TestBase {

	public MapPage() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//*[@id=\"omnibox-singlebox\"]/div[1]/div[1]/button")
	WebElement MenuButton;
	
	@FindBy(xpath="//*[@id=\"searchboxinput\"]")
	WebElement SearchMapBox;
	
	@FindBy(xpath="//*[@id=\"searchbox-searchbutton\"]")
	WebElement SearchClick;
	
	@FindBy(xpath="//*[@id=\"searchbox-directions\"]")
	WebElement Direction;
	
	
	@FindBy(xpath="//*[@class=\"widget-mylocation-button-icon-common widget-mylocation-button-normal widget-mylocation-cookieless\"]")
	WebElement MyLocationButton;
	
	@FindBy(xpath="//*[@id=\"widget-zoom-in\"]")
	WebElement ZoomIn;
	
	@FindBy(xpath="//*[@id=\"widget-zoom-out\"]")
	WebElement ZoomOut;
	
	@FindBy(xpath="//*[@class=\"widget-expand-button-icon\"]")
	WebElement ImageryButton;
	
	

	
	public boolean ValidateMapMenu(){
		return MenuButton.isDisplayed();
	}
	

	public boolean ValidateSearchMapBox(){
		return SearchMapBox.isDisplayed();
	}
	
	
	public boolean ValidateSearchClick(){
		return SearchClick.isDisplayed();
	}
	

	public boolean ValidateDirection(){
		return Direction.isDisplayed();
	}
	
	
	public boolean ValidateMyLocationButton(){
		return MyLocationButton.isDisplayed();
	}
	
	
	public boolean ValidateZoomIn(){
		return  ZoomIn.isDisplayed();
	}
	

	public boolean ValidateZoomOut(){
		return ZoomOut.isDisplayed();
	}
	
	public boolean ValidateImagery(){
		return ImageryButton.isDisplayed();
	}
	
	
}
