class AddressSuper{
	private String city,state;
	private int pin;
	void assign(){
		city="sambalpur";
		state="odisha";
		pin=768004;
	}
	void display(){
		System.out.println("City-"+city);
		System.out.println("State-"+state);
		System.out.println("pin-"+pin);
	}
}

class StudentSuper extends AddressSuper{
	private int roll;
	private String name;
	void assign(){
		roll=10;
 		name="Priyankit Acharya";
		super.assign();
	}
	void display(){
		System.out.println("roll-"+roll);
		System.out.println("name-"+name);
		super.display();
	}
}
class StudentInfoSuper{
	public static void main(String[] args){
		StudentSuper s=new StudentSuper();
		s.assign();
		s.display();
	}
} 