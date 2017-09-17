class One{
	private int a;
	private float b;
	void assign(){
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
		System.out.println("Integer value-"+a);
		System.out.println("Float value-"+b);
	}
}
class OneExample{
	public static void main(String[] args){
		One obj1=new One();
		One obj2=new One();
		One obj3=new One();
		obj1.assign();
		obj2.assign();
		System.out.println("values of obj1 are:");
		obj1.display();
		System.out.println("values of obj2 are:");
		obj2.display();
		obj3=obj3.calculate(obj1,obj2);
	        obj3.display();
	}
}	