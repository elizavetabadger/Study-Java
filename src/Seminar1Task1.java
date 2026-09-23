
/* 1) создать проект, в котором изначально заданы значения 3 целочисленных переменных
с названиями a, b, c

вывести: сумму чисел, среднее арифметическое,
разности a - b, b - a, a - c, c - a, b - c, c - b
*/

public class Seminar1Task1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int sum = a+b+c;
        var avg = (double)sum/3;
        int minusab = a - b;
        int minusba = b - a;
        int minusac = a - c;
        int minusca = c - a;
        int minusbc = b - c;
        int minuscb = c - b;

        System.out.println("Даны числа a = "+a+", b = "+b+", c = "+c+" Их sum = "+sum+ ", avg ="+avg+", minusab ="+minusab+", minusba ="+minusba+", minusac ="+minusac+", minusca ="+minusca+", minusbc ="+minusbc+", minuscb ="+minuscb);
    }
}
