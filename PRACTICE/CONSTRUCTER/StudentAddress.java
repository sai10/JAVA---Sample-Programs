class StudentA{
	private int roll;
	private String name;

	StudentA(int roll,String name){
		this.roll=roll;
		this.name=name;
	}

	void display(){
		System.out.println("Roll-"+roll);
		System.out.println("Name-"+name);
	}
}

class Address{
	int pin;
	String city,state;
	Address(int pin,String city,String state){
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
				
		
class StudentAddress{
	public static void main(String[] args){
		StudentA s=new StudentA(10,"Ram Roy");
                Address a=new Address(234567,"Delhi","Haryana");
		s.display();
                a.display();
	}
}