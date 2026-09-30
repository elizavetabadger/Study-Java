public class Lecture5 {
    static  public void  main(){
        Cat cat1 = new Cat();
        cat1.meow();

        cat1.rename("Барсик");
        cat1.meow();
        cat1.rename( "Cat1");
        cat1.meow();
        System.out.println("Кота зовут - "+cat1.getName());

        Cat cat2 = new Cat();
        cat2.rename("Рыжик");
        cat2.setColor("Рыжий");
        cat2.meow();
        cat1.meow();
    }

}
