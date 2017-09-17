package college;
public class StudentMarks1{
	private int roll,sub1,sub2,sub3;
	private String name;
        private float TM,P;

	public StudentMarks1(String roll,String sub1,String sub2,String sub3,String name){
		this.roll=Integer.parseInt(roll);
		this.name=name;
		this.sub1=Integer.parseInt(sub1);
		this.sub2=Integer.parseInt(sub2);
		this.sub3=Integer.parseInt(sub3);
	}
	private	void calculate(){
		TM=sub1+sub2+sub3;
		P=TM/3;
	}
	public void display(){
		calculate();
		System.out.println("Roll-"+roll);
		System.out.println("Nmae-"+name);
		System.out.println("Total marks-"+TM);
		System.out.println("Percentage-"+P);
	}
}
