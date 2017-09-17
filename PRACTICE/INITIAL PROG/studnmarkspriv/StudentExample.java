class Student{
	private int roll,sub1,sub2,sub3;
	private String name;
	private float TM,P;
	void assign(){
		roll=10;
		name="Ram";
		sub1=50;
		sub2=70;
		sub3=90;
	}
	private void calculate(){
		TM=sub1+sub2+sub3;
		P=TM/3;
	}
	void out(){
		calculate();
		System.out.println("Roll-"+roll);
		System.out.println("Nmae-"+name);
		System.out.println("Total Marks-"+TM);
		System.out.println("Percentage-"+P);
	}
}
class StudentExample{
	public static void main(String[] args){
		Student s=new Student();
		s.assign();
		s.out();
	}
}
