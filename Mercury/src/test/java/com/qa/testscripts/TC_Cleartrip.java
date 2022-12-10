package com.qa.testscripts;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.IOException;

import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.qa.pages.CleartripPages;
import com.qa.utility.ExcelUtility;

public class TC_Cleartrip extends Testbase{
	
CleartripPages cpages;
@DataProvider(name="Data")
public String[][] getData() throws IOException {
	
	String xFile="C:\\Users\\GOD\\Desktop\\java source file\\Tutorialspoint\\src\\test\\java\\com\\qa\\testdata\\cleartrip.xlsx";
	String xSheet="Sheet1";
	
	int rowCount = ExcelUtility.getRowCount(xFile, xSheet);
	int cellCount = ExcelUtility.getCellCount(xFile, xSheet, rowCount);
	
	String[][] data = new String[rowCount][cellCount];
	
	for(int i=1; i<=rowCount; i++) {
		for(int j=0;j<cellCount;j++) {
			data[i-1][j] = ExcelUtility.getCellData(xFile, xSheet, i, j);
		}
	}
	return data;
}
@Test(dataProvider="Data")

public void cleartrip(String from,String to) throws InterruptedException, AWTException  {
	cpages=new CleartripPages(Driver);
	String year="2023";
	String month="MARCH";
	String date="16";
	
	CleartripPages.from.click();
	Robot robo=new Robot();
	robo.keyPress(KeyEvent.VK_BACK_SPACE);
	
	
	CleartripPages.to.click();
	
	
	robo.keyRelease(KeyEvent.VK_BACK_SPACE);
	
	Thread.sleep(3000);
	CleartripPages.from.sendKeys(from);
	Thread.sleep(5000);
	CleartripPages.Innerfrom.click();
	Thread.sleep(2000);
	//CleartripPages.to.clear();
	CleartripPages.to.sendKeys(to);
	Thread.sleep(5000);
	CleartripPages.Innerto.click();
//	CleartripPages.Date.clear();
/*	CleartripPages.dateselect.click();
	System.out.println(CleartripPages.innerdate.getText());
	//month and year selection
	while(true) {
		String monthdate= CleartripPages.innerdate.getText();
		String arr[]=monthdate.split(" ");
		String mon=arr[0];
		String yr=arr[1];
		if(mon.equalsIgnoreCase(month) && yr.equalsIgnoreCase(year))
			break;
		else
			CleartripPages.nextarrow.click();
	}
	//date selection
	
	//Thread.sleep(5000);*/
	CleartripPages.Searchflight.click();
	Thread.sleep(50000);
	Driver.navigate().back();
	Thread.sleep(50000);
//	CleartripPages.from.clear();
 //	CleartripPages.to.clear();
	
	
}
}
