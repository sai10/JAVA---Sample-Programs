import java.io.*;
class AddressSuper{
	private String city,state;
	private int pin;
	void assign()throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the city:");
		city=br.readLine();
		System.out.println("Enter the state:");
		state=br.readLine();
		System.out.println("Enter the pin:");
		pin=Integer.parseInt(br.readLine());
	}
	void display(){
		System.out.println("City-"+city);
		System.out.println("State-"+state);
		System.out.println("pin-"+pin);
	}
}

class StudentSuper extends AddressSuper{
	private int roll;
	private String name;
	void assign()throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the roll:");
		roll=Integer.parseInt(br.readLine());
		System.out.println("Enter the name:"); 
		name=br.readLine();
		super.assign();
	}
	void display(){
		System.out.println("roll-"+roll);
		System.out.println("name-"+name);
		super.display();
	}
}
class StudentInfoSuper{
	public static void main(String[] args)throws IOException{
		StudentSuper s=new StudentSuper();
		s.assign();
		s.display();
	}
}
