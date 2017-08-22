package javaConcepts;

public class AmazonUsingMainMethod {
	
	public void login()
	{
		System.out.println("SWD Logic for Login");
	}
	
	public void logout()
	{
		System.out.println("SWD Logic for Logout");
		System.out.println();
	}
	
	public void PurchaseItem()
	{
		System.out.println("SWD Logic for PurchaseItem");
	}
	
	public void UpdateOrder()
	{
		System.out.println("SWD Logic for UpdateOrder");
	}
	
	public void TrashOrder()
	{
		System.out.println("SWD Logic for TrashOrder");
	}

	public static void main(String args[])
	{
		AmazonUsingMainMethod oAmazon = new AmazonUsingMainMethod();
		
		//1. Create Order
		oAmazon.login();
		oAmazon.PurchaseItem();
		oAmazon.logout();
		
		//2. Modify Order
		oAmazon.login();
		oAmazon.UpdateOrder();
		oAmazon.logout();
		
		//3. DeleteOrder
		oAmazon.login();
		oAmazon.TrashOrder();
		oAmazon.logout();
	}

}
