class Split{
	public static void main(String[] args){
		int i;
		String name="Ram,is,a,good,boy";
		String nm[];
		nm=name.split(",");
		for(i=0;i<nm.length;i++)
			System.out.println(nm[i]);
	}
}
				