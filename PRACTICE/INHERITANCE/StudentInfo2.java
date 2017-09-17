class Address2{
	private String city,state;
	private int pin;
	void assign1(String city,String state,String pin){
		this.city=city;
		this.state=state;
		this.pin=Integer.parseInt(pin);
	}
	void display1(){
		System.out.println("City-"+city);
		System.out.println("State-"+state);
		System.out.println("pin-"+pin);
	}
}

class Student2 extends Address2{
	private int roll;
	private String name;
	void assign(String roll,String name){
		this.roll=Integer.parseInt(roll);
 		this.name=name;
	}
	void display(){
		System.out.println("roll-"+roll);
		System.out.println("name-"+name);
	}
}
class StudentInfo2{
	public static void main(String[] args){
		Student2 s=new Student2();
		s.assign(args[0],args[1]);
		s.assign1(args[2],args[3],args[4]);
		s.display();
		s.display1();
	}
} 