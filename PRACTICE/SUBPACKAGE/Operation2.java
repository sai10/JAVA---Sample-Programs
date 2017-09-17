import arithmatic2.addsub2.Addition2;
import arithmatic2.addsub2.Subtraction2;
import arithmatic2.muldiv2.Multiplication2;
import arithmatic2.muldiv2.Division2;
import arithmatic2.Modulus2;

class Operation2{
	public static void main(String[] args){
		Addition2 a=new Addition2();
		Subtraction2 s=new Subtraction2();
		Multiplication2 m=new Multiplication2();
		Division2 d=new Division2();
		Modulus2 mo=new Modulus2();
		a.assign(args[0],args[1]);
		s.assign(args[0],args[1]);
		m.assign(args[0],args[1]);
		d.assign(args[0],args[1]);
		mo.assign(args[0],args[1]);
		a.display();
		s.display();
		m.display();
		d.display();
		mo.display();
	}
}