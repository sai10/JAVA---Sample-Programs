class Astudent2{
	private int roll;
	private String name;
	void assign(){
		roll=10;
		name="Ram";
	}
	void out(){
		System.out.println("Roll-"+roll);
		System.out.println("Name-"+name);
	}
}

class StudentMultiClass2{
	public static void main(String args[]){
		Astudent2 s= new Astudent2();
		s.assign();
		s.out();
	}
}
