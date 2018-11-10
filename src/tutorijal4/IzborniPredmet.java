package tutorijal4;

public class IzborniPredmet extends Predmet {

    private String imePredmeta;
    private int ects;
    private Student[] listaStudenata;
    private int brojStudenata;

    public  IzborniPredmet(String ime, int ects){
        setImePredmeta(ime); setEcts(ects); this.setBrojStudenata(0); setListaStudenata(new Student[100]);
    }

    public String ispisiSpisakStudenta(){
        String s ="";
        for(int i=0;i<brojStudenata;i++){
            s +=i+1 +". " + getListaStudenata()[i].toString() +"\n";
        }
        return s;
    }

    public void upisiStudenta(Student student){
        getListaStudenata()[brojStudenata++]=student;
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

    public int getBrojStudenata() {
        return brojStudenata;
    }

    public void setBrojStudenata(int brojStudenata) {
        this.brojStudenata = brojStudenata;
    }
}
