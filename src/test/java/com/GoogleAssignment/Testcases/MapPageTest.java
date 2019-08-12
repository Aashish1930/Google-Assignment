package com.GoogleAssignment.Testcases;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.GoogleAssignment.Base.TestBase;
import com.GoogleAssignment.Pages.GoogleApps;
import com.GoogleAssignment.Pages.MapPage;

public class MapPageTest extends TestBase {

	GoogleApps app;
	MapPage page;
	
	public MapPageTest()
	{
		super();
	}
	
	@BeforeClass
	public void setup()
	{
		initilization();
		app= new GoogleApps();
		page= new MapPage();
		
	}

	
//--------------------------------ValidateMenu------------------------------------------------------	
	@Test
	public void ValidateMenu(){
		
		page=app.ClickOnMapPage();
		boolean flag =page.ValidateMapMenu();
		Assert.assertTrue(flag);
		System.out.println("validate Menu Button ");
		driver.navigate().to(prop.getProperty("url"));
		
	}
	
	
//--------------------------------------------TitleCheck--------------------------------------------------------	
	@Test
	public void TitleCheck()
	{
		page=app.ClickOnMapPage();
		String Titile=driver.getTitle();
		System.out.println("Title is --"+Titile);
		Assert.assertEquals(Titile, "Google Maps");
		System.out.println("Title VAlidate");
		driver.navigate().to(prop.getProperty("url"));
		
	}
	

//-------------------------------ValidateSearchClick------------------------------------------------------	
	
	@Test
	public void ValidateSearchClick(){
		
		page=app.ClickOnMapPage();
		boolean flag =page.ValidateSearchClick();
		Assert.assertTrue(flag);
		System.out.println("Validate Search Click");
		driver.navigate().to(prop.getProperty("url"));
	}
	

//--------------------------	-------------------ValidateSearchMapBox----------------------------------------
	
	
	@Test
	public void ValidateSearchMapBox(){
		
		page=app.ClickOnMapPage();
		boolean flag =page.ValidateSearchMapBox();
		Assert.assertTrue(flag);
		System.out.println("Validate SearchMapBox");
		driver.navigate().to(prop.getProperty("url"));
	}
	

//-----------------------------------ValidateZoomIn---------------------------------------------------
	
	@Test
	public void ValidateZoomIn(){
		
		page=app.ClickOnMapPage();
		boolean flag =page.ValidateZoomIn();
		Assert.assertTrue(flag);
		System.out.println("Validate ZoomIn");
		driver.navigate().to(prop.getProperty("url"));
	}
	
	
//-----------------------------------------------ValidateZoomOut-----------------------------------------	
	@Test
	public void ValidateZoomOut(){
		
		page=app.ClickOnMapPage();
		boolean flag =page.ValidateZoomOut();
		Assert.assertTrue(flag);
		System.out.println("Validate ZoomOut");
		driver.navigate().to(prop.getProperty("url"));
	}
	

	
	//--------------------------------------ValidateMyLocationButton-----------------------------------------
	
	@Test
	public void ValidateMyLocationButton(){
		
		page=app.ClickOnMapPage();
		boolean flag =page.ValidateMyLocationButton();
		Assert.assertTrue(flag);
		System.out.println("Validate MyLocation Buttont");
		driver.navigate().to(prop.getProperty("url"));
	}

//--------------------------------------ValidateDirection--------------------------------------------------------	
	
	@Test
	public void ValidateDirection(){
		
		page=app.ClickOnMapPage();
		boolean flag =page.ValidateDirection();
		Assert.assertTrue(flag);
		System.out.println("Validate Direction");
		driver.navigate().to(prop.getProperty("url"));
	}
	

//-------------------------------------------------ValidateImagery--------------------------------------------
	
	
	public void ValidateImagery(){
		page=app.ClickOnMapPage();
		boolean flag =page.ValidateImagery();
		Assert.assertTrue(flag);
		System.out.println("Validate Imagery");
		driver.navigate().to(prop.getProperty("url"));
	}
	
	
	
	
	@AfterClass
	public void stop(){
		driver.quit();
	}
	
	
}
