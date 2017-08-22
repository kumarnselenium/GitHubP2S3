package sWDConcepts;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.List;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GroupOfUIObjs {

	WebDriver oBrowser;
	
	public void getAllDeals()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		oBrowser = new ChromeDriver();
		oBrowser.get("http://www.redflagdeals.com/");
		
		List<WebElement> uiAllDeals = oBrowser.findElements(By.xpath("//h4[@class='block__title']/a"));
		
		//Nof similar
		int iTotalDeals = uiAllDeals.size();
		
		for(int i=0; i<iTotalDeals; i++)
		{
			System.out.println(uiAllDeals.get(i).getText());
		}
	}
	
	public void getAllDealsWithForLoop()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		oBrowser = new ChromeDriver();
		oBrowser.get("http://www.redflagdeals.com/");
		
		List<WebElement> uiAllDeals = oBrowser.findElements(By.xpath("//h4[@class='block__title']/a"));
		
		//Nof similar
		int iTotalDeals = uiAllDeals.size();
		
		for(WebElement uiEachDeal:uiAllDeals)
		{
			System.out.println(uiEachDeal.getText());
		}
	}

	public void getAllDealsWriteToNotepad() throws FileNotFoundException
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		oBrowser = new ChromeDriver();
		oBrowser.get("http://www.redflagdeals.com/");
		
		List<WebElement> uiAllDeals = oBrowser.findElements(By.xpath("//h4[@class='block__title']/a"));
		
		//Nof similar
		int iTotalDeals = uiAllDeals.size();
		
		//Empty Text file
		File oFile = new File("C:\\Selenium\\Selenium Docs\\P2S3 Class Notes\\deals.txt");
		
		//To write into a file
		PrintWriter oPW = new PrintWriter(oFile);
		
		for(WebElement uiEachDeal:uiAllDeals)
		{
			System.out.println(uiEachDeal.getText());
			
			//Write to a file
			oPW.println(uiEachDeal.getText());
		}
		
		//Save
		oPW.flush();
		
		//Close
		oPW.close();
		
	}

	public void getAlllINKS()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		oBrowser = new ChromeDriver();
		oBrowser.get("http://www.redflagdeals.com/");
		
		List<WebElement> uiAllLinks = oBrowser.findElements(By.tagName("a"));
		
		//Nof similar
		int iTotalDeals = uiAllLinks.size();
		
		System.out.println(iTotalDeals);
		
		for(WebElement uiEachDeal:uiAllLinks)
		{
			System.out.println(uiEachDeal.getText());
		}
	}
	
	@Test
	public void getAllCheckboxes()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		oBrowser = new ChromeDriver();
		oBrowser.get("https://www.ebay.com/sch/ebayadvsearch");
		
		List<WebElement> uiAllCheckBoxes = oBrowser.findElements(By.xpath("//input[@type='checkbox']"));
		List<WebElement> uiAllRadiobuttons = oBrowser.findElements(By.xpath("//input[@type='raido']"));
		List<WebElement> uiAllButtons = oBrowser.findElements(By.xpath("//input[@type='button']"));
		
		//Nof similar
		int iTotalDeals = uiAllCheckBoxes.size();
		
		System.out.println(iTotalDeals);
		
		for(WebElement uiEachCheckbox:uiAllCheckBoxes)
		{
			if(!uiEachCheckbox.isSelected())
			{
				uiEachCheckbox.click();
			}
		}
	}
}





