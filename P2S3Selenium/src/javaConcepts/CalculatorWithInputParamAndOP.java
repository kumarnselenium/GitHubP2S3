package javaConcepts;

import transport.Car;
import transport.Ship;

public class CalculatorWithInputParamAndOP {

	int iOutput;
	
	void readCellData(int iRpwNo, int iColNo)
	{
		
	}

	void readCellData(int iRpwNo, String  sColName)
		{
			
		}

	 int add(int iNum1,int iNum2)
	  {
		 iOutput = iNum1 + iNum2;
		 return iOutput;
	  }

	 int add(int iNum1,int iNum2, int iNum3)
	 {
		 iOutput = iNum1 + iNum2 + iNum3;
		 return iOutput;
	 }
	 
	 int add(int iNum1,int iNum2, int iNum3, int iNum4)
	 {
		 iOutput = iNum1 + iNum2 + iNum3 + iNum4;
		 return iOutput;
	 }
	 	 
	 void add(String a, int b)
	 {
		 
	 }
	 
	 int sub(int iNum1,int iNum2)
	  {
		 iOutput = iNum1 - iNum2;
		 return iOutput;
	  }
	 
	 int multi(int iNum1,int iNum2)
	  {
		 iOutput = iNum1 * iNum2;
		 return iOutput;
	  }
	 
	 int div(int iNum1,int iNum2)
	  {
		 iOutput = iNum1 / iNum2;
		 return iOutput;
	  }
	 
	 int getStudentTotalMarks(String sStudentName, int iBatchNo, boolean isOfferedDiscount)
	 {
		 return 1241;
	 }
	 
	 String getStudentName(int iBatchNo)
	 {
		 return "Kumar";
	 }
	 
	 String getBestCar(String sCarType, Car oAbc)
	 {
		 return sCarType;
	 }
	 
	 Ship getTransport(Car oAbc)
	 {
		 Ship oTitanic;
		 oTitanic = new Ship();
		 return oTitanic;
	 }
	 
	 public Car getBestluxuryCar(int a)
	 {
	 		//<statements>
		 	Car oBCar = new Car();
	 		return oBCar;
	 }

	 public static void main (String args[])
	  {
	   
		 	CalculatorWithInputParamAndOP oNum = new CalculatorWithInputParamAndOP();
	  
	        int iAddition = oNum.add(3, 4);
	        System.out.println(iAddition);
	        
	        System.out.println(oNum.add(1, 2,3));
	        System.out.println(oNum.add(1, 2,3, 4));
	        
	        System.out.println(oNum.sub(25225, 626));
	        
	       // Thread.sleep(3000); //wait 
	        
	        System.out.println(oNum.multi(15, 634));
	        System.out.println(oNum.div(62462, 621));
	        
	        Car oToyota = new Car();
	        oNum.getBestCar("Sedan", oToyota);
	        
	        Ship oAbcd =  oNum.getTransport(oToyota);
	        
	        
		
	  }
}




































