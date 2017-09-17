import arithmatic1.addsub1.Addition1;
import arithmatic1.addsub1.Subtraction1;
import arithmatic1.muldiv1.Multiplication1;
import arithmatic1.muldiv1.Division1;
import arithmatic1.Modulus1;

class Operation1{
	public static void main(String[] args){
		Addition1 a=new Addition1();
		Subtraction1 s=new Subtraction1();
		Multiplication1 m=new Multiplication1();
		Division1 d=new Division1();
		Modulus1 mo=new Modulus1();
		a.assign(5,6);
		s.assign(5,6);
		m.assign(5,6);
		d.assign(5,6);
		mo.assign(5,6);
		a.display();
		s.display();
		m.display();
		d.display();
		mo.display();
	}
}