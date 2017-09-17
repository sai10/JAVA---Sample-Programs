class One1{
	private int a;
	private float b;
	One1(){}
	One1(int a,float b){
		this.a=a;
		this.b=b;
	}
        One1 calculate(One1 ob1,One1 ob2){
		One1 ob=new One1();
		ob.a=ob1.a+ob2.a;
		ob.b=ob1.b+ob2.b;
		return ob;
	}
	void display(){
		System.out.println("Integer type is-"+a);
		System.out.println("Float type is-"+b);
	}
}
class OneExample1{
public static void main(String[] args){
	One1 obj1=new One1(2,3.7f);
	One1 obj2=new One1(4,7.4f);
	One1 obj3=new One1();
	System.out.println("Values Of object 1 are-");
	obj1.display();
	System.out.println();
	System.out.println("Values Of object 2 are-");
	obj2.display();
	System.out.println();
	obj3=obj3.calculate(obj1,obj2);
	System.out.println("After summation the values are-");
	obj3.display();
	}
}