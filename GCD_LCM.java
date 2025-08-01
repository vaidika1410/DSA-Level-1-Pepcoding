import java.util.Scanner;

public class GCD_LCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("number 1 : ");
        int n1 = sc.nextInt();
        System.out.print("number 2 : ");
        int n2 = sc.nextInt();

        int tempN1 = n1;
        int tempN2 = n2;

        while(tempN1 % tempN2 != 0) {
            int rem = tempN1 % tempN2;
            tempN1 = tempN2;
            tempN2 = rem;
        }

        int gcd = tempN2;

        System.out.print("GCD of " + n1 + " and " + n2 + ": " + gcd);

        int lcm = (n1 * n2) / gcd;
        System.out.print("\nLCM : " + lcm);
    }
}
