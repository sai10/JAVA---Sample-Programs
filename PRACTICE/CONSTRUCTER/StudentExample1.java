class Student1{
	private int roll;
	private String name;

	Student1(){
		roll=10;
		name="Ram";
	}

	void display(){
		System.out.println("Roll-"+roll);
		System.out.println("Name-"+name);
	}
}
class StudentExample1{
	public static void main(String[] args){
		Student1 s=new Student1();
		s.display();
	}
}