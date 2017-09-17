interface One3{
	void display();
}

interface Two3 extends One3{
	void show();
}

// passing value to constructor

class Three3 implements Two3{
	private String a;
	Three3(String a){
		this.a=a;
	}
		
	public void display(){
		System.out.println("Hi" + a);
	}
	public void show(){
		System.out.println("Friend");
	}
}

class Test3{
	public static void main(String[] args){
		Three3 b=new Three3(args[0]);
		b.display();
		b.show();
	}
}