import java.applet.*;
import java.awt.*;
public class MyApplet extends Applet{
	public void init(){
		setBackground(Color.yellow);	
	}
	public void paint(Graphics g){
		g.drawString("Hello India",100,100);
	}
}
	