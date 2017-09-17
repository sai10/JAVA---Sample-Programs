class Student6{
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

class StudentInfo2{
	public static void main(String[] args){
		Student6 s=new Student6();
		s.assign("10","Ram");
		s.display();
	}
}
