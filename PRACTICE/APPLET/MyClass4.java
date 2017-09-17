
import java.applet.Applet;

import java.awt.*;

public class MyClass4 extends Applet{

	public void init(){
		System.out.println("INIT");
		
	}

	public void start(){
		System.out.println("START");
	}

	public void stop(){
		System.out.println("STOP");
	}

	public void destroy(){
		System.out.println("DESTROY");
	}
	public void paint(Graphics g){
		System.out.println("PAINT");
		g.drawString("Hey Priyankit",100,100);
	}
}

/*<applet  code="MyClass4.class"  width=400  height=400> </applet>*/