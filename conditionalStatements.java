import java.util.Scanner;

// Program to calculate the incentive. If 5 or less than 5 closures, payout is rs, 800 er closure. If less than 10 then Rs. 900.
//anything greater than or equal to 10, Rs. 1000
public class conditionalStatements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        int a = s.nextInt();
        if (a > 5) {
            if (a < 10) {

                System.out.println(a * 900);

            } else {
                System.out.println(a * 1000);

            }
        } else {
            System.out.println(a * 800);
        }
        s.close();

        System.out.print(switchAdvanced(12));

    }
    static int switchAdvanced(int a){
        int result =1 ;
        int z=a%3;
        switch (z) {

            case 0:
            
            int y = a%2;
            switch(y) {
                case 0:
                System.out.println("Multiple of 6");
                break;2
                default:
                    System.out.println("Multiple of 3");

            }

                
                break;
        
            default:
            System.out.println("Not a multiple of 2,3,6");
                break;
        }



        return result;
    }
}
