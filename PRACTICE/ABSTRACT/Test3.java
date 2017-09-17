abstract class One3{
	int a;
	void print(){
		a=5;
		System.out.println("a="+a);
	}
	abstract void display();
}

class Two3 extends One3{
	void display(){
		System.out.println("Hello");
	}
	void output(){
		System.out.println("World");
	}
}

class Three3 extends One3{
	void display(){
		System.out.println("Hi");
	}
	void show(){
		System.out.println("Friend");
	}
}

class Test3{
	public static void main(String[] args){
		Two3 a=new Two3();
		Three3 b=new Three3();
		a.print();
		a.display();
		a.output();
		b.print();
		b.display();
		b.show();
	}
}