package javaConcepts;

import org.junit.Test;

public class JavaOperators {

	public void exForLogicalOperators()
	{
		String sCustState = "CA";
		int iCustAge = 27;
		
		if(sCustState == "CA" && iCustAge>18)
		{
			System.out.println("Impose 12% tax");
		}
		else
		{
			System.out.println("Impose 10% tax");	
		}
		
		if(sCustState == "NY" || iCustAge>60)
		{
			System.out.println("Impose 5% tax");
		}
		else
		{
			System.out.println("Impose 10% tax");	
		}
		
		
		if(!(sCustState == "CA" ))
		{
			System.out.println("Impose 5% tax");
		}
		else
		{
			System.out.println("Impose 12% tax");	
		}
	}
	
	@Test
	public void StringOperations()
	{
		String str1 = "This is Selenium";
		String str2 = "Welcome...";
		String str3 = "  thanks for you transaction. Your Ref # 97019375 please note ";
				
		int iLength = str1.length();
		System.out.println(iLength);	//16
		
		System.out.println(str3);		//  thanks for you transaction. Your Ref # 97019375  
		System.out.println(str3.trim());//thanks for you transaction. Your Ref # 97019375
		
		
		System.out.println(str3.substring(41));	//97019375 please note 
		System.out.println(str3.substring(41, 49));	//97019375
		
		System.out.println(str1.replace("Selenium", "UFT")); //This is UFT
		
		System.out.println(str2.concat(str1));	//Welcome...This is Selenium
		
		if(str1.contains("Selenium"))					//55
		{
			System.out.println("Login is Successful");
		}
		else
		{
			System.out.println("Login is unSuccessful");
		}
		
		if(str1.equals("This is SELenium"))					//68
		{
			System.out.println("equals is Successful");
		}
		else
		{
			System.out.println("equals is unSuccessful");
		}
		
		if(str1.equalsIgnoreCase("This is SELENIUM"))		//73
		{
			System.out.println("equalsIgnoreCase is Successful");
		}
		else
		{
			System.out.println("equalsIgnoreCase is unSuccessful");
		}
	}
	
}
