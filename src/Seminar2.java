import java.util.Scanner;

public class Seminar2 {

    public static void main() {
//        exercise1();
//        var2();
//        var4();
//        varConst();
//        var3();
        exercise2();
    }

    private  static void exercise1(){

        System.out.println("Сколько стоит чашка кофе? ");
        Scanner sc = new Scanner(System.in);
        int priceOfCoffe = sc.nextInt();

        if (priceOfCoffe > 300 ){
            System.out.println("Дороговато");
        } else if (150 <= priceOfCoffe && priceOfCoffe <=300 ){
            System.out.println("Норм");
        }  else if (80 <= priceOfCoffe && priceOfCoffe < 150 ){
            System.out.println("Дёшево");
        } else if (priceOfCoffe < 80 && priceOfCoffe > 0){
            System.out.println("А это в рублях? А это вообще кофе?");
        }
        else {
            System.out.println("Error");
        }

    }

    private  static void var2(){

        System.out.println("Сколько стоит чашка кофе? ");
        Scanner sc = new Scanner(System.in);
        int priceOfCoffe = sc.nextInt();

        if (priceOfCoffe > 300 ){
            System.out.println("Дороговато");
        } else if (priceOfCoffe >= 150 ){
            System.out.println("Норм");
        }  else if (priceOfCoffe >= 80 ){
            System.out.println("Дёшево");
        }  else {
            System.out.println("А это в рублях? А это вообще кофе?");
        }
    }

    private  static void var3(){
        final  int BIG_PRICE_LEVEL = 300;
        final  int MEDIUM_PRICE_LEVEL = 150;
        final  int SMALL_PRICE_LEVEL = 80;

        System.out.println("Сколько стоит чашка кофе? ");
        String message = "Наше мнение о кофе ";

        Scanner sc = new Scanner(System.in);
        double priceOfCoffe = sc.nextDouble();

        if (priceOfCoffe > BIG_PRICE_LEVEL ){
            message ="Дороговато";
        } else if (priceOfCoffe >= MEDIUM_PRICE_LEVEL ){
            message ="Норм";
        }  else if (priceOfCoffe >= SMALL_PRICE_LEVEL ){
            message ="Дёшево";
        }  else {
            message = "А это в рублях? А это вообще кофе?";
        }
        System.out.println(message);
    }

    private  static void var4(){

        System.out.println("Сколько стоит чашка кофе? ");
        String message = "Наше мнение о кофе ";

        Scanner sc = new Scanner(System.in);
        int priceOfCoffe = sc.nextInt();

        if (priceOfCoffe > 300 ){
            message ="Дороговато";
        } else if (priceOfCoffe >= 150 ){
            message ="Норм";
        }  else if (priceOfCoffe >= 80 ){
            message ="Дёшево";
        }  else {
            message = "А это в рублях? А это вообще кофе?";
        }
        System.out.println(message);
    }

    private  static void varConst(){
        final  int BIG_PRICE_LEVEL = 300;
        final  int MEDIUM_PRICE_LEVEL = 150;
        final  int SMALL_PRICE_LEVEL = 80;

        System.out.println("Сколько стоит чашка кофе? ");
        String message = "Наше мнение о кофе ";

        Scanner sc = new Scanner(System.in);
        int priceOfCoffe = sc.nextInt();

        if (priceOfCoffe > BIG_PRICE_LEVEL ){
            message ="Дороговато";
        } else if (priceOfCoffe >= MEDIUM_PRICE_LEVEL ){
            message ="Норм";
        }  else if (priceOfCoffe >= SMALL_PRICE_LEVEL ){
            message ="Дёшево";
        }  else {
            message = "А это в рублях? А это вообще кофе?";
        }
        System.out.println(message);
    }

    private  static void exercise2(){
        final  int BIG_PRICE_LEVEL = 300;
        final  int MEDIUM_PRICE_LEVEL = 150;
        final  int SMALL_PRICE_LEVEL = 80;

        System.out.println("Сколько стоит чашка кофе? ");
        String message = "Наше мнение о кофе ";

        Scanner sc = new Scanner(System.in);
        int priceOfCoffe = sc.nextInt();

        if (priceOfCoffe > BIG_PRICE_LEVEL ){
            message ="Дороговато";
        } else if (priceOfCoffe >= MEDIUM_PRICE_LEVEL ){
            message ="Норм";
        }  else if (priceOfCoffe >= SMALL_PRICE_LEVEL ){
            message ="Дёшево";
        }  else {
            message = "А это в рублях? А это вообще кофе?";
        }
        System.out.println(message);
    }

}
