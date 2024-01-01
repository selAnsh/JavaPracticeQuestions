import java.util.Scanner;

public class binaryCreation {
 
    public static long createBin(int a) {
        long binary=0;
        int count=0;
        int array[] = new int[24];
        while(a>0) {
            binary += (long) Math.pow(10,count) * (a%2);
            a=a/2;
            count++;
            }

        return binary;
    }

    public static long createInt(long binary) {
        long value =0;
        int count =0;
        while(binary >0) {
            long multiplier =(long) Math.pow(2,count);
            long flag =binary%10;
            if(flag==1){
                value+=multiplier;            
            }
            binary/=10;
            count++;
        }
        return value;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a= scan.nextInt();

        long bin = createBin(a);
        System.out.println(bin);
        System.out.println(createInt(bin));
        
        scan.close();
    }
}
