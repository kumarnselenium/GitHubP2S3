package javaConcepts;

public class CalculatorWithInputParam {

	int iOutput;
	
	 void add(int iNum1,int iNum2)
	  {
		 iOutput = iNum1 + iNum2;
		 System.out.println(iOutput);
	  }
	 
	 void sub(int iNum1,int iNum2)
	  {
		 iOutput = iNum1 - iNum2;
		 System.out.println(iOutput);
	  }
	 
	 void multi(int iNum1,int iNum2)
	  {
		 iOutput = iNum1 * iNum2;
		 System.out.println(iOutput);
	  }
	 
	 void div(int iNum1,int iNum2)
	  {
		 iOutput = iNum1 / iNum2;
		 System.out.println(iOutput);
	  }
	 
	 public static void main (String args[])
	  {
	   
		 	CalculatorWithInputParam oNum = new CalculatorWithInputParam();
	  
	        oNum.add(3, 4);
			oNum.sub(25225, 626);
			oNum.multi(15, 634);
			oNum.div(62462, 621);
		
	  }
}