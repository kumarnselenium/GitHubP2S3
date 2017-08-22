package javaConcepts;

public class Calculator {

	int iNum1,iNum2, iOutput;
	
	 void add()
	  {
		 iOutput = iNum1 + iNum2;
		 System.out.println("Addition - " + iOutput);
	  }
	 
	 void sub()
	  {
		 iOutput = iNum1 - iNum2;
		 System.out.println("Substraction - " +iOutput);
	  }
	 
	 void multi()
	  {
		 iOutput = iNum1 * iNum2;
		 System.out.println("Multiplication - " +iOutput);
	  }
	 
	 void div()
	  {
		 iOutput = iNum1 / iNum2;
		 System.out.println("Division - " +iOutput);
	  }
	 
 public static void main (String args[])
  {
   
	 Calculator oNum = new Calculator();
  
        oNum.iNum1=3;
        oNum.iNum2=4;
 
        oNum.add();	//3, 4
		oNum.sub();	//25225, 626
		oNum.multi();	//15, 634
		oNum.div(); // 62462, 621
	
  }
}