import java.util.Scanner;

public class DigitsInNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number : ");
        int num = sc.nextInt();

        int count = 0;
        int rem;
        while(num > 0){
            num = num / 10;
            count++;
        }
        System.out.println(count);
    }
}
