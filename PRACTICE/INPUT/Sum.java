import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Sum{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter number1:");
		int n1=Integer.parseInt(br.readLine());
		System.out.print("Enter number2:");
		int n2=Integer.parseInt(br.readLine());
		int s=n1+n2;
		System.out.println("Sum is:"+s);
	}
}