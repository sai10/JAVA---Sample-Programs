class One2{
	private int a;
	private float b;
	void assign(){
		a=5;
		b=6.0f;
	}
	void display(){
		System.out.println("Integer type is-"+a);
		System.out.println("Float type is-"+b);
	}
	void calculate(One2 ob1,One2 ob2){
		a=ob1.a+ob2.a;
		b=ob1.b+ob2.b;
	} 
	int getInt(){
		return a;
	}
        float getFloat(){
		return b;
	}
}
class SumOfTwoObj2{
public static void main(String[] args){
	One2 obj1=new One2();
	One2 obj2=new One2();
  	One2 obj3=new One2();	
	obj1.assign();
	obj2.assign();
	obj3.calculate(obj1,obj2);
	System.out.println("Sum of integers-"+obj3.getInt());
	System.out.println("Sum of float-"+obj3.getFloat());
	}
}