class DivideString{

	static String[] breakString(String message){
		
		String[] msgArr = new String[(int)Math.ceil((float)msg.length()/256)];
		
		for(int i=0 ; i<msgArr.length ; i++){
			msgArr[i] = msg.substring(i*256,(i+1)*256-1);
			if(i == msgArr.length-1)
				msgArr[i] = msg.substring(i*256,(i+1)*256,msg.length());
		}
		return msgArr;
	}



	public static void main(String[] args){
		String msg = new String();
		for(int i=0;i<300;i++)
			msg += "a"; 
		String[] msgArr = breakString(msg);
		for(int i = 0;i<msgArr.length;i++)
			System.out.println(msgArr[i]);
	}

}
