class Address{
	private String city,state;
	private int pin;
	void assign1(){
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

class Student extends Address{
	private int roll;
	private String name;
	void assign(){
		roll=10;
 		name="Priyankit Acharya";
	}
	void display(){
		System.out.println("roll-"+roll);
		System.out.println("name-"+name);
	}
}
class StudentInfo{
	public static void main(String[] args){
		Student s=new Student();
		s.assign();
		s.assign1();
		s.display();
		s.display1();
	}
} 