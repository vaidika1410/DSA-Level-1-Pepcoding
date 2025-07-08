import java.util.Scanner;
//print all Fibonacci numbers till N
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter n : ");
        int n = sc.nextInt();

        int fib1 = 0;
        int fib2 = 1;
        int sum;
        for(int i=0; i<n; i++){
            System.out.println(fib1);
            sum = fib1 + fib2;
            fib1 = fib2;
            fib2 = sum;
        }
    }
}
