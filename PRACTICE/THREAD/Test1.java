class one1 implements Runnable{
	public void run(){
		System.out.println("Hello world");
	}
}

class two1 implements Runnable{
	public void run(){
		System.out.println("Hello India");
	}
}

class three1 implements Runnable{
	public void run(){
		System.out.println("Hello Odisha");
	}
}

class Test1{
	public static void main(String[] args){
		one1 a =new one1();
		two1 b = new two1();
		three1 c = new three1();
		a.start();
		b.start();
		c.start();
	}
}