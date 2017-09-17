class StudentB{
	private int roll;
	private String name;
	Address1 a=new Address1(234567,"Delhi","Haryana");
	StudentB(int roll,String name){
		this.roll=roll;
		this.name=name;
	}

	void display(){
		System.out.println("Roll-"+roll);
		System.out.println("Name-"+name);
		a.display();
	}
}

class Address1{
	int pin;
	String city,state;
	
	Address1(int pin,String city,String state){
		this.pin=pin;
		this.city=city;
		this.state=state;
        }
	void display(){
		System.out.println("Pin-"+pin);
		System.out.println("City-"+city);
		System.out.println("State-"+state);
		
	}

}
				
		
class StudentAddress1{
	public static void main(String[] args){
		StudentB s=new StudentB(10,"Ram Roy");
		s.display();
	}
}