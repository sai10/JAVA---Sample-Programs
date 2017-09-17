import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class Name{
	public static void main(String[] args)throws IOException{
		BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter the name:");
		String name=br.readLine();
		name=name.toLowerCase();
		char nm[]=new char[name.length()+1];
		name.getChars(0,name.length(),nm,0);
		nm[0]=(char)(nm[0]-32);
		String nam=new String(nm);
		System.out.println("The name is:"+nam);
	}
}