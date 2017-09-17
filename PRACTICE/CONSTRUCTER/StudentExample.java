class Student{
	private int roll,sub1,sub2,sub3;
	private String name;

	Student(int roll,String name){
		this.roll=roll;
		this.name=name;
	}

	void display(){
		System.out.println("Roll-"+roll);
		System.out.println("Nmae-"+name);
	}
}
class StudentExample{
	public static void main(String[] args){
		Student s=new Student(10,"Ram roy");
		s.display();
	}
}