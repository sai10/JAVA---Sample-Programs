package PRACTICE.INTRODUCTION;

public class Variables {
    public static void main(String[] args) {
        char c = 'x';               // character literals
        boolean response = true;    // boolean literals
        int num = 9;                // int type & integer literals (-2147483648 to 2147483647)
        short snum = 500;           // short type & integer literals (-32768 to 32767)
        byte bnum = 127;            // byte type & integer literals (-128 to 127)
        long lnum = 100000l;        // long type & integer literals (-9223372036854775808 to 9223372036854775807)
        float f = 1.0f;             // float type & float literal (-3.4e38 to -1.4e-45 for -ve values and  1.4e-45 to 3.4e38 for +ve values)
        double d = 1.0;             // float type & float literal (-1.8e308 to -4.9e-324 for -ve values and  4.9e-324 to 1.8e308 for +ve values)
        String str = "Hello World"; // its a class i.e. user defined datatype

        System.out.println("Character value - "+c);
        System.out.println("Boolean value-"+response);
        System.out.println("Integer value-"+num);
        System.out.println("Short value-"+snum);
        System.out.println("Byte value-"+bnum);
        System.out.println("Long value-"+lnum);
        System.out.println("Float value-"+f);
        System.out.println("Double value-"+d);
        System.out.println("String value-"+str);
    }
}
