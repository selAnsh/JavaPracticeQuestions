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

    }
}
