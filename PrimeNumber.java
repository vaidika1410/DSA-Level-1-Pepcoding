import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter number : ");
        int number = sc.nextInt();

//        Approach 1 -
        int count = 0;
        for(int i=1; i<=number; i++){
            if(number % i == 0){
                count++;
            }
        }
        if(count == 2){
            System.out.println("the number is prime");
        } else{
            System.out.println("the number is not prime");
        }
        // the above approach is an incorrect approach, since the program iterates over every index, the time
        // complexity for larger numbers could exceed the limit --> inefficient approach

//        Approach 2 -
        int check = 0;
        for(int i=2; i * i <= number; i++){
            if(number % i == 0){
                check++;
            }
        }

        if(check == 0){
            System.out.println("the number is prime");
        } else{
            System.out.println("the number is not prime");
        }
        // the above approach is correct but its checking even after it found one factor --> increasing time
        // complexity for larger numbers

//        Approach 3 -
        int itr = 0;
        for(int i=2; i * i <= number; i++){
            if(number % i == 0){
                itr++;
                break;
            }
        }

        if(itr == 0){
            System.out.println("the number is prime");
        } else{
            System.out.println("the number is not prime");
        }
    }
}
