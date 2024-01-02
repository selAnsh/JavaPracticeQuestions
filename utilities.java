import java.util.Arrays;

public class utilities {
    static boolean flag = false;
    static int len =0;
    //Common utility to calculate length
    //Flag to decide if set value of len to 0 and restart
    public static int lengthNum(long a) {
        if(!flag){
            len =0;
            flag = true;
        }
        if (a>0) {
            len++;
            lengthNum(a/10);
        }
        flag = false;
        return len;
    }

    public static long fact(long a) {
        if (a>0){
            return a*fact(a-1);
        }
        return 1;
    }
    
    //Common utility to convert number to array
    public static long[] numToArray(long n){
        int count =0;
        long arr[] =  new long[lengthNum(n)];
            while(n>0) {
                arr[count] = n%10;
                n/=10;
                count++;
            }
            
        System.out.println(Arrays.toString(arr));
            return arr;
    }
    public static long arrayToNum(long[] arr){
        long val =0;
        int count=0;
        while(count<arr.length) {
            int multiplier = (int) Math.pow(10, count);
            val +=multiplier*arr[count];
            count++;
        
        }
        return val;        

     }
    
}
