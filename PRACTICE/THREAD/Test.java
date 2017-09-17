class one extends Thread{
	public void run(){
		System.out.println("Hello world");
	}
}

class two extends Thread{
	public void run(){
		System.out.println("Hello India");
	}
}

class three extends Thread{
	public void run(){
		System.out.println("Hello Odisha");
	}
}

class Test{
	public static void main(String[] args){
		one a =new one();
		two b = new two();
		three c = new three();
		a.start();
		b.start();
		c.start();
	}
}