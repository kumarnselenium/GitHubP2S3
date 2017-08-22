package sWDConcepts;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;

public class Diferentbrowsers {

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
	
	@Test
	public void exForXPATH()
	{
		launchApplication("Chrome", "http://www.nasdaq.com/extended-trading/premarket-mostactive.aspx");
		
		System.out.println(oBrowser.findElement(By.xpath("//a[contains(.,'QQQ')]/ancestor::td/following-sibling::td[3]")).getText());
	}
	
	
	public void launchApplicationebay()
	{
		WebDriver oBrowser=null;
		String sBrowserType = "Chrome";
		
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
		
		//2. launch www.ebay.com
		oBrowser.get("https://www.ebay.com/");
		
		//3. Enter laptop in the search textbox
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
		
		//4. Click on Search button
		oBrowser.findElement(By.id("gh-btn")).click();
		
	}
	
	public void chromebrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
		ChromeDriver oBrowser = new ChromeDriver();
		
		//2. launch www.ebay.com
		oBrowser.get("https://www.ebay.com/");
		
		//3. Enter laptop in the search textbox
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
		
		//4. Click on Search button
		oBrowser.findElement(By.id("gh-btn")).click();

	}
	
	public void firefoxbrowser()
	{
		System.setProperty("webdriver.gecko.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\FFGeckoDriver.exe");
		FirefoxDriver oBrowser = new FirefoxDriver();
		
		//2. launch www.ebay.com
		oBrowser.get("https://www.ebay.com/");
		
		//3. Enter laptop in the search textbox
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
		
		//4. Click on Search button
		oBrowser.findElement(By.id("gh-btn")).click();

	}

	public void iebrowser()
	{
		System.setProperty("webdriver.ie.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\IEDriverServer32.exe");
		DesiredCapabilities capabilities = DesiredCapabilities.internetExplorer();
		capabilities.setCapability(InternetExplorerDriver.INTRODUCE_FLAKINESS_BY_IGNORING_SECURITY_DOMAINS, true);
		InternetExplorerDriver oBrowser = new InternetExplorerDriver(capabilities);	
		
		//2. launch www.ebay.com
		oBrowser.get("https://www.ebay.com/");
		
		//3. Enter laptop in the search textbox
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
		
		//4. Click on Search button
		oBrowser.findElement(By.id("gh-btn")).click();

	}

	public void htmlUnitdriver()
	{
		HtmlUnitDriver oBrowser = new HtmlUnitDriver();
		//2. launch www.ebay.com
		oBrowser.get("https://www.ebay.com/");
		
		System.out.println(oBrowser.getTitle());
		
		//3. Enter laptop in the search textbox
		oBrowser.findElement(By.id("gh-ac")).clear();
		oBrowser.findElement(By.id("gh-ac")).sendKeys("laptop");
		
		//4. Click on Search button
		oBrowser.findElement(By.id("gh-btn")).click();
		
		System.out.println(oBrowser.getTitle());

	}

}
