import java.util.Scanner;

public class AreaCalculator {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("press 1 to start : ");
        int button = sc.nextInt();

        if(button == 1){
            while(button != 0){
                System.out.println("enter choice : ");
                int choice  = sc.nextInt();

                switch(choice){
                    case 1:
                        System.out.println("enter radius of circle : ");
                        int radius = sc.nextInt();
                        System.out.println(areaCircle(radius) + " sq. units");
                        break;
                    case 2:
                        System.out.println("enter side of square : ");
                        int side = sc.nextInt();
                        System.out.println(areaSquare(side) + " sq. units");
                        break;
                    case 3:
                        System.out.println("enter length and breadth of rectangle : ");
                        int length = sc.nextInt();
                        int breadth = sc.nextInt();
                        System.out.println(areaRectangle(length, breadth) + " sq. units");
                        break;
                    case 4:
                        System.out.println("enter base and height of triangle : ");
                        int base = sc.nextInt();
                        int height = sc.nextInt();
                        System.out.println(areaTriangle(base, height) + " sq. units");
                        break;
                    case 5:
                        System.out.println("enter base and height of parallelogram : ");
                        int Base = sc.nextInt();
                        int Height = sc.nextInt();
                        System.out.println(areaParallelogram(Base, Height) + " sq. units");
                        break;
                    case 6:
                        System.out.println("enter parallel side 1, parallel side 2 and height of trapezium : ");
                        int p1 = sc.nextInt();
                        int p2 = sc.nextInt();
                        int h = sc.nextInt();
                        System.out.println(areaTrapezoid(p1, p2, h) + " sq. units");
                        break;
                    case 7:
                        System.out.println("enter side of equilateral triangle : ");
                        int s = sc.nextInt();
                        System.out.println(areaEquilateralTriangle(s) + " sq. units");
                        break;
                    case 8:
                        System.out.println("enter diagonal 1 and diagonal 2 of rhombus : ");
                        int d1 = sc.nextInt();
                        int d2 = sc.nextInt();
                        System.out.println(areaRhombus(d1, d2) + " sq. units");
                        break;
                    case 9:
                        button = 0;
                        System.out.println("Calculator stopped");
                        break;
                }
            }
        } else{
            System.out.println("invalid number entered");
        }
    }

    public static float areaCircle(int radius){
        return 3.14f * radius * radius;
    }

    public static int areaSquare(int side){
        return side * side;
    }

    public static int areaRectangle(int length, int breadth){
        return length * breadth;
    }

    public static float areaTriangle(int base, int height){
        return (base * height) / 2f;
    }

    public static int areaParallelogram(int base, int height){
        return base * height;
    }

    public static float areaTrapezoid(int p1, int p2, int height){
        return (p1 + p2) * height / 2f;
    }

    public static long areaEquilateralTriangle(int side){
        return (Math.round(Math.sqrt(3) * side * side) / 4);
    }

    public static float areaRhombus(int d1, int d2){
        return (d1 * d2) / 2f;
    }
}
