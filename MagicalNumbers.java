import java.util.Scanner;

public class MagicalNumbers {

    static utilities ut = new utilities();
    static int num=0;

    // 1. To reverse the number
    public static long reverse(long n){

        long len[] = ut.numToArray(n);
        
        int reversedNum=0;
        int count=0;
        while(count<len.length) {
            int multiplier = (int) Math.pow(10, count);
            reversedNum +=multiplier*len[len.length - count -1];
            count++;
        
        }
        
        return reversedNum;        
        
    }


        public static void main(String[] args) {
        
            Scanner s = new Scanner(System.in);        
            System.out.println("This is the program to find various MATHEMATICAL numbers");
            long n =s.nextLong();
            System.out.println(reverse(n));
    }
}
