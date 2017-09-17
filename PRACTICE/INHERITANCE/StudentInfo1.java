class Address1{
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

class Student1 extends Address1{
	private int roll;
	private String name;
	void assign(){
		roll=10;
 		name="Priyankit Acharya";
		assign1();
	}
	void display(){
		System.out.println("roll-"+roll);
		System.out.println("name-"+name);
		display1();
	}
}
class StudentInfo1{
	public static void main(String[] args){
		Student1 s=new Student1();
		s.assign();
		s.display();
	}
} 