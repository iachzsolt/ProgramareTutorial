package OOPMostenire;

import java.util.List;

public class Audi extends Masina{

    public List<String> DotariExterioare;
    public List<String> DotariInterioare;
    public Audi(String brand, String model, String transmisie, Integer pret, List<String> DotariExterioare,List<String> DotariInterioare) {
        super(brand, model, transmisie, pret);
        this.DotariExterioare = DotariExterioare;
        this.DotariInterioare = DotariInterioare;
    }

    public void InfoAudi(){
        InfoMasina();
        System.out.println("Dotari exterioarea sunt " + DotariExterioare);
        System.out.println("Dotari interioare sunt " + DotariInterioare);
    }

    //Suprascriem metoda de conducere

    public void ConducMasina(){
        System.out.println("Audi-ul se conduce pe dreapta");
    }

}
