import java.util.Arrays;
import java.util.Scanner;

public class Lecture4Array {

    public static void main(String[] args) {
            int[] massiv = inputArray();
            printArray(massiv);
            printYForArray(massiv);
            //Arrays.stream(massiv).forEach(x->printY(x)); //краткая запись через StreamAPI
        }

        static void printArray(int[] mas){
            System.out.println("Массив:");
        /*for (int i = 0; i < mas.length; i++) {
            System.out.println(massiv[i]);
        }*/
            System.out.println(Arrays.toString(mas));
        }

        static int[] inputArray(){
            int[] massiv = new int[7];
            for (int i = 0; i < massiv.length; i++) {
                massiv[i] = inputX();
            }
            return massiv;
        }

        static int inputX()    {
            System.out.println("Введите число");
            Scanner scanner = new Scanner(System.in);
            return scanner.nextInt();
        }

        static void printY(int n) {
            if (n>0)
                System.out.println("Квадрат полож.числа "+n+" равен "+n * n);
            else
            if (n<0)
                System.out.println("Половина модуля отриц.числа "+n+" равен "+(-(double)n/2));
        }

        static void printYForArray(int[] mass)
        {
            for (int i = 0; i < mass.length; i++) {
                int x = mass[i];
                printY(x);
            }
        }
}
