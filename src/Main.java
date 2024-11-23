import java.util.Scanner;

public class Main {
    public static void checkTriangle(double a, double b, double c) throws IllegalTriangleException {
        if (a <= 0 || b <= 0 || c <= 0) {
            throw new IllegalTriangleException("Side must be positive!");
        }
        //Kiem tra dieu kien tam giac
        if (a + b <= c || a + c <= b || b + c <= a) {
            throw new IllegalTriangleException("Sum of 2 sides must be > remain side!");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Input a: ");
        double a = sc.nextDouble();
        System.out.print("Input b: ");
        double b = sc.nextDouble();
        System.out.print("Input c: ");
        double c = sc.nextDouble();
        try {
            checkTriangle(a, b, c);
            System.out.println("Sides create valid triangle!");
        } catch (IllegalTriangleException e) {
            System.out.println(e.getMessage());
        }
    }
}