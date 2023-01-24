package OOPMostenire;

public class Masina {

    //OOP = Object oriented programing
    //Sunt 4 concepte = mostenire, abstractizra, incapsulare, polimorfism
    //Mostenire = conceptul prin care o clasa mosteneste o alta clasa
    //Clasa care mosteneste se numeste clasa copil
    //Clasa care este mostenita se numeste clasa parinte
    //Mostenirea se face cu cuvantul extends
    //In java o clasa poate sa mosteneasca o singura clasa
    //In momentul in care o clasa mosteneste o alta clasa => trebuie sa apelam prima data la constructorul din parinte
    //In momentul in care o clasa mosteneste o alta clasa => putem accesa orice variabila/metoda din clasa parinte


    //Aplicam conceptul de incapsularea datelor
    //Incapsularea datelor = coneptul prin care tinem departe de exterior valorile variabilelor pe care nu vrem sa le modificam
    //Private = acces control care restrictioneaza vizibiliatea variabile la nivel de clasa unde este declarata
    //Ca sa accesam / modificam valorile unor variabile private ne folosim pe conceptul get si set


    //Polimorfism = conceptul prin care o metoda poate avea mai multe forme
    //Polimorfism este de doua tipuri: dinamic (override) si static (overload)
    //Polimorfism dinamic = intr-o ierarhie de clase optinute prin mostenire o metoda poate avea mai multe implementari
    //Polimorfism dinamic se amplica mereu cu mostenirea
    //Polimorfism static = o metoda se poate diferentia prin numarul sau tipul parametrilor

    private String Brand;
    private String Model;
    private String Transmisie;
    private Integer Pret;

    public Masina(String brand, String model, String transmisie, Integer pret) {
        Brand = brand;
        Model = model;
        Transmisie = transmisie;
        Pret = pret;
    }

    //Get si Set


    public String getBrand() {
        return Brand;
    }

    public String getModel() {
        return Model;
    }

    public String getTransmisie() {
        return Transmisie;
    }

    public Integer getPret() {
        return Pret;
    }

    public void setBrand(String brand) {
        Brand = brand;
    }

    public void setModel(String model) {
        Model = model;
    }

    public void setTransmisie(String transmisie) {
        Transmisie = transmisie;
    }

    public void InfoMasina(){
        System.out.println("Brandul este " + Brand);
        System.out.println("Modelul este " + Model);
        System.out.println("Transmisia este " + Transmisie);
        System.out.println("Pretul este " + Pret);
    }


    //Polimorfism dinamic

    public void ConducMasina(){
        System.out.println("Masina se poate conduce");
    }
}
