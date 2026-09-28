import java.util.Arrays;
import java.util.Scanner;

public class Lecture4ATMvar2 {

    public static void main(String[] args) {
        //int n1 = 5000, n2 = 1000, n3 = 500, n4 = 100;
        int[] noms = {5000, 1000, 500, 100};
        //int k1 = 3, k2 = 10, k3 = 7, k4 = 12;
        int[] kolvo = {3, 10, 7, 2};
        int x = inputSum();
        int[] res= new int[4];

        if (x <= totalMoney(noms, kolvo)) {
            for (int i = 0; i < 4; i++) {
                res[i] = x / noms[i];
                if (res[i] > kolvo[i]) {
                    res[i] = kolvo[i];
                }
                x = x - res[i] * noms[i];
            }

            if(x == 0)
                System.out.println(Arrays.toString(res));
            else
                System.out.println("не удается выдать такую сумму");
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

    static int totalMoney(int[] nominals, int[] kolvo) {
        int s=0;
        for (int i = 0; i < nominals.length; i++) {
            s+= nominals[i] * kolvo[i];
        }
        return s;
    }
}
