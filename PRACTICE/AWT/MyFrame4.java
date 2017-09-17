import java.awt.*;
import java.awt.event.*;

class MyFrame4{
	public static void main(String[] args){
		Frame f=new Frame("MyFrame1");
		f.setVisible(true);
		f.setSize(400,400);
		f.addWindowListener(new MyClass4());
	}
}
class MyClass4 extends  WindowAdapter{
	
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
	
}