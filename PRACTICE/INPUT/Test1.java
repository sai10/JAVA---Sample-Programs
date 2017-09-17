import java.io.*;

abstract class One1{
	String a;
	void print(String nm){
		a=nm;
		System.out.println("a="+a);
	}
	abstract void display();
}

class Two1 extends One1{
	public void display(){
		System.out.println("Hello");
	}
	void output(){
		System.out.println("World");
	}
}

class Three1 extends One1{
	public void display(){
		System.out.println("Hi");
	}
	void show(){
		System.out.println("Friend");
	}
}

class Test1{
	public static void main(String[] args)throws IOException{
		Two1 a=new Two1();
		Three1 b=new Three1();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("ENTER THE NAME:");
		String name=br.readLine();
		a.print(name);
		a.display();
		a.output();
		System.out.println("ENTER THE NAME:");
		String nam=br.readLine();
		b.print(nam);
		b.display();
		b.show();
	}
}