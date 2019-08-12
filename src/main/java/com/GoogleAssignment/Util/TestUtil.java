
package com.GoogleAssignment.Util;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.GoogleAssignment.Base.TestBase;

public class TestUtil extends TestBase {

	public static long PAGE_LOAD_TIMEOUT = 20;
	public static long IMPLECIT_WAIT = 20;

	public static String TESTDATA_SHEET_PATH = "";

	static Workbook book;
	static Sheet sheet;

	public static Object[][] getTestData(String sheetName) throws InvalidFormatException {
		FileInputStream file = null;
		try {
			file = new FileInputStream(TESTDATA_SHEET_PATH);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		try {
			book = WorkbookFactory.create(file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		sheet = book.getSheet(sheetName);
		Object[][] data = new Object[sheet.getLastRowNum()][sheet.getRow(0).getLastCellNum()];
		System.out.println("row" + sheet.getLastRowNum());
		System.out.println("cell" + sheet.getRow(0).getLastCellNum());
		for (int i = 0; i < sheet.getLastRowNum(); i++) {
			for (int k = 0; k < sheet.getRow(0).getLastCellNum(); k++) {
				data[i][k] = sheet.getRow(i + 1).getCell(k).toString();
				// System.out.println(data[i][k]);
			}
		}
		return data;
	}

	public static void TakeScreenshot() throws IOException {

		File srcfile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String CurrentDIr = System.getProperty("user.dir");
		FileHandler.copy(srcfile, new File(CurrentDIr + "/Screenshot/" + System.currentTimeMillis() + ".png"));

	}
	
/*	
	 public static  boolean isTestCaseRunnable(Xls_Reader xls,String testName){
         boolean runmode=false;
 int rwcnt=xls.getRowCount("Test Cases");
 for(int j=2;j<=rwcnt;j++){
 //for(int i=0;i<method.length;i++){
     //System.out.println(method[i].getName());
     System.out.println(xls.getCellData("Test Cases","TCID",j));
     if(testName.equals(xls.getCellData("Test Cases","TCID",j))){
         if(xls.getCellData("Test Cases","Runmode",j).equals("Y")){
             System.out.println("runmode is yes");
             runmode=true;
             break;
         }else{
             System.out.println("runmode is false");
             runmode=false;
             break;
         }
     }   
     }

 return runmode;
}
*/
	
	
	
	
	
	

}
