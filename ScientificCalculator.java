import java.util.Scanner;

public class ScientificCalculator {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Press 1 to start : ");
        int button = sc.nextInt();

        if(button == 1){
            System.out.print("first input : ");
            int num1 = sc.nextInt();

            int temp = num1;

            while(button != 0){
                System.out.print("enter operator : ");
                String op = sc.next();

                if(op.equals("=")){
                    button = 0;
                    System.out.println("output = " + temp);
                    break;
                }

                if(op.equals("root")){
                    temp = (int)sqrt(temp);
                    System.out.println(temp);
                    continue;
                }

                if(op.equals("abs")){
                    temp = (int)abs(temp);
                    System.out.println(temp);
                    continue;
                }

                if(op.equals("sin")){
                    temp = (int) sin(temp);
                    System.out.println(temp);
                    continue;
                }

                if(op.equals("cos")){
                    temp = (int) cos(temp);
                    System.out.println(temp);
                    continue;
                }

                if(op.equals("tan")){
                    temp = (int) tan(temp);
                    System.out.println(temp);
                    continue;
                }

                if(op.equals("ln")){
                    temp = (int) ln(temp);
                    System.out.println(temp);
                    continue;
                }

                if(op.equals("log")){
                    temp = (int) log(temp);
                    System.out.println(temp);
                    continue;
                }

                System.out.print("second input : ");
                int num2 = sc.nextInt();

                switch(op){
                    case "+":
                        temp = sum(temp, num2);
                        System.out.println(temp);
                        break;
                    case "-":
                        temp = sub(temp, num2);
                        System.out.println(temp);
                        break;
                    case "*":
                        temp = prod(temp, num2);
                        System.out.println(temp);
                        break;
                    case "/":
                        if(num2 != 0){
                            temp = div(temp, num2);
                            System.out.println(temp);
                            break;
                        }
                        else break;
                    case "%":
                        if(num2 != 0){
                            temp = mod(temp, num2);
                            System.out.println(temp);
                            break;
                        }
                        else break;
                    case "root":
                        temp = (int)sqrt(temp);
                        System.out.println(temp);
                        break;
                    case "^":
                        temp = pow(temp, num2);
                        System.out.println(temp);
                        break;
                    case "abs":
                        temp = abs(temp);
                        System.out.println(temp);
                        break;
                    case "sin":
                        temp = (int) sin(temp);
                        System.out.println(temp);
                        break;
                    case "cos":
                        temp = (int) cos(temp);
                        System.out.println(temp);
                        break;
                    case "tan":
                        if(temp % 180 == 90){
                            System.out.println("undefined");
                            break;
                        }
                        else {
                            temp = (int) tan(temp);
                            System.out.println(temp);
                            break;
                        }
                    case "ln": //natural log with base e
                        if(temp != 0){
                            temp = (int) ln(temp);
                            System.out.println(temp);
                            break;
                        }
                        else{
                            System.out.println("undefined");
                            break;
                        }
                    case "log": // log with base 10
                        if (temp != 0){
                            temp = (int) log(temp);
                            System.out.println(temp);
                            break;
                        }
                        else {
                            System.out.println("undefined");
                            break;
                        }
                    case "=":
                        button = 0;
                        System.out.println(temp);
                        break;
                }
            }
        }
    }

    public static int sum(int num1, int num2){
        return num1+num2;
    }

    public static int sub(int num1, int num2){
        return num1-num2;
    }

    public static int prod(int num1, int num2){
        return num1*num2;
    }

    public static int div(int num1, int num2){
        return num1/num2;
    }

    public static int mod(int num1, int num2){
        return num1%num2;
    }

    public static float sqrt(int temp){
        return Math.round(Math.sqrt(temp));
    }

    public static int pow(int num1, int num2){
        return (int)Math.pow(num1, num2);
    }

    public static int abs(int temp){
        return Math.abs(temp);
    }

    public static double sin(int temp){
        return (Math.sin(Math.toRadians(temp))); //the trig functions take angles in radians --> Math
        // .toRadians() converts angles from degrees to radians
    }

    public static double cos(int temp){
        return (Math.cos(Math.toRadians(temp)));
    }

    public static double tan(int temp){
        return (Math.tan(Math.toRadians(temp)));
    }

    public static int ln(int temp){
        return (int)Math.log(temp);
    }

    public static int log(int temp){
        return (int)Math.log10(temp);
    }
}
