import java.util.Scanner;

public class GradingSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter marks of subject 1 : ");
        float sub1 = sc.nextFloat();
        System.out.println("enter marks of subject 2 : ");
        float sub2 = sc.nextFloat();
        System.out.println("enter marks of subject 3 : ");
        float sub3 = sc.nextFloat();
        System.out.println("enter marks of subject 4 : ");
        float sub4 = sc.nextFloat();
        System.out.println("enter marks of subject 5 : ");
        float sub5 = sc.nextFloat();


        float percentage = (sub1 + sub2 + sub3 + sub4 + sub5) / 5;

        if(percentage > 90){
            System.out.println("Excellent");
        } else if(percentage > 80 && percentage <= 90){
            System.out.println("Good");
        } else if(percentage > 70 && percentage <= 80){
            System.out.println("Fair");
        } else if(percentage > 60 && percentage <= 70){
            System.out.println("Meets expectations");
        } else {
            System.out.println("Below par");
        }
    }
}
