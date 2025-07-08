import java.util.Scanner;

public class PrimeNumTillN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter lower limit : ");
        int low = sc.nextInt();

        System.out.print("enter higher limit : ");
        int high = sc.nextInt();

        System.out.println("list of prime numbers between " + low + " and " + high + " is ");
        for(int i = low; i <= high; i++){
        int count = 0;

        for(int div = 2; div * div <= i; div++){
            if(i % div == 0){
                count++;
                break;
            }
        }

        if(count == 0) {
            System.out.println(i);
        }
        }

    }
}
