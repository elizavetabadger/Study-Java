import java.util.*;

public class OlympiadTasks {

    public static void main() {
//        robotK79();

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
            System.out.println(cranePeter + " " + craneKatya + " " + craneSerechga);

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

    private static void solitaireShapoklyak() {
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

                    if (cardsDeck % 2 == 0) {
                        cardsDeck = cardsDeck / 2;
                    } else if (cardsDeck % 2 != 0) {
                        cardsDeck = cardsDeck * 3 + 1;
                    }
                }
                amount = amount + takesDeck;
            }
            System.out.println("Шапокляк брала карты " + amount + " раз");
        } else {
            System.out.println("Пасьянс не сошёлся");
        }
    }

    private static void flovers() {
        // https://acmp.ru/index.asp?main=task&id_task=504
        int k = Integer.parseInt(IO.readln("Сколько дней? "));
//        Начальное состояние GCV
        String left = "G", center = "C", right = "V";
//                Повторить k раз:
        int i;
        for (i = 0; i < k; i++) {
            // Маша делает перестанову
            String taburet = right;
            right = center;
            center = taburet;
            // Таня делает перестановку
            taburet = left;
            left = center;
            center = taburet;
        }
        IO.println((i + 1) + ": " + left + center + right);
    }

    public static void flovers2() {
        // https://acmp.ru/index.asp?main=task&id_task=504

        Scanner sc = new Scanner(System.in);
        String flower1 = "G"; // Герань
        String flower2 = "C"; // Кактус
        String flower3 = "V"; // Фиалка

        System.out.println("Через сколько дней проверим порядок цветов? ");
        int nightCount = sc.nextInt();
        if (nightCount < 0) {
            System.out.println("Не прошло ни дня...");
        }
        int swap = nightCount % 3;

        if (swap == 0)
            System.out.println(flower1 + flower2 + flower3);
        else if (swap == 1)
            System.out.println(flower3 + flower1 + flower2);
        else
            System.out.println(flower2 + flower3 + flower1);
    }

    private static void conditioner() {
//        https://acmp.ru/index.asp?main=task&id_task=854

        Scanner sc = new Scanner(System.in);
        System.out.println("Температура в комнате: ");
        int tRoom = sc.nextInt();
        if (tRoom > 50 || tRoom < -50) {
            System.out.println("Неверные параметры температуры");
        } else {
            System.out.println("Желаемая температура: ");
        }

        int tCond = sc.nextInt();
        if (tCond > 50 || tCond < -50) {
            System.out.println("Неверные параметры температуры");
        } else {
            System.out.println("Режим кондиционера: ");
        }
        sc.nextLine(); // Очищаем буфер
        String tMode = sc.nextLine();

        if (tMode.equals("fan")) {
            System.out.println("Температура через 1 час: " + tRoom);
        } else if (tMode.equals("freeze") && tRoom > tCond) {
            System.out.println("Температура через 1 час: " + tCond);
        } else if (tMode.equals("freeze") && tRoom < tCond) {
            System.out.println("Температура через 1 час: " + tRoom);
        } else if (tMode.equals("heat") && tRoom < tCond) {
            System.out.println("Температура через 1 час: " + tRoom);
        } else if (tMode.equals("heat") && tRoom > tCond) {
            System.out.println("Температура через 1 час: " + tCond);
        } else {
            System.out.println("Температура через 1 час: " + tCond);
        }
    }

    private static void kayaking() {
//        https://acmp.ru/index.asp?main=task&id_task=869

        Scanner sc = new Scanner(System.in);

        System.out.println("Компания из скольки человек? ");
        int n = sc.nextInt();
        if (1 > n || n > 15000) {
            System.out.println("Не может такого быть");
        } else {
            System.out.println("Грузоподъемность всех каяков: ");
        }

        int d = sc.nextInt();
        if (1 > d || d > 15000) {
            System.out.println("Не может такого быть");
        } else {
            System.out.println("Вес каждого человека: ");
        }

        int[] peopleWeights = new int[n];
        for (int i = 0; i < n; i++) {
            peopleWeights[i] = sc.nextInt();
        }
        Arrays.sort(peopleWeights); // Сортировка по возрастанию
        int countKayak = 0;

        int minWeight = 0;
        int maxWeight = peopleWeights.length - 1;

        while (minWeight <= maxWeight) {
            if (minWeight < maxWeight && peopleWeights[minWeight] + peopleWeights[maxWeight] <= d) {
                minWeight++;
            }
            maxWeight--;
            countKayak++;
        }

        System.out.println("Байдарок понадобится: " + countKayak + " шт.");
    }

    private  static void robotK79(){
//        https://acmp.ru/index.asp?main=task&id_task=235

//        Scanner scanner = new Scanner(System.in);
//        String program = scanner.nextLine();
//        int x = 0, y = 0, direction = 0, steps = 0;
//        int[] dx = {0, 1, 0, -1};
//        int[] dy = {1, 0, -1, 0};
//
//        TreeSet<String> visit = new TreeSet<>(); // список посещенных клеток
//        visit.add("0,0");

    }

    private static void twoCircles(){
//        https://acmp.ru/index.asp?main=task&id_task=26

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите координаты x,y и радиус r 1-ой окружности: ");
        int x1 = sc.nextInt(), y1 = sc.nextInt(), r1 = sc.nextInt();
        System.out.println("Введите координаты x,y и радиус r 2-ой окружности: ");
        int x2 = sc.nextInt(), y2 = sc.nextInt(), r2 = sc.nextInt();
        int d = (x2-x1)*(x2-x1) + (y2-y1)*(y2-y1);

        if(d < (r2-r1)*(r2-r1) || d > (r1+r2)*(r1+r2)){
            System.out.println("NO");
        }
        else {
            System.out.println("YES");
        }
    }

    private  static void boltAndNuts(){
//        https://acmp.ru/index.asp?main=task&id_task=294

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целые числа k1, l1, m1: ");
        int k1 = sc.nextInt(), l1 = sc.nextInt(), m1 = sc.nextInt();
        int lostk1 = k1*l1/100;
        int costLost1 = lostk1*m1;
        int nowk1=k1-lostk1;

        System.out.println("Введите целые числа k2, l2, m2: ");
        int k2 = sc.nextInt(), l2 = sc.nextInt(), m2 = sc.nextInt();
        int lostk2 = k2*l2/100;
        int costLost2 = lostk2*m2;
        int nowk2=k2-lostk2;

        if (nowk1 > nowk2){
            System.out.println("Размер ущерба составил: "+ ((nowk1-nowk2)*m1+costLost1+costLost2));
        }
        else {
            System.out.println("Размер ущерба составил: "+ ((nowk2-nowk1)*m2+costLost2+costLost1));
        }
    }

    private static void taxes(){
//        https://acmp.ru/index.asp?main=task&id_task=293

        Scanner sc = new Scanner(System.in);
        System.out.println("Сколько фирм в государстве? ");
        int n = sc.nextInt();
        int[] companyIncome = new int[n];

        System.out.println("Введите доходы фирм по порядку: ");
        for (int i = 0; i < companyIncome.length; i++) {
            companyIncome[i] = sc.nextInt();
        }

        int[] companyTaxes = new int[n];
        System.out.println("Введите процент налога фирм по порядку: ");
        for (int i = 0; i < companyTaxes.length; i++) {
            companyTaxes[i] = sc.nextInt();
        }

        double[] taxesArr = new double[n];
        int companyNum= 0;
        for (int i=0; i < taxesArr.length; i++){
            taxesArr[i] = companyIncome[i]*companyTaxes[i]*0.01;
        }
        System.out.println(Arrays.toString(taxesArr));

        double taxesMax = taxesArr[0];
        for (int i=0; i < taxesArr.length; i++){
            if (taxesArr[i] > taxesMax ) {
                taxesMax = taxesArr[i];
                companyNum = i;
            }
        }
        System.out.println("Наибольший доход приносит фирма " + (companyNum+1));
    }

    private  static void trafficLights(){


    }
}
