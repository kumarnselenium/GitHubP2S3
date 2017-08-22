package transport;

public class Car {

	String sColor;			
	int iNofDoors;			
	float fLength;			
	boolean bIsAutoTransmission;			
	
	public Car()
	{
		
	}
	
	public Car(String sCarColor, int iCarDoors)
	{
		sColor = sCarColor;
		iNofDoors = iCarDoors;
	}
		
	public Car(String sCarColor, int iCarDoors, boolean bTransmissionType)
	{
		sColor = sCarColor;
		iNofDoors = iCarDoors;
		bIsAutoTransmission = bTransmissionType;
	}
	
	public void start()			
	{			
		System.out.println("logic related to start");		
	}			
				
	void stop()			
	{			
		System.out.println("logic related to stop");		
	}			
				
	void moveForward()			
	{			
		System.out.println("logic related to moveForward");	
	}			
				
	void moveBackward()			
	{			
		System.out.println("logic related to move backward");	
	}			

	public static void main(String args[])
	{
		Car oBMW = new Car();
		oBMW.sColor = "Red";
		oBMW.iNofDoors = 4;

		oBMW.start();
		oBMW.moveForward();
		oBMW.moveBackward();
		oBMW.stop();
		
		//Car oHonda = new Car();		//String sSessionTopper = "Kumar";
		Car oHonda1;				//String sSessionTopper;
		oHonda1 = new Car("Yellow", 2);		//sSessionTopper = "Kumar";
		
	}
}































