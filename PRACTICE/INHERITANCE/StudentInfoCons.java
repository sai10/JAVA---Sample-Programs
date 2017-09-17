class AddressCons{
	private String city,state;
	private int pin;
	AddressCons(){
		city="sambalpur";
		state="odisha";
		pin=768004;
	}
	void display1(){
		System.out.println("City-"+city);
		System.out.println("State-"+state);
		System.out.println("pin-"+pin);
	}
}

class StudentCons extends AddressCons{
	private int roll;
	private String name;
	StudentCons(){
		roll=10;
 		name="Priyankit Acharya";
	}
	void display(){
		System.out.println("roll-"+roll);
		System.out.println("name-"+name);
	}
}
class StudentInfoCons{
	public static void main(String[] args){
		StudentCons s=new StudentCons();
		s.display();
		s.display1();
	}
}
