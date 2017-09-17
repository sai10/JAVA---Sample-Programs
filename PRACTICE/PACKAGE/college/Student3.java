package college;
class Address2{
	private int pin;
	private String city,state;
	Address2(String city,String state,String pin){
		this.city=city;
		this.state=state;
		this.pin=Integer.parseInt(pin);
	}
	void display(){
		System.out.println("City-"+city);
		System.out.println("State-"+state);
		System.out.println("PIN-"+pin);
	}
}

public class Student3 extends Address2{
		private int roll;
		private String name;
		public Student3(String roll,String name,String city,String state,String pin){
			super(city,state,pin);
			this.roll=Integer.parseInt(roll);
			this.name=name;
		}
		public void display(){
			System.out.println("roll-"+roll);
			System.out.println("Name-"+name);
			super.display();
		}		
}