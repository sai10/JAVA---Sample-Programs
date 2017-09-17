package college;
public class Address1{
	private String city,state;
	private int pin;
	public void assign1(String city,String state,String pin){
		this.city=city;
		this.state=state;
		this.pin=Integer.parseInt(pin);
	}
	public void display1(){
		System.out.println("City-"+city);
		System.out.println("State-"+state);
		System.out.println("pin-"+pin);
	}
}