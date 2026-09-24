
public class Seminar1Tasks {
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
    // 72 Журавлики
}
