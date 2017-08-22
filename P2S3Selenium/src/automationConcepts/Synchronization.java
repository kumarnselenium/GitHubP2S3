package automationConcepts;

import java.util.concurrent.TimeUnit;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Synchronization {

	public void exForImplicitWait()
	{
			//1.Open Chrome Browser
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
			ChromeDriver oBrowser = new ChromeDriver();
			
			oBrowser.manage().window().maximize();
			
			oBrowser.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
			
			//2. launch www.ebay.com
			oBrowser.get("https://www.ebay.com/");
			
			//3. Enter laptop in the search textbox
			oBrowser.findElement(By.id("gh-ac123")).clear();
			oBrowser.findElement(By.id("gh-ac")).sendKeys("camera");
			
			//4. Click on Search button
			oBrowser.findElement(By.id("gh-btn")).click();		
	}
	

	@Test
	public void exForExplicitWait() throws InterruptedException
	{
			//1.Open Chrome Browser
			System.setProperty("webdriver.chrome.driver", "C:\\Selenium\\Selenium Docs\\BrowserDrivers\\ChromeDriver.exe");
			ChromeDriver oBrowser = new ChromeDriver();
			
			oBrowser.manage().window().maximize();
			
			
			//2. launch www.ebay.com
			oBrowser.get("https://www.ebay.com/");
			
			//3. Enter laptop in the search textbox
			oBrowser.findElement(By.id("gh-ac")).clear();
			oBrowser.findElement(By.id("gh-ac")).sendKeys("camera");
			
			//4. Click on Search button
			oBrowser.findElement(By.id("gh-btn")).click();
						
			//Thread.sleep(180000);
			
			WebDriverWait oWDW = new WebDriverWait(oBrowser, 180);
			oWDW.until(ExpectedConditions.elementToBeClickable(oBrowser.findElement(By.className("kwcat"))));
			
			if(oBrowser.findElements(By.className("kwcat")).size()>0)
			{
				System.out.println("Search is Success");
			}
			
		
	}
	
}












