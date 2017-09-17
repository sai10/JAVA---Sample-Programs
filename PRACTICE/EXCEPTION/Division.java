class Division{
	public static void main(String[] args){
		int a=Integer.parseInt(args[0]);
		int b=Integer.parseInt(args[1]);
		int s=0;
		try{
			s=a/b;
			System.out.println(s);
		}
		
		catch(ArithmeticException e){
			System.out.println("Division by zero is not possible");
		}
	}
}
		