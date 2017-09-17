package college;
public class StudentMark{
	private int roll;
	private float sub1,sub2,sub3,TM,P;
	private String name;
	public void assign(){
		roll=10;
		name="Ram";
		sub1=50.0f;
		sub2=70.0f;
		sub3=91.0f;
	}
	private void calculate(){
		TM=sub1+sub2+sub3;
		P=TM/3;
	}
	public void display(){
		calculate();
		System.out.println("Roll-"+roll);
		System.out.println("Name-"+name);
		System.out.println("Total marks-"+TM);
		System.out.println("Percentage-"+P);
	}
}