package javaConcepts;

import org.junit.Test;

public class JavaLoops {
	
	public void exForIfloop()
	{
		String sCustState = "CA";
				
		if(sCustState == "CA")
		{
			System.out.println("3% tax rebate");
		}
		
	}
	
	public void exForIfElseloop()	//26
	{
		String sTripType = "RoundTrip";
				
		if(sTripType == "Oneway")
		{
			System.out.println("SWD logic to select 'One Way' option");
		}
		else
		{
			System.out.println("SWD logic to select 'Round Trip' option");
		}
		
	}

	public void exForSwitch()
	{
		String sSearchOption = "Hotel";
		
		switch (sSearchOption) 
		{
			case "Flight":
				System.out.println("SWD logic to select 'Flight' Search");
				String sTripType = "RoundTrip";
				
				if(sTripType == "Oneway")
				{
					System.out.println("SWD logic to select 'One Way' option");
				}
				else
				{
					System.out.println("SWD logic to select 'Round Trip' option");
				}
				break;
				
			case "Hotel":		
				System.out.println("SWD logic to select 'Hotel' search");
				break;
				
			case "Car":		
				System.out.println("SWD logic to select 'Car' search");
				break;
				
			case "Vacations":
				System.out.println("SWD logic to select 'Vacations' search");
				break;
				
			default:
				System.out.println("Please pass correct search option");
				break;
		}
		
	}

	public void exForNestedIf()
	{
		String sSearchOption = "Hotel";
		
		if(sSearchOption == "Flight")
		{
			System.out.println("SWD logic to select 'Flight' Search");
			String sTripType = "RoundTrip";
			
			if(sTripType == "Oneway")
			{
				System.out.println("SWD logic to select 'One Way' option");
			}
			else
			{
				System.out.println("SWD logic to select 'Round Trip' option");
			}
		}
		else if(sSearchOption == "Hotel")
		{
			System.out.println("SWD logic to select 'Hotel' search");
		}
		else if(sSearchOption == "Car")
		{
			System.out.println("SWD logic to select 'Car' search");
		}
		else if(sSearchOption == "Vacations")
		{
			System.out.println("SWD logic to select 'Vacations' search");
		}
		else 
		{
			System.out.println("Please pass correct search option");
		}
		
	}

	public void exForFORLoop()
	{
		for(int i=1; i<=3; i++)
		{
			System.out.println("SWD Logic for FT functionality - iteration " + i);
			//i++ ==> i=i+1
		}
	}
	
	public void exForWhileLoop()
	{
		int i=100; 
		while(i<=3)
		{
			System.out.println("SWD Logic for FT functionality - iteration " + i);
			i++;
		}
	}
	
	@Test
	public void exForDoWhileLoop()
	{
		int i=100; 
		do
		{
			System.out.println("SWD Logic for FT functionality - iteration " + i);
			i++;
		}while(i<=3);
	}
}
