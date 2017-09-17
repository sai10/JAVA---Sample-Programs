class Student{
	private int roll;
	private String name;
	Address a=new Address();


	void assign(){
		roll=10;
		name="Ram Roy";
	}
	
	void out(){
		System.out.println("Roll-"+roll);
		System.out.println("Name-"+name);
	}
}

class Address{
	private int pin;
	private String city,state;

	void assign(){
		pin=768008;
		city="Delhi";
		state="Odisha";
	}

	void out(){
		System.out.println("Pin-"+pin);
		System.out.println("City-"+city);
		System.out.println("State-"+state);
	}
}

class Info{
	public static void main(String[] args){
		Student s=new Student();
		s.assign();
		s.a.assign();
		s.out();
		s.a.out();
	}
}