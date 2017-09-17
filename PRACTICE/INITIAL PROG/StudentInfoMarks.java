 class Student9{
    private int roll,sub1,sub2,sub3;
    private float total_marks,percentage;
    private String name;

    void assign(String roll,String name,String sub1,String sub2,String sub3){
        this.roll=Integer.parseInt(roll);
        this.name=name;
        this.sub1=Integer.parseInt(sub1);
        this.sub2=Integer.parseInt(sub2);
        this.sub3=Integer.parseInt(sub3);
    }
    private void calculate(){
    total_marks=sub1+sub2+sub3;
    percentage=total_marks/3;
    }
    void display(){
        calculate();
    System.out.println("Roll-"+roll);
    System.out.println("Name-"+name);
    System.out.println("Total Marks-"+total_marks);
    System.out.println("Sub1-"+sub1);
    System.out.println("Sub2-"+sub2);
    System.out.println("Sub3-"+sub3);
    System.out.println("Percentage-"+percentage);
    }
}

class StudentInfoMarks{
    public static void main(String[] args){
    Student9 s=new Student9();
    s.assign(args[0],args[1],args[2],args[3],args[4]);
    s.display();
    }
}
