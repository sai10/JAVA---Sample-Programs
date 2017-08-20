package PRACTICE.INTRODUCTION;

public class BinaryLiterals {
    public static void main(String[] args) {
        int inum = 0b1101;          //this is a binary value and it will get converted to decimal form
        short snum = (short)0b1111; //this is a binary value and it will get converted to decimal form

        System.out.println("Guess ?(decimal/binary) value - "+0b1101);
        System.out.println("(Integer) binary value-"+inum);
        System.out.println("(Short) binary value-"+snum);
    }
}
