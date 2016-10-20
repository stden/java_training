import java.util.Scanner;

public class Equation2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Решение уравнения ax^2+bx+c=0");
        double a = 1;
        double b = 1;
        double c = 1;
        System.out.println("Введите a");
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                a = scanner.nextDouble();
                break;
            } else {
                System.out.println("Введите число!");
                return;
            }
        }
        System.out.println("Введите b");
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                b = scanner.nextDouble();
                break;
            } else {
                System.out.println("Введите число!");
                return;
            }
        }
        System.out.println("Введите c");
        while (scanner.hasNext()) {
            if (scanner.hasNextDouble()) {
                c = scanner.nextDouble();
                break;
            } else {
                System.out.println("Введите число!");
                return;
            }
        }
        if (a == 0) {
            double x = -c/b;
            System.out.println("Ответ:\nx = " + x);
            return;
        }
        double D = b*b-4*a*c;
        if (D < 0) {
            System.out.println("Ответ:\nНет решения!");
            return;
        }
        double D1 = Math.sqrt(D);
        double x1 = ((-b + D1)/(2*a));
        double x2 = ((-b - D1)/(2*a));
        System.out.println("Ответ:");
        System.out.println("x1 = " + x1);
        System.out.println("x2 = " + x2);
    }
}
