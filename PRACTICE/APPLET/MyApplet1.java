import java.applet.*;
import java.awt.*;
public class MyApplet1 extends Applet{
	public void init(){
		setBackground(Color.yellow);	
	}
	public void paint(Graphics g){
		g.drawString("Hello India",100,100);
	}
}

/*<applet code="MyApplet1.class" width=400 height=400></applet>*/
	