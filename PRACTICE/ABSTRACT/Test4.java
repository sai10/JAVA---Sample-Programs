abstract class One4{
	int a;
	void print(){
		a=5;
		System.out.println("a="+a);
	}
	abstract void display();
}

class Two4 extends One4{
	void display(){
		System.out.println("Hello");
	}
	void output(){
		System.out.println("World");
	}
	void print(){
		a=5;
		System.out.println("class two...a="+a);
	}
}

class Three4 extends One4{
	void display(){
		System.out.println("Hi");
	}
	void show(){
		System.out.println("Friend");
	}
	void print(){
		a=6;
		System.out.println("class three...a="+a);
	}
}

class Test4{
	public static void main(String[] args){
		Two4 a=new Two4();
		Three4 b=new Three4();
		a.print();
		a.display();
		a.output();
		b.print();
		b.display();
		b.show();
	}
}