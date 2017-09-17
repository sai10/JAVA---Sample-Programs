
import college.Address1;
import college.Student1;
class StudentAddressExample1{
	public static void main(String[] args){
		Student1 s=new Student1();
		Address1 a=new Address1();
		s.assign(args[0],args[1]);
		a.assign1(args[2],args[3],args[4]);
		a.display1();
		s.display();
	}
}