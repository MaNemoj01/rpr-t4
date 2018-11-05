package tutorijal4;

public class IzborniPredmet extends Predmet {

    private String imePredmeta;
    private int ects;
    private Student[] listaStudenata;

    public  IzborniPredmet(String ime, int ects){

    }

    public String ispisiSpisakStudenta(){

        return "";
    }

    public void upisiStudenta(Student student){

    }


    public String getImePredmeta() {
        return imePredmeta;
    }

    public void setImePredmeta(String imePredmeta) {
        this.imePredmeta = imePredmeta;
    }

    public int getEcts() {
        return ects;
    }

    public void setEcts(int ects) {
        this.ects = ects;
    }

    public Student[] getListaStudenata() {
        return listaStudenata;
    }

    public void setListaStudenata(Student[] listaStudenata) {
        this.listaStudenata = listaStudenata;
    }
}
