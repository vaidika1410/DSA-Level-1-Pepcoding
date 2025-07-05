import java.util.Scanner;

public class RealCalculator {
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.print("Press 1 to start : ");
        int button = sc.nextInt();

        if(button == 1) {
            System.out.print("enter num1 : ");
            int num1 = sc.nextInt();

            int temp = num1;
            while(button != 0){
                System.out.print("select operator : ");
                String operator = sc.next();

                if(operator.equals("=")){
                    button = 0;
                    break;
                }

                if(operator.equals("sqrt")){
                    System.out.println(sqrt(temp));
                    temp = (int)sqrt(temp);
                    continue;
                }

                System.out.print("enter num2 : ");
                int num2 = sc.nextInt();

                switch(operator){
                    case "+":
                        int sum = sum(temp, num2);
                        temp = sum;
                        System.out.println(sum);
                        break;
                    case "-":
                        int diff = diff(temp, num2);
                        temp = diff;
                        System.out.println(diff);
                        break;
                    case "*":
                        int prod = prod(temp, num2);
                        temp = prod;
                        System.out.println(prod);
                        break;
                    case "/":
                        if(num2 != 0) {
                            int div = div(temp, num2);
                            temp = div;
                            System.out.println(div);
                        } else{
                            button = 0;
                            break;
                        }
                        break;
                    case "%":
                        int mod = mod(temp, num2);
                        temp = mod;
                        System.out.println(mod);
                        break;
                    case "sqrt":
                        float sqrt = sqrt(temp);
                        temp = (int) sqrt;
                        break;
                    case "^":
                        int pow = pow(temp, num2);
                        temp = pow;
                        System.out.println(temp);
                        break;
                    case "=":
                        button = 0;
                        break;
                }
            }
            System.out.println("output = " + temp);
        }
    }

    public static int sum(int n1, int n2){
        return n1+n2;
    }

    public static int diff(int n1, int n2){
        return n1-n2;
    }

    public static int prod(int n1, int n2){
        return n1*n2;
    }

    public static int div(int n1, int n2){
        return n1/n2;
    }

    public static int mod(int n1, int n2){
        return n1%n2;
    }

    public static long sqrt(int num){
        return Math.round((float) Math.sqrt(num));
    }

    public static int pow(int temp, int num2){
        return (int)Math.pow(temp, num2);
    }
}
