class StringExample4{
	public static void main(String[] args){
		String s1=new String("Hello");
		String s2=s1;
		String s3=new String("World");
		String s4=new String("Hi");
		String s5=s3;
		String s6=new String("Hello World");
		s4=s6;
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		System.out.println(s4);
		System.out.println(s5);
		System.out.println(s6);
	}
}