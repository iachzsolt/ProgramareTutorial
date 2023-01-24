package AbstractizareInterfete;

public class Persoana {

    //Absrtactizare = conceptul prin care definim comportamentul unei clase
    //Acest concept se poate realiza in Java cu interfete sau clase abstracte
    //Interfata = colectie de metode care sunt doar abstracte (nu au body)
    //Recunoastem o interfata dupa cuvantul "Interface"
    //Intr-o interfate nu avem constructor -> nu putem face un obiect
    //Clasa care implementeaza interfata -> trebuie sa implementeze toate metodele interfetei
    //O clasa abstraca poate sa implementeze o interfata
    //O clasa poate sa implementeze n interfete
    //O interfata poate sa mosteneasca o alta interfata
    //Toate metodele din interfata sunt publice

    private String nume;
    private String adresa;
    private Integer varsta;

    public Persoana(String nume, String adresa, Integer varsta) {
        this.nume = nume;
        this.adresa = adresa;
        this.varsta = varsta;
    }

    public String getNume() {
        return nume;
    }

    public void setNume(String nume) {
        this.nume = nume;
    }

    public String getAdresa() {
        return adresa;
    }

    public void setAdresa(String adresa) {
        this.adresa = adresa;
    }

    public Integer getVarsta() {
        return varsta;
    }

    public void setVarsta(Integer varsta) {
        this.varsta = varsta;
    }
}
