class Name{
	public static void main(String[] args){
		String name=args[0];
		name.toLowerCase();
		char nm[]=new char[name.length()+1];
		name.getChars(0,name.length(),nm,0);
		nm[0]=(char)(nm[0]-32);
		String s=new String(nm);
		System.out.println("The name is:"+s);
	}
}
				