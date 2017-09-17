class One1{
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
	int getInt(){
		return a;
	}
        float getFloat(){
		return b;
	}
}
class SumOfTwoObj1{
public static void main(String[] args){
	One1 obj1=new One1();
	One1 obj2=new One1();
	obj1.assign();
	obj2.assign();
	int r =obj1.getInt()+obj2.getInt();
	float s=obj1.getFloat()+obj2.getFloat();
	System.out.println("Sum of integers-"+r);
	System.out.println("Sum of float-"+s);
	}
}