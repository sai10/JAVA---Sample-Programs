package college;
class AddressSuper1{
	private String city,state;
	private int pin;
	public void assign(String city,String state,String pin){
		this.city=city;
		this.state=state;
		this.pin=Integer.parseInt(pin);
	}
	public void display(){
		System.out.println("City-"+city);
		System.out.println("State-"+state);
		System.out.println("pin-"+pin);
	}
}

public class StudentSuper1 extends AddressSuper1{
	private int roll;
	private String name;
	public void assign(String roll,String name,String city,String state,String pin){
		this.roll=Integer.parseInt(roll);
 		this.name=name;
		super.assign(city,state,pin);
	}
	public void display(){
		System.out.println("roll-"+roll);
		System.out.println("name-"+name);
		super.display();
	}
}
