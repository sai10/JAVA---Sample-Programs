interface One1{
	void display();
}

interface Two1 {
	void show();
}

class Three1 implements One1,Two1{
	public void display(){
		System.out.println("Hi");
	}
	public void show(){
		System.out.println("Friend");
	}
}

class Test1{
	public static void main(String[] args){
		Three1 b=new Three1();
		b.display();
		b.show();
	}
}