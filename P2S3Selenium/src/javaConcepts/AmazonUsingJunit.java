package javaConcepts;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class AmazonUsingJunit {
	
	@Before
	public void login()
	{
		System.out.println("SWD Logic for Login");
	}
	
	@After
	public void logout()
	{
		System.out.println("SWD Logic for Logout");
		System.out.println();
	}
	
	@Test
	public void PurchaseItem()
	{
		System.out.println("SWD Logic for PurchaseItem");
	}
	
	@Test
	public void UpdateOrder()
	{
		System.out.println("SWD Logic for UpdateOrder");
	}
	
	@Test
	public void TrashOrder()
	{
		System.out.println("SWD Logic for TrashOrder");
	}

}
