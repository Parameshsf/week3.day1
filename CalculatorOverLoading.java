package week3.day1;

public class CalculatorOverLoading {

	public void add() {
		// TODO Auto-generated method stub
		int i = 10;
		int j = 20;
		int sum = i + j;
		System.out.println("i + j is " + sum);

	}

	public void add(int i, int j) {
		int sum = i + j;
		System.out.println("Overloading method of i + J is " + sum);

	}

	public void multiply() {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 20;
		int multiplyValue = a * b;
		System.out.println("Multiply method returns " + multiplyValue);

	}

	public void multiply(int a, int b) {
		int multiply = a * b;
		System.out.println("The multiple method returns with arguments value " + multiply);

	}

	public static void main(String[] args) {

		CalculatorOverLoading cO = new CalculatorOverLoading();
		cO.add();
		cO.add(10, 30);// Overloading same method with arguments
		cO.multiply();
		cO.multiply(10, 30);// Overloading same method with arguments

		// TODO Auto-generated method stub

	}

}
