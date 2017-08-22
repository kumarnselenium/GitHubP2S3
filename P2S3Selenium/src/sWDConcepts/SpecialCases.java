package sWDConcepts;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.junit.Test;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class SpecialCases {

	WebDriver oBrowser=null;
	
	public void launchApplication(String sBrowserType, String sURL)
	{
		
		if(sBrowserType.equals("Chrome"))
		{
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
			oBrowser = new ChromeDriver();
		}
		else if(sBrowserType.equals("Firefox"))
		{
			System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\FFGeckoDriver.exe");
			oBrowser = new FirefoxDriver();
		}
		else if(sBrowserType.equals("IE"))
		{
			System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\IEDriverServer32.exe");
			DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
			capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
			oBrowser = new InternetExplorerDriver(capabilities);	
		}
		else if(sBrowserType.equals("HTMLUnit"))
		{	
			oBrowser = new HtmlUnitDriver();
		}
		
		oBrowser.get(sURL);
		
		oBrowser.manage().window().maximize();
	}

	public void getScreenshot(String sFilePath) throws InterruptedException, IOException
	{
		
		TakesScreenshot oScn = (TakesScreenshot) oBrowser;
		
		//oSrc ==> contains Screenshot information
		File oSrc = oScn.getScreenshotAs(OutputType.FILE);
		
		//Empty Physical File
		File oDst = new File(sFilePath);
		
		//Copy the oSrc file to oDst
		FileUtils.copyFile(oSrc, oDst);
	}
	
	public void handlingMenus() throws InterruptedException
	{
		launchApplication("Firefox", "http://www.nasdaq.com/");
		
		Thread.sleep(3000);
		
		Actions oAct = new Actions(oBrowser);
		oAct.moveToElement(oBrowser.findElement(By.xpath("//span[contains(.,'Quotes')]/ancestor::a")));		
		//oAct.moveToElement(oBrowser.findElement(By.xpath("//span[contains(.,'TRACK')]")));
		
		oAct.build();
		oAct.perform();
		
		Thread.sleep(3000);
		
		oBrowser.findElement(By.partialLinkText("Access Capital")).click();
		
	}

	public void captureScreenshot() throws InterruptedException, IOException
	{
		launchApplication("Firefox", "http://www.nasdaq.com/");
		
		getScreenshot("C:\\Selenium\\Selenium Docs\\P2S3 Class Notes\\screenshot.jpeg");
		
	}
	
	public void handlingAlert() throws InterruptedException
	{
		launchApplication("Chrome", "http://www.nasdaq.com/symbol/adp/real-time");
		
		//Make sure Checkbox selected
		if(!oBrowser.findElement(By.id("cookiepref")).isSelected())
		{
			oBrowser.findElement(By.id("cookiepref")).click();
		}
		
		//UnSelect
		oBrowser.findElement(By.id("cookiepref")).click();
		
		//get the pop up
		//Switch the focus to the alert
		Alert oAlt = oBrowser.switchTo().alert();
		System.out.println(oAlt.getText());
		Thread.sleep(4000);
		//accept
		oAlt.accept();
		
		//Reject
		//oAlt.dismiss();
		
	}

	public void handlingMultipleBrowsers()
	{
		launchApplication("Chrome", "https://www.cigna.com/");
		
		System.out.println(oBrowser.getTitle());
		
		//Click on Cigna Medicare
		oBrowser.findElement(By.linkText("Cigna Medicare")).click();
				
		//Get the Parent Browser/window ID
		String sParentID = oBrowser.getWindowHandle();
					
		//All Browser/Window IDs
		Set<String> sAllBrowserIds = oBrowser.getWindowHandles();				
		
		//Switch the focus from Main Window to Child Window by excluding the sParentID from sAllBrowserIds
		for(String sEachBrwID:sAllBrowserIds)
		{
			if(!(sEachBrwID.equals(sParentID)))	//Excluding the Parent browser id
			{
				//Changing the focus to Child browser
				oBrowser.switchTo().window(sEachBrwID);
				break;	//Exiting the For loop
			}
		}	
		
		String sBrwTitle;
		//More than one Child - Switch the focus from Main Window to Child Window
		for(String sEachBrwID:sAllBrowserIds)
		{
			//Changing the focus to Child browser
			oBrowser.switchTo().window(sEachBrwID);
			
			sBrwTitle = oBrowser.getTitle();
			
			if(sBrwTitle.contains("Emirates"))	//Excluding the Parent browser id
			{			
				break;	//Exiting the For loop
			}
		}	

		System.out.println(oBrowser.getTitle());
		
		//Click on Learn More under medicare Advantage
		oBrowser.findElement(By.xpath("//h2[contains(.,'Medicare Advantage')]/following-sibling::a/span[contains(.,'Learn More')]")).click();
		
		//h2[contains(.,'Medicare Advantage')]/following-sibling::a/span[contains(.,'Learn More')]
	}

	@Test
	public void handlingFrames() throws InterruptedException
	{
		
		launchApplication("Chrome", "http://www.proquest.com/about/careers/current-career-opportunities.html");
			
		//Switch the focus to frame
		oBrowser.switchTo().frame(oBrowser.findElement(By.className("careers")));
		
		
		Select uiCountry = new Select(oBrowser.findElement(By.id("location")));
		uiCountry.deselectAll();
		Thread.sleep(2000);
		uiCountry.selectByVisibleText("Africa");
		Thread.sleep(2000);
		uiCountry.selectByVisibleText("Berlin");
		
		
	}
}
























