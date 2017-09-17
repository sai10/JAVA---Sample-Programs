interface One4{
	
}



class Three4 implements One4{
	
		
	public void display(){
		System.out.println("Hi");
	}
	public void show(){
		System.out.println("Friend");
	}
}

class Test4{
	public static void main(String[] args){
		Three4 b=new Three4();
		b.display();
		b.show();
	}
}