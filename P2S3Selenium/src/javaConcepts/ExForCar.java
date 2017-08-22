package javaConcepts;

import transport.Car;

public class ExForCar {
		
	public static void main(String args[])
	{
		Car oBMW = new Car();
		
	//	oBMW.sColor = "Red";
	//	oBMW.iNofDoors = 4;
		
		oBMW.start();
		
		
		Car oAcura = new Car("Red", 4);
		
	}
	

}
