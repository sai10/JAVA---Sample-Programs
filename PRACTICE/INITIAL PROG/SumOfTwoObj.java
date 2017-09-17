class One{
	int a;
	float b;
	void assign(){
		a=5;
		b=6.0f;
	}
	void display(){
		System.out.println("Integer type is-"+a);
		System.out.println("Float type is-"+b);
	}
}
class SumOfTwoObj{
public static void main(String[] args){
	One obj1=new One();
	One obj2=new One();
	obj1.assign();
	obj2.assign();
	int r =obj1.a+obj2.a;
	float s=obj1.b+obj2.b;
	System.out.println("Sum of integers-"+r);
	System.out.println("Sum of float-"+s);
	}
}