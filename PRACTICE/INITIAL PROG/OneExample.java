class One{
	private int a;
	private float b;
	One(){
		a=10;
		b=2.7f;
	}
        One calculate(One ob1,One ob2){
		One ob=new One();
		ob.a=ob1.a+ob2.a;
		ob.b=ob1.b+ob2.b;
		return ob;
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
	obj3=obj3.calculate(obj1,obj2);
	obj3.display();
	}
}