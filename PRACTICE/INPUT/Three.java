import java.io.*;
class Three{
	public static void main(String[] args)throws IOException{
		Two ob=new Two();
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.print("Enter the Name:");
		String name=br.readLine();
		ob.input(name);
		ob.output();
	}
}