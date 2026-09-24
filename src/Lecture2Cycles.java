import java.util.Scanner;

public class Lecture2Cycles {

    public static void main(){
        //exampleWhile1();
        //exampleWhile2();
        //exampleDoWhile();
        //exampleFor1();
        busExcursions();
    }

    private static void exampleWhile1(){
        //Привет 7 раз
        int counter = 1;
        while (counter<=7) {
            System.out.println("Привет");
            counter++;
//          counter+=1;
//          counter = counter+1;
        }
    }

    private static void exampleWhile2(){

        System.out.println("Введите положительные, отрицательные числа или 0 : ");
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int counter = 0;
        while (n > 0){
            n = sc.nextInt();
            counter++;
        }
        System.out.println("Вы ввели "+counter+" чисел");
    }

    private static void exampleDoWhile(){

        System.out.println("Do Введите положительные. Для завершения отрицательные или 0 : ");
        Scanner sc = new Scanner(System.in);
        int n = 1;
        int counter = 0;
        do {
            n = sc.nextInt();
            counter++;
        } while (n > 0);
        System.out.println("Вы ввели "+counter+" чисел");
    }

    private static void exampleFor1(){
        //Привет 7 раз
        for(int i = 1; i<=7; i++){
            System.out.println("Привет");
        }

    }

    private static void busExcursions(){
        // https://acmp.ru/index.asp?main=task&id_task=233

        System.out.println("Введите количество мостов: ");
        Scanner sc = new Scanner(System.in);
        int kolvo = sc.nextInt();
        int i = 0;
        boolean crashed = false;

        while (i < kolvo && !crashed) {
            i++;
            System.out.println("Введите высоту моста № "+ i);
            int height = sc.nextInt();
            if (height <= 437){
                System.out.println("Crash на мосту № "+i);
                crashed = true;
            }
        }
        System.out.println("No crash - всё проехали!");
    }

}
