class Area{
	private float area,r,pi;
	Area(){	
		pi=3.14f;
	}
	Area(String r){
		this();
		this.r=Float.parseFloat(r);
		
	}
	private void calculate(){
		area=pi*r*r;
	}
	void display(){
		calculate();
		System.out.println("Area Of the circle-"+area);
	}
}

class AreaOfCircle{
	public static void main(String[] args){
		Area a=new Area(args[0]);
		a.display();
	}
}