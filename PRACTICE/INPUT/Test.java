import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Test{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name:");
		String name=br.readLine();
		System.out.println("The name is:"+name);
	}
}