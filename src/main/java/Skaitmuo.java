public class Skaitmuo {
    String pavadinimas;
    int skaicius;

    public Skaitmuo(String pavadinimas, int skaicius) {
        this.pavadinimas = pavadinimas;
        this.skaicius = skaicius;
    }

    @Override
    public String toString() {
        return "Skaitmuo{" +
                "pavadinimas='" + pavadinimas + '\'' +
                ", skaicius=" + skaicius +
                '}';
    }

    public String getPavadinimas() {
        return pavadinimas;
    }

    public void setPavadinimas(String pavadinimas) {
        this.pavadinimas = pavadinimas;
    }

    public int getSkaicius() {
        return skaicius;
    }

    public void setSkaicius(int skaicius) {
        this.skaicius = skaicius;
    }
}
