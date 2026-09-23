public class ManyExample { // Независят друг от друга
    void main(){
//        IO.println("Make example1");
//        example1(); // Вызов метода example1

        IO.println("Make example 2");
        example2(); // Вызов метода example2

        twoBandits();
    }

    static void example2(){
        IO.println("Make example 2");
    }

    void example1(){
        IO.println("Make example1");
        IO.println("Continuation example1");
    }

    static void twoBandits(){
        // https://acmp.ru/index.asp?main=task&id_task=33

        int shotByHarry = Integer.parseInt(IO.readln("Сколько банок прострелил Гарри: "));
        int shotByLarry = Integer.parseInt(IO.readln("Сколько банок прострелил Ларри: "));

        int totalPots = shotByHarry + shotByLarry -1;
        System.out.println("total pots = "+totalPots);

        IO.println("Гарри не прострелил "+ (totalPots-shotByHarry));
        IO.println("Ларри не прострелил "+ (totalPots-shotByLarry));

        IO.println((totalPots - shotByHarry)+ " " +(totalPots - shotByLarry));
    }
}
