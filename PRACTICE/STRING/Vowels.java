class Vowels{
	public static void main(String[] args){
		String name=args[0];
		int i=0,c=0;
		for(i=0;i<name.length();i++)
		{
			switch (name.charAt(i)){
				case 'a':case 'A':
				case 'e':case 'E':
				case 'i':case 'I':
				case 'o':case 'O':
				case 'u':case 'U':
					c++;
			}
		}
		System.out.println("Number of vowels in name are:"+c);
	}
}
				