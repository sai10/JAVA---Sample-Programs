package arithmatic2.addsub2;
public class Addition2{
	private int a,b;
	public void assign(String a,String b){
		this.a=Integer.parseInt(a);
		this.b=Integer.parseInt(b);
	}
	public void display(){
		System.out.println("Sum is-"+(a+b));
	}
}