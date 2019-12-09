import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class main {
    public static void main(String[] args) {


        List<String> list = new ArrayList<String>();
        list.add("Labas");

        Sarasas<Integer> tiesinisSarasas = new TiesinisSarasas<>();
        tiesinisSarasas.prideti(250);

        Skaiciuokle<Integer,Integer> skaicuokle = new Skaiciuokle<Integer, Integer>();
        skaicuokle.suma(20, 20);
        skaicuokle.setE(60);
        skaicuokle.setT(90);

        Skaitmuo skaitmuo = new Skaitmuo("Vienas",1);
        Skaitmuo skaitmuo2 = new Skaitmuo("Du",2);
        Skaitmuo skaitmuo3= new Skaitmuo("Trys",3);
        List<Skaitmuo> skaitmuoList = new ArrayList<>();
        skaitmuoList.add(skaitmuo);
        skaitmuoList.add(skaitmuo2);
        skaitmuoList.add(skaitmuo3);
        skaitmuoList.add(new Vienas("Vienas",1));

      List<Skaitmuo> skaitmenys = Arrays.asList(skaitmuo,skaitmuo2,skaitmuo3);
skaicuokle.printList(skaitmuoList);
        skaicuokle.spausdinamSkaicius();

        for (Object elem :list) {
            String str = (String) elem;
        }



    }
}
