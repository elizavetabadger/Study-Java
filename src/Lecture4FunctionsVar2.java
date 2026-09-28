import java.util.Scanner;

public class Lecture4FunctionsVar2 {
    public static void main(String[] args) {
        //проверим функцию на различных заранее известных примерах
        printY(6);
        printY(-11);
        printY(0);

        //запустим функцию многократно для чисел, вводимых пользователем
        int x;
        for (int i = 0; i < 7; i++) {
            x = inputX();
            printY(x);
        }
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
}
