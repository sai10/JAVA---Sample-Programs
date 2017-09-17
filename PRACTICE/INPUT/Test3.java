import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Test3{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Character:");
		char n=br.readLine().charAt(0);
		System.out.println("Enter the name:");
		String name=br.readLine();
		System.out.println("Character is:"+n);
		System.out.println("The name is:"+name);
	}
}