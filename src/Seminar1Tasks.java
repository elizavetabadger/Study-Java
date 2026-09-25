import java.util.Scanner;

public class Seminar1Tasks {

    public static void main() {
//        twoBandits();
//        busExcursions2();
//        paperCrane();
//        solitaireShapoklyak();
    }

    private static void twoBandits() {
        // https://acmp.ru/index.asp?main=task&id_task=33

        int shotByHarry = Integer.parseInt(IO.readln("Сколько банок прострелил Гарри: "));
        int shotByLarry = Integer.parseInt(IO.readln("Сколько банок прострелил Ларри: "));

        int totalPots = shotByHarry + shotByLarry - 1;
        System.out.println("total pots = " + totalPots);

        IO.println("Гарри не прострелил " + (totalPots - shotByHarry));
        IO.println("Ларри не прострелил " + (totalPots - shotByLarry));

        IO.println((totalPots - shotByHarry) + " " + (totalPots - shotByLarry));
    }

    private static void paperCrane() {
        // https://acmp.ru/index.asp?main=task&id_task=92
        System.out.println("Введите натуральное число от 6: ");
        Scanner scr = new Scanner(System.in);
        int s = scr.nextInt();

        int cranePeter = s / 6;
        int craneKatya = cranePeter * 4;
        int craneSerechga = cranePeter;

        if (s < 6) {
            System.out.println("Введено неправильное число :(");
        } else
            System.out.println(cranePeter+" " + craneKatya +" " + craneSerechga);

    }

    private static void busExcursions2() {
        // https://acmp.ru/index.asp?main=task&id_task=233

        System.out.println("Введите количество мостов: ");
        Scanner sc = new Scanner(System.in);
        int numBridges = sc.nextInt();
        boolean crashed = false;

        for (int i = 0; i < numBridges && !crashed; i++) {
            System.out.println("Введите высоту моста № " + (i + 1));
            int height = sc.nextInt();
            if (height <= 437) {
                System.out.println("Crash на мосту № " + (i + 1));
                crashed = true;
            }
        }
        if (!crashed) {
            System.out.println("No crash - всё проехали!");
        }

    }

   private  static void solitaireShapoklyak() {
       // https://acmp.ru/index.asp?main=task&id_task=521
       System.out.println("Введите количество карт в первой колоде: ");
       Scanner sc = new Scanner(System.in);
       int cardsMin = sc.nextInt();
       System.out.println("Введите количество карт в последней колоде: ");
       int cardsMax = sc.nextInt();
       int amount = 0;

       if (cardsMin >= 2) {
           for (int i = cardsMin; i <= cardsMax; i++) {
               int cardsDeck = i;
               int takesDeck = 0;

               while (cardsDeck != 2) {
                   takesDeck++;
                   //amount = amount + takesDeck;
                   if (cardsDeck % 2 == 0) {
                       cardsDeck = cardsDeck / 2;
                   } else if (cardsDeck % 2 != 0) {
                       cardsDeck = cardsDeck * 3 + 1;
                   }
               }
               //takesDeck++;
               amount = amount + takesDeck;
           }
           System.out.println("Шапокляк брала карты " + amount + " раз");
       }
       else {
           System.out.println("Пасьянс не сошёлся");
       }
   }
}
