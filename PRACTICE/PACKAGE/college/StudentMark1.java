package college;
public class StudentMark1{
	private int roll;
	private float sub1,sub2,sub3,TM,P;
	private String name;
	public void assign(String roll,String name,String sub1,String sub2,String sub3){
		this.roll=Integer.parseInt(roll);
		this.name=name;
		this.sub1=Float.parseFloat(sub1);
		this.sub2=Float.parseFloat(sub2);
		this.sub3=Float.parseFloat(sub3);
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