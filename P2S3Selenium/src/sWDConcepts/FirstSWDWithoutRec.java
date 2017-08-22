package sWDConcepts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstSWDWithoutRec {
	
	public void searchEBay() throws InterruptedException
	{
		//1.Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		//2. launch www.ebay.com
		oBrowser.get("https://www.ebay.com/");
		
		//3. Enter laptop in the search textbox
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("camera");
		
		//4. Click on Search button
		oBrowser.findElement(By.id("gh-btn")).click();
		
		//5. Click on 'Advanced link'
		oBrowser.findElement(By.linkText("Advanced")).click();
		
		//6. click on eBay Image/logo
		//oBrowser.findElement(By.id("gh-logo")).click();
		
		Thread.sleep(3000);
		
		//7. Select the ' Title and description' checkbox
		if(!oBrowser.findElement(By.id("LH_TitleDesc")).isSelected())
		{
			oBrowser.findElement(By.id("LH_TitleDesc")).click();
		}
		
		//8. Select Location
		String sLocation ="Located In";
		
		if(sLocation.equals("Located In"))
		{
			oBrowser.findElement(By.id("LH_LocatedInRadio")).click();
		}
		else
		{
			oBrowser.findElement(By.id("LH_PrefLocRadio")).click();
		}
		
		Thread.sleep(5000);
		//Selecting the Country
		Select uiCountry = new Select(oBrowser.findElement(By.id("_salicSelect")));
		uiCountry.selectByIndex(2);	//Canada
		Thread.sleep(2000);
		uiCountry.selectByValue("15");	//Australia
		Thread.sleep(2000);
		uiCountry.selectByVisibleText("Thailand");	//Thailand
		
		
	}

	public void browserOptions() throws InterruptedException
	{
		//1.Open Chrome Browser
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		//maximize
		oBrowser.manage().window().maximize();
		
		oBrowser.navigate().to("https://www.ebay.com/");
		
		//oBrowser.navigate().back();
		//oBrowser.navigate().forward();
		
		//System.out.println(oBrowser.getTitle());
		
		//System.out.println(oBrowser.getCurrentUrl());
		
		if(oBrowser.getPageSource().contains("Community"))
		{
			System.out.println("pass");
		}
		else
		{
			System.out.println("fail");
		}
				
		oBrowser.quit();
	}
	
	
	
	
}




































