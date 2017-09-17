import java.io.*;

class Display2{
	public static void main(String[] args) throws IOException{
		DataInputStream dis = new DataInputStream(System.in);
		FileOutputStream fos = new FileOutputStream("Sample2.txt");
		BufferedOutputStream b= new BufferedOutputStream(fos);
		char ch;
		while(true){
			ch=(char)dis.read();
			if(ch!='\n')
				b.write(ch);
			else
				break;
		}
		b.close();
		fos.close();	
	}
} 