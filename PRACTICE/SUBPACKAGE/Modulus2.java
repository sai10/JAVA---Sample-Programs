package arithmatic2;
public class Modulus2{
	private int a,b;
	public void assign(String a,String b){
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
	}
	public void display(){
		System.out.println("Modulus is-"+(a%b));
	}
}