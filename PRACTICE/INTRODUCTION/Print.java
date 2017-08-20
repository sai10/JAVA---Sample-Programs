package PRACTICE.INTRODUCTION;

public class Print {
    public static void main(String[] args) {

        // Example 1

        System.out.print("Hello World");
        System.out.print("\n");                // ESCAPE SEQUENCE
        /*      EQUIVALENT TO  */
        System.out.println("Hello World");

        // Example 2

        int a = 2;
        int b = 5;
        int z = a+b;
        System.out.println(z);
        System.out.println(a+b);
        System.out.println("Sum is -> "+z);
        System.out.println("Sum is -> "+a+b);       // AS PREVIOUSLY ITS ENCOUNTERING STRING SO IT TAKE OTHERS TO BE STRING INSTEAD OF INTEGERS SO ITS GETTING CONCATENATED
        System.out.println("Sum is -> "+(a+b));     // INTRODUCING BRACES WILL CHANGE IT TO ARITHMETIC OPERATION
        System.out.println(a+b+" is the sum");      // INITIALLY NO SUCH ISSUE IS ENCOUNTERED AS STRINGS HAVE HIGHER PRIORITY THAN INTEGERS
        /*  OR  */
        System.out.print("Sum is -> ");
        System.out.print(a+b);
    }
}
