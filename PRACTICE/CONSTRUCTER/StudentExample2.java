class Student2{
	private int roll;
	private String name;

	Student2(String roll,String name){
		this.roll=Integer.parseInt(roll);
		this.name=name;
	}

	void display(){
		System.out.println("Roll-"+roll);
		System.out.println("Name-"+name);
	}
}
class StudentExample2{
	public static void main(String[] args){
		Student2 s=new Student2(args[0],args[1]);
		s.display();
	}
}