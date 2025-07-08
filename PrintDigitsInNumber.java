import java.util.Scanner;
//print all the digits of a number in correct sequence
public class PrintDigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number : ");
        int num = sc.nextInt();

        int numOfDigits = 0;
        int temp = num;

        while(temp != 0){
            temp /= 10;
            numOfDigits++;
        }

        int divisor = (int) Math.pow(10, numOfDigits-1);
        int quotient;
        while(divisor != 0){
            quotient = num / divisor;
            System.out.println(quotient);

            num %= divisor;
            divisor /= 10;
        }
    }
}
