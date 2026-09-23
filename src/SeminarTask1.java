
/* 1) создать проект, в котором изначально заданы значения 3 целочисленных переменных
с названиями a, b, c

вывести: сумму чисел, среднее арифметическое,
разности a - b, b - a, a - c, c - a, b - c, c - b
*/

public class SeminarTask1 {
    public static void main(String[] args) {
        int a = 1;
        int b = 2;
        int c = 3;

        int sum = a+b+c;
        int arithmetic = sum/3;
        int minusab = a - b;
        int minusba = b - a;
        int minusac = a - c;
        int minusca = c - a;
        int minusbc = b - c;
        int minuscb = c - b;

        System.out.println("Даны числа a = "+a+", b = "+b+", c = "+c+" Их sum = "+sum+ ", arithmetic ="+arithmetic+", minusab ="+minusab+", minusba ="+minusba+", minusac ="+minusac+", minusca ="+minusca+", minusbc ="+minusbc+", minuscb ="+minuscb);
    }
}

/*public class ThreeNums {

    static int[] data = {3, 5, 7};

//    вывести: сумму чисел, среднее арифметическое,
//    разности a - b, b - a, a - c, c - a, b - c, c - b

    public static void main(String[] args) {
        int sum = 0;
        for (int number : data) sum += number;
        System.out.println("сумма = " + sum);

        int average;
        if (data.length != 0) {
            average = sum / data.length;
            System.out.println("среднее = " + average);
        } else {
            System.out.println("нет данных");
        }

        // вывод типа `a - b = значение` можно было бы оформить,
        // если ввести данные в виде мапы
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < data.length; j++) {
                if (i != j) {
                    System.out.println(data[i] - data[j]);
                }
            }
        }
    }
}
 */
