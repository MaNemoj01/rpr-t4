package tutorijal4;

public class Student {
    private String ime;
    private String prezime;
    private  int brojIndeksa;

    public  Student (String ime, String prezime, int brojIndeksa){

    }

    @Override
    public String toString(){

        return "";
    }

    public String getIme() {
        return ime;
    }

    public void setIme(String ime) {
        this.ime = ime;
    }

    public String getPrezime() {
        return prezime;
    }

    public void setPrezime(String prezime) {
        this.prezime = prezime;
    }

    public int getBrojIndeksa() {
        return brojIndeksa;
    }

    public void setBrojIndeksa(int brojIndeksa) {
        this.brojIndeksa = brojIndeksa;
    }
}
