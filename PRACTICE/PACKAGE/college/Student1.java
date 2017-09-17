package college;
public class Student1{
	private int roll;
	private String name;
	public void assign(String roll,String name){
		this.roll=Integer.parseInt(roll);
 		this.name=name;
	}
	public void display(){
		System.out.println("roll-"+roll);
		System.out.println("name-"+name);
	}
} 