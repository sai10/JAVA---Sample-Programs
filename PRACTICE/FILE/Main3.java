import java.io.*;

class Display3 implements Serializable{

	private String roll;
	private String name;

	void input() throws IOException{
		BufferedReader b=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the roll Number:");
		roll=b.readLine();
		System.out.println("Enter the name:");
		name=b.readLine();
	}

	void output(){
		System.out.println("The Roll number is:"+roll);
		System.out.println("The Name is:"+name);
	}

} 
class Main3{

	public static void main(String[] args) throws IOException{

		Display3 d = new Display3();
		ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream("Sample3.txt"));
		d.input();
		oos.writeObject(d);
		oos.close();

	}
}