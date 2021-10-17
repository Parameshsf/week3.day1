package week3.day1;

public class Student extends Department {
	
	public void studentName() {
		// TODO Auto-generated method stub
		System.out.println("Student Name method called");

	}
	
	public void studentDept() {
		// TODO Auto-generated method stub
		System.out.println("Student Deppartment called");

	} 
	
	public void studentID() {
		// TODO Auto-generated method stub
		System.out.println("Student ID method called");
	
	}
	
	public void getStudentInfo(String id) {
		// TODO Auto-generated method stub
		System.out.println("Method getStudentInfo has been called "+ id);

	}
	
	public void getStudentInfo(String id, String name) {
		System.out.println("The Student ID is "+id+" The Name is "+name);
	}
	
	public void getStudentInfo(String email, int phoneNumber){
		System.out.println("Email is "+email+" Phone Number is "+phoneNumber);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student obj = new Student();
		obj.studentDept(); //method from same class has been called
		obj.departmentName();//method from Department class has been called using student class object
		obj.collegeName();//method from College class has been called using student class object
		obj.getStudentInfo("E1001");
		obj.getStudentInfo("E1004", "Paramesh");
		obj.getStudentInfo("Parameshsf@gmail.com", 99);

	}

}
