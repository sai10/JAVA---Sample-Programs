class AddressCons1{
	private String city,state;
	private int pin;
	AddressCons1(String city,String state,String pin){
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

class StudentCons1 extends AddressCons1{
	private int roll;
	private String name;
	StudentCons1(String roll,String name,String city,String state,String pin){
        super(city,state,pin);
		this.roll=Integer.parseInt(roll);
 		this.name="Priyankit Acharya";
	}
	void display(){
		System.out.println("roll-"+roll);
		System.out.println("name-"+name);
	}
}
class StudentInfoCons1{
	public static void main(String[] args){
		StudentCons1 s=new StudentCons1(args[0],args[1],args[2],args[3],args[4]);
		s.display();
		s.display1();
	}
}
