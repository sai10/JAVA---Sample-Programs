class Student8{
	private int roll;
	private String name;

	void assign(String roll,String name){
		this.roll=Integer.parseInt(roll);
		this.name=name;
	}
	void display(){
		System.out.println("Roll-"+roll);
		System.out.println("Name-"+name);
	}
}

class StudentInfo4{
	public static void main(String[] args){
		Student8 s=new Student8();
		s.assign("10","Ram Roy");
		s.display();
	}
}
