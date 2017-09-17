class One{
	int a;
	float b;
	One(){
		a=10;
		b=2.7f;
	}
	void display(){
		System.out.println("Integer type is-"+a);
		System.out.println("Float type is-"+b);
	}
}
class OneExample{
public static void main(String[] args){
	One obj1=new One();
	One obj2=new One();
	One obj3=new One();
	obj3.a=obj1.a+obj2.a;
	obj3.b=obj1.b+obj2.b;
	System.out.println("Sum of integers-"+obj3.a);
	System.out.println("Sum of float-"+obj3.b);
	}
}