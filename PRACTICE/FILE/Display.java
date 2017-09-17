import java.io.*;

class Display{
	public static void main(String[] args) throws IOException{
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fos = new FileOutputStream("Sample.txt");
		
		char ch=(char)dis.read();
		fos.write(ch);
		fos.close();
	}
} 