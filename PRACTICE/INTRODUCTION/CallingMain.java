package PRACTICE.INTRODUCTION;

    public class CallingMain
    {
        static int i=5;
        public static void main(String[] args)
        {
            while ((i--)>0) {
                System.out.println("Hello World-"+i);
                main(null);
            }
        }
    }

