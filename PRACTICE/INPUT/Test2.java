import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Test2{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter a Character:");
		char n=(char)(br.read());
		br.skip(2);
		System.out.println("Enter the name:");
		String name=br.readLine();
		System.out.println("Character is:"+n);
		System.out.println("The name is:"+name);
	}
}