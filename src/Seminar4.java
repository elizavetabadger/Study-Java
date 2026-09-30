public class Seminar4 {

    public static void main() {
//        task1();
//        matrix();
    }

    // Не запуская код определить, что выведет программа
    private static void task1(){
        int[] arr = {3, 4, 5, 5};
        double x = 0;
        for(int i=0; i<arr.length; i++){
            x += arr[i]*arr[i];
        }
        double y = x / arr.length;
        IO.println(y);
    }

    private static void matrix(){
        int[] array = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        //сделать матрицу 3*3, заполнить ее числами из array последовательно
        //вывести матрицу в наглядном виде на консоль

        int [][] matrix = new int[3][3];
        int iArr = 0;

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = array[iArr];
                iArr++; // индекс iArr увеличивается после каждого действия

                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
