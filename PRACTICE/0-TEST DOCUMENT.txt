class Info{
	void display(){
		System.out.println("Program testing");
	}
}
class AddressSuper1{
	private String city,state;
	private int pin;
	void assign(String city,String state,String pin){
		this.city=city;
		this.state=state;
		this.pin=Integer.parseInt(pin);
	}
	void display(){
		System.out.println("City-"+city);
		System.out.println("State-"+state);
		System.out.println("pin-"+pin);
	}
}

class StudentSuper1 extends AddressSuper1,Info{
	private int roll;
	private String name;
	void assign(String roll,String name,String city,String state,String pin){
		this.roll=Integer.parseInt(roll);
 		this.name=name;
		super.assign(city,state,pin);
	}
	void display(){
		System.out.println("roll-"+roll);
		System.out.println("name-"+name);
		super.display();
	}
}
class StudentInfoSuper1{
	public static void main(String[] args){
		StudentSuper1 s=new StudentSuper1();
		s.assign(args[0],args[1],args[2],args[3],args[4]);
		s.display();
	}
}
