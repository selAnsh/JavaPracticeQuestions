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
    public static long[] revArr(long[] arr){
        long[] arr1 = new long[arr.length];
        
        for (int i =0;i< arr.length;i++) {
            arr1[i] = arr[arr.length-1-i];
        }

        return arr1;
        
    }
    
    public static boolean prime(long n){
        for (int i=2;i<n;i++){
            if (n%2==0){
                return false;
            }
        }
        return true;
    }

    public static long[] movAndAdd(long[] arr, long num){
        for (int i=0;i< arr.length -1;i++){
        arr[i] = arr[i+1];    
        }
        arr[arr.length-1] = num;
        System.out.println(Arrays.toString(arr));
        
        return arr;
    }
    public static long fact(long a) {
        if (a>0){
            return a*fact(a-1);
        }
        return 1;
    }

    public static long arrAdd(long a[]){
        long val=0;
        for (int i =0;i< a.length;i++){
            val+=a[i];
        }
        return val;
    }

    public static long arrMul(long a[]){
        long val=1;
        for (int i =0;i< a.length;i++){
            val*=a[i];
        }
        return val;
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
