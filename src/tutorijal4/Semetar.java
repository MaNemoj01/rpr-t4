package tutorijal4;

public class Semetar {
    private Predmet[] spisakPredmeta;
    private int brojSemestra;
    private int brojPredmeta;

    public  Semetar(int brojSemestra){
        setBrojSemestra(brojSemestra);
        setBrojPredmeta(0);
    }

    public void dodajPredmet(Predmet p){
        getSpisakPredmeta()[getBrojPredmeta()] = p;
        setBrojPredmeta(getBrojPredmeta()+1);
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

    public int getBrojPredmeta() {
        return brojPredmeta;
    }

    public void setBrojPredmeta(int brojPredmeta) {
        this.brojPredmeta = brojPredmeta;
    }
}
