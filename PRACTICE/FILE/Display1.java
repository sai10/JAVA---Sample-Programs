import java.io.*;

class Display1{
	public static void main(String[] args) throws IOException{
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fos = new FileOutputStream("Sample1.txt");
		BufferedOutputStream b= new BufferedOutputStream(fos);
		char ch=(char)dis.read();
		b.write(ch);
		b.close();
		fos.close();	
	}
} 