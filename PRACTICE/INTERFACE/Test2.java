interface One2{
	void display();
}

interface Two2 extends One2{
	void show();
}

class Three2 implements Two2{
	public void display(){
		System.out.println("Hi");
	}
	public void show(){
		System.out.println("Friend");
	}
}

class Test2{
	public static void main(String[] args){
		Three2 b=new Three2(args[0]);
		b.display();
		b.show();
	}
}