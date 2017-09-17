abstract class One{
	int a;
	abstract void display();
}

class Two extends One{
	void display(){
		System.out.println("Hello");
	}
	void output(){
		System.out.println("World");
	}
}

class Three extends One{
	void display(){
		System.out.println("Hi");
	}
	void show(){
		System.out.println("Friend");
	}
}

class Test{
	public static void main(String[] args){
		Two a=new Two();
		Three b=new Three();
		
		a.display();
		a.output();
		b.display();
		b.show();
	}
}