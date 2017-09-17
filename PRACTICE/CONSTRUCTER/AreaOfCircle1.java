class Area1{
	private float area,r,pi;
	
	Area1(float r){
		
		this.r= r;
		
	}
	
	Area1(){	
		this(5f);
		pi=3.14f;
	}
	
	private void calculate(){
		area=pi*r*r;
	}
	void display(){
		calculate();
		System.out.println("Area Of the circle-"+area);
	}
}

class AreaOfCircle1{
	public static void main(String[] args){
		Area1 a=new Area1();
		a.display();
	}
}