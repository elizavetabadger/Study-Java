import java.util.Scanner;

public class Lecture5 {
    static  public void  main(){
//        Cat cat1 = new Cat();
//        cat1.meow();
//
//        cat1.rename("Барсик");
//        cat1.meow();
//        cat1.rename( "Cat1");
//        cat1.meow();
//        System.out.println("Кота зовут - "+cat1.getName());
//
//        Cat cat2 = new Cat();
//        cat2.rename("Рыжик");
//        cat2.setColor("Рыжий");
//        cat2.meow();
//        cat1.meow();

        Rectangle rect0 = new Rectangle(0.5, 2.3);
        System.out.println("периметр rect0 равен "+rect0.calcPerimeter());
        Rectangle rect1 = inputRectangle();
        System.out.println("периметр rect1 равен "+rect1.calcPerimeter());
        System.out.println("площадь rect1 равна "+rect1.calcArea());
    }

    static Rectangle inputRectangle() {
        Scanner scanner = new Scanner(System.in);
        double a, b;
        do {
            System.out.println("введите положительные длину и ширину");
            a = scanner.nextDouble();
            b = scanner.nextDouble();
        } while (a <= 0 || b <= 0);

        Rectangle r = new Rectangle(a, b);
        return r;
    }

}
