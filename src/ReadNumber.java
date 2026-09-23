import java.util.Scanner;

public class ReadNumber {
    void main(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Введите значение a: ");
        int a = sc.nextInt();

        System.out.println("a = "+a);

        // Сейчас проще
        IO.println("--- Сейчас будем вводить по-новому ---");
        String sb = IO.readln("Введите значение sb: ");
        System.out.println("sb = "+ sb);
        System.out.println("(a+sb) = "+(a+sb)); // парсинг - распознавание строки в число

        int b = Integer.parseInt(sb);
        System.out.println("b = "+ b);
        System.out.println("(a+b) = "+(a+b));

        int c = Integer.parseInt(IO.readln("Введите значение c: "));
        System.out.println("c = "+ c);

        double sum = a+b+c;
        System.out.println("avg = "+ sum/3);
    }
}
