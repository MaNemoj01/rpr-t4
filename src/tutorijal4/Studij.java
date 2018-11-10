package tutorijal4;

public class Studij {
    private Semetar[] spisakSemestara;
    private String imeStudija;
    private int brojSemestara;

    public Studij(String ime){
        setImeStudija(ime); setBrojSemestara(0); setSpisakSemestara(new Semetar[100]);
    }

    public void dodajSemestar(Semetar s){
        getSpisakSemestara()[getBrojSemestara()]=s;
        setBrojSemestara(getBrojSemestara()+1);
    }

    public Semetar[] getSpisakSemestara() {
        return spisakSemestara;
    }

    public void setSpisakSemestara(Semetar[] spisakSemestara) {
        this.spisakSemestara = spisakSemestara;
    }

    public String getImeStudija() {
        return imeStudija;
    }

    public void setImeStudija(String imeStudija) {
        this.imeStudija = imeStudija;
    }

    public int getBrojSemestara() {
        return brojSemestara;
    }

    public void setBrojSemestara(int brojSemestara) {
        this.brojSemestara = brojSemestara;
    }



    // napraviti da je ovo bazna klasa i napraviti izvedenu klasu  Plan Studija i u tom ce biti sadrzani obavezni predmet i plus predmeti na koje se student upise kao izborni!!
}
