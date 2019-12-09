import java.util.List;

public class Skaiciuokle<T extends Integer, E extends Integer> {

    T t;
    E e;


    public T getT() {
        return t;
    }

    public void setT(T t) {
        this.t = t;
    }

    public E getE() {
        return e;
    }

    public void setE(E e) {
        this.e = e;
    }

    public void suma(T a, T b){



        System.out.println(a.longValue()+b.longValue());


    }

    public void spausdinamSkaicius(){

        System.out.println("Pirmas:"+t.getClass().getSimpleName()+" Antras: "+t.getClass().getSimpleName());

    }

    public <C extends Skaitmuo> void printList(List<C> list){
        for (C elem : list) {
            System.out.println(elem.getPavadinimas() + ":" +elem.getSkaicius());

        }



    }





}
