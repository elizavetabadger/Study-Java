public class Seminar3 {

    public  static  void main(){
//        example1();
//        example2();
//        example3();
    }

    private  static void example1(){
        double x = 25, y = 16, z = 15;
        x = 42; // присваивание
        y -= 1; // присваивание с вычитанием
        z *= 10; // присваивание с умножением

        IO.println(x == y);
        IO.println(y == z);
        IO.println(z/10 == y);
    }

    private  static void example2(){
        double x = 25, y = 16, z = 15;
        double a = x + y/z;
        IO.println(a);
        double b = (x+y)/z;
        IO.println(b);
    }

    public   static double sum(double x, double y){
        return x+y;
    }

    private static void example3(){
            double x = 25, y = 16, z = 15;
            double c = z * sum(x,y); // сначала считается метод
            IO.println(c);
    }


}
