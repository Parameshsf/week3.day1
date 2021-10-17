package week3.day1;

public class ExecuteInheritance {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		BMW ob = new BMW();
		ob.accelerate();
		ob.applyBrake();
		ob.closeDoor();
		ob.driveVehicle();
		ob.enableAirBag();
	
		AUDI au = new AUDI();
		au.closeDoor();
		
		Bajaj ba = new Bajaj();
		ba.accelerate();
		
		Mahindra ma = new Mahindra();
		ma.applyBrake();
		ma.wheelAuto();
	}

}
