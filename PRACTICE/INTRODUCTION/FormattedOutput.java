package PRACTICE.INTRODUCTION;

public class FormattedOutput {
    public static void main(String[] args) {
        int a = 2;
        float b = 3.0f;
        char c = 'c';
        double d = 10.0;
        String s = "qwerty";

        System.out.printf("Formatted int value - %d\n",a);
        System.out.printf("Formatted float value - %f\n",b);
        System.out.printf("Formatted float(restricted) value - %.2f\n",b);
        System.out.printf("Formatted char value - %c\n",c);
        System.out.printf("Formatted double value - %f\n",d);
        System.out.printf("Formatted string value - %s\n",s);
    }
}
