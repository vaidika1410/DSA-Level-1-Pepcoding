public class Loops {
    public static void main(String[] args) {
//        while loop
        int num = 1;
        while(num <= 10){
            System.out.println(num);
            num++;
        }

//        do-while loop
        int a = 9;
        do{
            System.out.println(a);
            a++;
        } while(a <= 8); // performs the task once before checking the condition

//        for loop
        for(int i=1; i<= 10; i++){
            System.out.println(i);
        }
    }
}
