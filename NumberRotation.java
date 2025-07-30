public class NumberRotation {
    public static void main(String[] args) {
        int num = 64325398; // no. should not contain zeroes
        int k = 4;
        int rem;

//        no. of digits in the number
        int temp = num;
        int count = 0;
        while(temp != 0){
            temp /= 10;
            count++;
        }
        int digits = count;

        k = k % digits;
        int a = num;
        int sum = 0;
        int div;
        while(a != 0) {
            rem = (int)(a % Math.pow(10, k));
            div = a / (int)(Math.pow(10, k)); // do not use (digits - k)
            a = (int)(a / Math.pow(10, (digits)));
            sum = sum + rem * (int)(Math.pow(10, digits - k)) + div;
        }

        

        System.out.println("Given number : " + num);
        System.out.println("Rotated number : " + sum);
    }
}
