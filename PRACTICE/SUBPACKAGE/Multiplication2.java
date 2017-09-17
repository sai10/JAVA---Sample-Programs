package arithmatic2.muldiv2;
public class Multiplication2{
	private int a,b;
	public void assign(String a,String b){
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
	}
	public void display(){
		System.out.println("Multiplication is-"+(a*b));
	}
}