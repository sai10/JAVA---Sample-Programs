import java.awt.*;
import java.awt.event.*;

class MyFrame3{
	public static void main(String[] args){
		Frame f=new Frame("MyFrame1");
		f.setVisible(true);
		f.setSize(400,400);
		f.addWindowListener(new MyClass3());
	}
}
class MyClass3 implements WindowListener{
	public void windowActivated(WindowEvent e){}
	public void windowClosed(WindowEvent e){}
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
	public void windowDeactivated(WindowEvent e){}
	public void windowDeiconified(WindowEvent e){}
	public void windowIconified(WindowEvent e){}
	public void windowOpened(WindowEvent e){}
}