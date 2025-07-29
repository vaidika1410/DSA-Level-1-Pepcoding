import java.util.Scanner;

public class InversedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter a number which contains all the digits from 1 to n : ");
        int num = sc.nextInt();

        int inv = 0; // inverse
        int op = 1; // original place
        while(num != 0){
            int od = num % 10; // original digit
            int id = op; // inverted digit
            int ip = od; // inverted place

            // make change to inv using ip and id
            inv = inv + id * (int)Math.pow(10, ip - 1);

            num /= 10;
            op++;
        }

        System.out.println(inv);
    }
}
