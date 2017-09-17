class Student{
	private int roll;
	private String name;
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
		Address a=new Address();
		Student s=new Student();
		s.assign();
		a.assign();
		s.out();
		a.out();
	}
}