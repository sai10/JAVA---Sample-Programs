class Address3{
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

class Student3 extends Address3{
	private int roll;
	private String name;
	void assign(String roll,String name,String city,String state,String pin){
		this.roll=Integer.parseInt(roll);
 		this.name=name;
		assign1(city,state,pin);
	}
	void display(){
		System.out.println("roll-"+roll);
		System.out.println("name-"+name);
		display1();
	}
}
class StudentInfo3{
	public static void main(String[] args){
		Student3 s=new Student3();
		s.assign(args[0],args[1],args[2],args[3],args[4]);
		s.display();
	}
}
