class StudentMarks{
	private int roll,sub1,sub2,sub3;
	private String name;
        private float TM,P;

	StudentMarks(int roll,int sub1,int sub2,int sub3,String name){
		this.roll=roll;
		this.name=name;
		this.sub1=sub1;
		this.sub2=sub2;
		this.sub3=sub3;
	}
	private	void calculate(){
		TM=sub1+sub2+sub3;
		P=TM/3;
	}
	void display(){
		calculate();
		System.out.println("Roll-"+roll);
		System.out.println("Nmae-"+name);
		System.out.println("Total marks-"+TM);
		System.out.println("Percentage-"+P);
	}
}
class StudentExampleMarks{
	public static void main(String[] args){
		StudentMarks s=new StudentMarks(10,50,70,90,"Ram Roy");
		s.display();
	}
}