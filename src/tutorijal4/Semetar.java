package tutorijal4;

public class Semetar {
    private Predmet[] spisakPredmeta;
    private int brojSemestra;

    public  Semetar(int brojSemestra){

    }

    public Predmet[] getSpisakPredmeta() {
        return spisakPredmeta;
    }

    public void setSpisakPredmeta(Predmet[] spisakPredmeta) {
        this.spisakPredmeta = spisakPredmeta;
    }

    public int getBrojSemestra() {
        return brojSemestra;
    }

    public void setBrojSemestra(int brojSemestra) {
        this.brojSemestra = brojSemestra;
    }
}
