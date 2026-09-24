import java.util.Scanner;

public class Seminar2 {
    public static void main(){
        //CalcRectangle();
        //CalcTriangle();
    }

    public static void CalcRectangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите длину прямоугольника: ");
        int a = scanner.nextInt();

        System.out.println("Введите ширину прямоугольника: ");
        int b = scanner.nextInt();

        if (a>=0 && b>=0){
            int s = a*b;
            System.out.println("Площадь прямоугольника = "+s);
        }
        else
            System.out.println("Сторона не моет быть отрицательной");
    }

    public static void CalcTriangle(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите сторону a треугольника: ");
        double a = scanner.nextInt();

        System.out.println("Введите сторону b треугольника: ");
        double b = scanner.nextInt();

        System.out.println("Введите сторону c треугольника: ");
        double c = scanner.nextInt();

        if (a>=0 && b>=0 && c>=0){
            double p = (a+b+c)/2;
            double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Площадь треугольника = "+s);
        }
        else
            System.out.println("Сторона не моет быть отрицательной");
    }


}
