import java.io.*;
class Test4{
	public static void main(String[] args)throws IOException{
		DataInputStream d = new DataInputStream(System.in);
		char name=(char)d.read();
		System.out.println("The name is:"+name);
	}
}