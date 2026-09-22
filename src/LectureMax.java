import java.util.Random;

public class LectureMax {

    public static void main(String[] args) {

        Random random = new Random();
        int a = random.nextInt(10);
        int b = random.nextInt(10);
        int c = random.nextInt(10);
        int max;

        if (a > b) {
            if (a > c) {
                max = a;
            }
            else max = c;
        }
        else {
            if (b > c) {
                max = b;
            }
            else max = c;
        }

        System.out.println("Из трех чисел a = "+a+ ", b = "+b+ ", c = "+c+ ", max = " +max);
    }
}