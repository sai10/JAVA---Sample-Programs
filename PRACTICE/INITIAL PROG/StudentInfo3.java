class Student7{
	private int roll;
	private String name;
	void assign(String rl,String nm){
		roll=Integer.parseInt(rl);
		name=nm;
	}
	void display(){
		System.out.println("Roll-"+roll);
		System.out.println("Nmae-"+name);
	}
}

class StudentInfo3{
	public static void main(String[] args){
		Student7 s=new Student7();
		s.assign(args[0],args[1]);
		s.display();
	}
}
