package week3.day1;

public class AxisBank extends BankInfo {
	
	@Override
	public void deposit() {
		// TODO Auto-generated method stub
		//super.deposit(); //This action calls the deposit method from Base Class 'BankInfo'
		System.out.println("This is a overriding method deposit() from a child class");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AxisBank obj = new AxisBank();
		obj.deposit(); //This object calls the method deposit() from the same class 
		obj.saving(); //This object calls the method saving() from Base class BankInfo

	}

}
