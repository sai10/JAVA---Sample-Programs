class Student5{
	private int roll;
	private String name;
	void assign(int rl,String nm){
		roll=rl;
		name=nm;
	}
	void display(){
		System.out.println("Roll-"+roll);
		System.out.println("Nmae-"+name);
	}
}

class StudentInfo{
	public static void main(String[] args){
		Student5 s=new Student5();
		s.assign(10,"Ram");
		s.display();
	}
}