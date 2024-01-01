public class utilities {
    static int num=0;
       
    //Common utility to calculate length
    public static int lengthNum(long a) {
        if (a>0) {
            num++;
            lengthNum(a/10);
        }
        return num;
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
