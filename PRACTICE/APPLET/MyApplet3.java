//name of the file
import java.applet.Applet;
import java.awt.Button;
import java.awt.Graphics;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MyApplet3 extends Applet{
	Button b;
	public void init(){
	
		b=new Button("SUBMIT");
		add(b);
		b.addActionListener(new MyClass3());
	}
}
class MyClass3 implements ActionListener{
	public void actionPerformed(ActionEvent e){
		System.out.println("YOU CLICKED ME");
	}
}

/*<applet  code="MyApplet3.class"  width=400  height=400> </applet>*/