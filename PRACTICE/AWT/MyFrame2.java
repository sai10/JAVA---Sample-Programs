import java.awt.Frame;

class MyFrame2 extends Frame{
	MyFrame2(){}
	MyFrame2(String name){
		super(name);
	}
	public static void main(String[] args){
		MyFrame2 f=new MyFrame2("MyFrame1");
		f.setVisible(true);
		f.setSize(400,400);
	}
}