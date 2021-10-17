package week3.day1;

public class InterfaceSample implements Entertainment {
	
	public void television() {
		// TODO Auto-generated method stub
		System.out.println("Television");
		
	}

	public void radio() {
		// TODO Auto-generated method stub
		System.out.println("Radio");
		
	}

	public void cinema() {
		// TODO Auto-generated method stub
		System.out.println("Cinema");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		InterfaceSample inte = new InterfaceSample();
		inte.cinema();
		inte.television();
		inte.radio();

	}

	

}
