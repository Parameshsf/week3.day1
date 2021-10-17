package week3.day1;

public class Desktop extends Computer {
	
	public void desktopSize() {
		// TODO Auto-generated method stub
		
		System.out.println("This is standard desktop with desktop table");

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Desktop obj = new Desktop();
		obj.computerModel();//method from other Class 'Computer'
		obj.desktopSize();//method from the same Class

	}

}
