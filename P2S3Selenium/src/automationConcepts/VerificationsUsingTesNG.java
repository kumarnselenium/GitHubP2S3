package automationConcepts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VerificationsUsingTesNG {

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
	public void exForverifications()
	{
		launchApplication("Chrome", "http://www.deal4loans.com/Contents_Calculators.php");
		
		try
		{				
			Assert.assertTrue(oBrowser.findElement(By.xpath("//h1[contains(.,'EMI Calculator')]")).isDisplayed(), "Fail, EMI Calculator page is NOT displayed");
			System.out.println("Pass, EMI Calculator page is displayed");
		}
		catch(Exception e)
		{
			System.out.println("Fail, EMI Calculator page is NOT displayed");
		}
		
		Assert.assertTrue(oBrowser.findElements(By.xpath("//h1[contains(.,'EMI Calculator')]")).size()>0, "Fail, EMI Calculator page is NOT displayed");
		System.out.println("Pass, EMI Calculator page is displayed");
		
		oBrowser.findElement(By.id("Loan_Amount")).clear();
		oBrowser.findElement(By.id("Loan_Amount")).sendKeys("20000");
		
		oBrowser.findElement(By.name("rate")).click();
		
		String sExpectedLAText = "Twenty Thousand";
		String sActualLAText = oBrowser.findElement(By.id("wordloanAmount")).getText();
		
		sExpectedLAText = sExpectedLAText.toLowerCase();
		sActualLAText = sActualLAText.toLowerCase();
		
		Assert.assertTrue(sActualLAText.contains(sExpectedLAText), "Fail, Loan Amount Text is NOT displayed as expected");
		System.out.println("Pass, Loan Amount Text is displayed as expected");
				
		oBrowser.findElement(By.name("rate")).clear();
		oBrowser.findElement(By.name("rate")).sendKeys("5");
		
		oBrowser.findElement(By.name("months")).clear();
		oBrowser.findElement(By.name("months")).sendKeys("200");
		
		oBrowser.findElement(By.xpath("//input[@value='Calculate']")).click();
		
		String sExpectedEMI = "147.58";
		String sActualEMI = oBrowser.findElement(By.name("pay")).getAttribute("value");
		
		sActualEMI = sActualEMI.trim();
		Assert.assertTrue(sExpectedEMI.contains(sActualEMI), "Fail, EMI is NOT displayed as expected");
		System.out.println("Pass, EMI is displayed as expected");
				
	}
	
	

}

