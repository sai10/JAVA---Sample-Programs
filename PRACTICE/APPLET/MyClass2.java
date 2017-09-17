
import java.applet.Applet;

import java.awt.*;

public class MyClass2 extends Applet{

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
}

/*<applet  code="MyClass2.class"  width=400  height=400> </applet>*/