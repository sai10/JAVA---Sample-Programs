abstract class One1{
	abstract void display();
}

abstract class Two1 extends One1{

	abstract void output();
}

class Three1 extends Two1{
	void display(){
		System.out.println("Hi");
	}
	void output(){
		System.out.println("Friend");
	}
}

class Test1{
	public static void main(String[] args){
		Three1 b=new Three1();
		b.display();
		b.output();
		
		
	}
}