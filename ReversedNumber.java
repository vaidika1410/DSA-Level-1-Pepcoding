import java.util.Scanner;

public class ReversedNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number : ");
        int num = sc.nextInt();

        int sum = 0;
        int rem;
        int temp = num;

        while(temp != 0){
            rem = temp % 10;
            temp /= 10;

            sum = sum * 10 + rem;
        }
        System.out.println(sum);
    }
}
