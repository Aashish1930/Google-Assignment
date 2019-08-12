package com.GoogleAssignment.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.GoogleAssignment.Base.TestBase;

public class TeseCase_005 extends TestBase {

	/*5.  To verify that clicking on the language links (Hindi, Marathi etc) 
		launches Google in respective language
Verification- Please see the objects marked in RED as below
*/
	
	
	public TeseCase_005(){
		PageFactory.initElements(driver, this);
	}
	
	
	
	
	@FindBy(xpath="//*[@id=\"SIvCob\"]/a[1]")
	WebElement Hindi;
	
	@FindBy(xpath="//*[@id=\"SIvCob\"]/a[4]")
	WebElement marathi;
	
	
	public void ClickHindiLink(){
		Hindi.click();
		driver.navigate().refresh();
	}
	
	public void ClickMarathiLink(){
		marathi.click();
		driver.navigate().refresh();
	}
	
	
	
	
	
}
