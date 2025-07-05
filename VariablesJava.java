public class VariablesJava {
    public static void main(String[] args) {
//        various data types in Java
//        int → whole numbers
//        float, double → decimal numbers
//        char → single character
//        boolean → true/false
//        String → text

//        printing sum of two numbers
        int a = 10;
        int b = 25;
        int sum = a+b;
        System.out.println("sum of " + a + " and " + b + " is : " + sum);


//        swapping two numbers using a temporary variable
        int c; // temp variable
        c = a;
        a = b;
        b = c;

        System.out.println(a + ", " + b);


//        swapping two numbers without using temporary variable
        int x = 30;
        int y = 15;

        x = x + y; // 45
        y = x - y; // 30
        x = x - y; // 15
        System.out.println(x + ", " + y);

//        swapping of two numbers using bitwise XOR operator --> swapping of x and y again
        x = x ^ y;
        y = x ^ y;
        x = x ^ y;
        System.out.println(x + ", " + y);
    }
}
