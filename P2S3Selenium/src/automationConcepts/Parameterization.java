package automationConcepts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Parameterization {

	public void searchEBay() throws InterruptedException
	{
		//1.Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		ExcelRead oSearchSht = new ExcelRead("C:\\Selenium\\Selenium Docs\\P2S3 Class Notes\\eBayTestData.xls", "Search");
		
		//2. launch www.ebay.com
		oBrowser.get("https://www.ebay.com/");
		
		//3. Enter laptop in the search textbox
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys(oSearchSht.getCellData("SearchFor", 1));
		
		//4. Click on Search button
		oBrowser.findElement(By.id("gh-btn")).click();
		
	}
	

	@Test
	public void searchEBayDataDrivenScenario() throws InterruptedException
	{
		//1.Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		ExcelRead oSearchSht = new ExcelRead("C:\\Selenium\\Selenium Docs\\P2S3 Class Notes\\eBayTestData.xls", "Search");
		int iNofRows = oSearchSht.rowCount();
		
		for(int iRow=1; iRow<iNofRows; iRow++)
		{
			
			//2. launch www.ebay.com
			oBrowser.get("https://www.ebay.com/");
			
			//3. Enter laptop in the search textbox
			oBrowser.findElement(By.id("gh-ac")).clear();
			oBrowser.findElement(By.id("gh-ac")).sendKeys(oSearchSht.getCellData("SearchFor", iRow));
			
			//4. Click on Search button
			oBrowser.findElement(By.id("gh-btn")).click();
			
			Thread.sleep(4000);
		}
	}
}
