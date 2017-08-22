package javaConcepts;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;


public class AmazonUsingTestNG {
	
	@BeforeMethod
	public void login()
	{
		System.out.println("SWD Logic for Login");
	}
	
	@AfterMethod
	public void logout()
	{
		System.out.println("SWD Logic for Logout");
		System.out.println();
	}
	
	@Test (priority=98)
	public void PurchaseItem()
	{
		System.out.println("SWD Logic for PurchaseItem");
	}
	
	@Test  (priority=252)
	public void UpdateOrder()
	{
		System.out.println("SWD Logic for UpdateOrder");
	}
	
	@Test  (priority=373)
	public void TrashOrder()
	{
		System.out.println("SWD Logic for TrashOrder");
	}

}
