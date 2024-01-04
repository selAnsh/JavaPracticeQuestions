import java.util.Arrays;
import java.util.Scanner;

public class MagicalNumbers {

    static utilities ut = new utilities();
    /**
     * fascinating number , 3 digit number a
     *Concatenate a +a*2 + a*3
     If it contains 1 to 9 exactly once, it is a fascinating number 
     Comment changed
     * */
    public static boolean fascinating(long n){
        if(utilities.lengthNum(n)!=3){
            return false;
        } 
        String fasc = Long.toString(n).concat(Long.toString(n*2)).concat(Long.toString(n*3)); 
        for(int i =0;i< fasc.length();i++){
            
        }
        return false;
    }
/**
 * Tech number 
 * A even number when divided into two parts and added, then square of added number is same
 * Eg. 2025 -> 20,25
 * (20 + 25)^2
 * 45^2 = 2025
 */
    public static boolean tech(long n){
        long arr[] = utilities.numToArray(n);
        if(arr.length % 2 !=0) {
            return false;
        }
        long x = utilities.arrayToNum(Arrays.copyOfRange(arr, 0, arr.length/2));
        long y = utilities.arrayToNum(Arrays.copyOfRange(arr,arr.length/2,arr.length));

        
        return n==Math.pow(x+y, 2)?true:false;
    }
    /*A number is sunny when n+1 is a perfect square
     * 80
     * 80 + 1 = 81
     * Square root of 81 = 9 
     */
    public static boolean sunny(long n){
        System.out.println(Math.sqrt(n+1));
        System.out.println(Math.floor(Math.sqrt(n+1)));     
        return Math.floor(Math.sqrt(n+1))-Math.sqrt(n+1)==0? true: false;
    }
/**
 * 3. Peterson Number -> sum of digits of factorial is equal to the number itself
 * Eg. 145 
 * 1! + 4! + 5! => 1 + 24 + 120 => 145
 * 145 =145
 *  So it is peterson number
 * */
    public static boolean peterson(long n) {
        long add=0;
        long numArr[] = utilities.numToArray(n);
        for (int i =0;i< numArr.length;i++) {
            add+=utilities.fact(numArr[i]);
        }
        return add==n?true:false;
    }

    /**2. Automorphic number square of the number contains the number in the starting digits
    Eg. Square of 25 is 625
    Which contains 25 at last
    **/
    public static boolean automorphic(long n){
        long sqr = (long) Math.pow(n, 2);
        long numArr[] = ut.numToArray(n);
        long sqrArr[] = ut.numToArray(sqr);
        for (int i =0;i< numArr.length ;i ++){
            if(numArr[i]!=sqrArr[i]){
                return false;
            }
        }
        return true;
    }

    // 1. To reverse the number Input - 4550 Output - 554
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
            System.out.println(automorphic(n)?"Automorphic":"not automorphic");
            System.out.println(peterson(n)?"Peterson":"not Peterson");
            System.out.println(tech(n)?"Tech":"not tech");
            System.out.println(sunny(n)?"Sunny" : "Not sunny");
            System.out.println(fascinating(n));
            
    }
}
