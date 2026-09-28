import java.util.Scanner;
/* Дано: в банкомате есть купюры номиналом 5000, 1000, 500, 100
Известно, сколько в наличии купюр каждого номинала
Пользователь вводит требуемую сумму
Вывести, сколько купюр каждого номинала он получит */

public class Lecture4ATM {

    public static void main(String[] args) {
        int n1 = 5000, n2 = 1000, n3 = 500, n4 = 100;
        int k1 = 3, k2 = 10, k3 = 7, k4 = 12;
        int x = inputSum();
        if (x <= totalMoney(n1, n2, n3, n4, k1, k2, k3, k4)) {
            int res1 = x / n1;
            if (res1 > k1) {
                res1 = k1;
            }
            x = x - res1 * n1;

            int res2 = x / n2;
            if (res2 > k2) {
                res2 = k2;
            }
            x = x - res2 * n2;

            int res3 = x / n3;
            if (res3 > k3) {
                res3 = k3;
            }
            x = x - res3 * n3;

            int res4 = x / n4;
            if (res4 > k4) {
                res4 = k4;
            }
            x = x - res4 * n4;

            System.out.println(res1 + " " + res2 + " " + res3 + " " + res4);
            System.out.println("x = " + x);
        }
        else
            System.out.println("А у нас в банкомате столько нет");
    }

    static int inputSum() {
        Scanner sc = new Scanner(System.in);
        System.out.println("введите сумму");
        int s = sc.nextInt();
        return s;
    }

    static int totalMoney(int nom1, int nom2, int nom3, int nom4,
                          int k1, int k2, int k3, int k4) {
        return nom1 * k1 + nom2 * k2 + nom3 * k3 + nom4 * k4;
    }
}
