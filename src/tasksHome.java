import java.util.Scanner;

public class tasksHome {

    public  static void main(){
 //       flovers();
//        conditioner();

    }

    private static void flovers(){
        // https://acmp.ru/index.asp?main=task&id_task=504
        int k = Integer.parseInt(IO.readln("Сколько дней? "));
//        Начальное состояние GCV
        String left = "G", center = "C", right = "V";
//                Повторить k раз:
        for (int i = 0; i < k; i++){
            // Маша делает перестанову
            String taburet = right;
            right = center;
            center = taburet;
            // Таня делает перестановку
            taburet = left;
            left = center;
            center = taburet;
        }
        IO.println(left + center +right);
    }

    private static void conditioner(){

        Scanner sc = new Scanner(System.in);
        System.out.println("Температура в комнате: ");
        int tRoom = sc.nextInt();
        if (tRoom > 50 || tRoom < -50){
            System.out.println("Неверные параметры температуры");
        } else {
            System.out.println("Желаемая температура: ");
        }

        int tCond = sc.nextInt();
        if (tCond > 50 || tCond < -50){
            System.out.println("Неверные параметры температуры");
        } else {
            System.out.println("Режим кондиционера: ");
        }
        sc.nextLine(); // Очищаем буфер
        String tMode = sc.nextLine();

        if (tMode.equals("fan")){
            System.out.println("Температура через 1 час: "+tRoom);
        } else if (tMode.equals("freeze") && tRoom > tCond){
            System.out.println("Температура через 1 час: "+tCond);
        } else if (tMode.equals("freeze") && tRoom < tCond){
            System.out.println("Температура через 1 час: "+tRoom);
        } else if (tMode.equals("heat") && tRoom < tCond){
            System.out.println("Температура через 1 час: "+tRoom);
        } else if (tMode.equals("heat") && tRoom > tCond){
            System.out.println("Температура через 1 час: "+tCond);
        } else {
            System.out.println("Температура через 1 час: "+tCond);
        }
    }
}
