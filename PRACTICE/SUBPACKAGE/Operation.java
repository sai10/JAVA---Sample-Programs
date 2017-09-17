import arithmatic.addsub.Addition;
import arithmatic.addsub.Subtraction;
import arithmatic.muldiv.Multiplication;
import arithmatic.muldiv.Division;
import arithmatic.Modulus;

class Operation{
	public static void main(String[] args){
		Addition a=new Addition();
		Subtraction s=new Subtraction();
		Multiplication m=new Multiplication();
		Division d=new Division();
		Modulus mo=new Modulus();
		a.assign();
		s.assign();
		m.assign();
		d.assign();
		mo.assign();
		a.display();
		s.display();
		m.display();
		d.display();
		mo.display();
	}
}