interface One{
	abstract void display();
}

class Two implements One{
	public void display(){
		System.out.println("Hello");
	}
	void output(){
		System.out.println("World");
	}
}

class Three implements One{
	public void display(){
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