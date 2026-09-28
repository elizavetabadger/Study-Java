import java.util.Scanner;

public class Lecture4FunctionsVar1 {

        static void printStars(int n)    {
            for (int i = 0; i < n; i++) {
                System.out.println("***");
            }
        }
        public static void main(String[] args) {
            //int x = inputX();
            //printStars(x);
            printStars(inputX());
            printY(inputX());
        }
        static int inputX()    {
            System.out.println("Введите число");
            Scanner scanner = new Scanner(System.in);
            int x= scanner.nextInt();
            return x;
        }

        static void printY(int n) {
            if (n>0)
                System.out.println("Квадрат полож.числа "+n+" равен "+n * n);
            else
            if (n<0)
                System.out.println("Половина модуля отриц.числа "+n+" равен "+(-(double)n/2));
        }
}
