package OOPMostenire;

import java.util.List;

public class Dacia extends Masina{

    private String Culoare;
    private List<String> DotariExterioare;

    public String getCuloare() {
        return Culoare;
    }

    public void setCuloare(String culoare) {
        Culoare = culoare;
    }

    public List<String> getDotariExterioare() {
        return DotariExterioare;
    }

    public void setDotariExterioare(List<String> dotariExterioare) {
        DotariExterioare = dotariExterioare;
    }

    public Dacia(String brand, String model, String transmisie, Integer pret, String Culoare, List<String> DotariExterioare) {
        //super = apeleaza construcotrului din clasa parinte
        super(brand, model, transmisie, pret);
        this.Culoare = Culoare;
        this.DotariExterioare = DotariExterioare;
    }

    public void InfoDacia(){
        InfoMasina();
        System.out.println("Culoarea este " + Culoare);
        System.out.println("Dotari exterioare sunt: " + DotariExterioare);
    }

    public void CalcPretFinal(){
        Integer PretFinal;
        if(Culoare.contains("Metalizat")){
            PretFinal = getPret() + 500;
        } else {
            PretFinal = getPret() + 200;
        }

        //Calculam pretul pe baza dotarilor
        for (String Dotare: DotariExterioare){
            switch (Dotare){
                case "Geamuri electrice":
                    PretFinal = PretFinal + 700;
                    break;
                case "Aer conditionat":
                    PretFinal = PretFinal + 800;
                    break;
            }
        }
        System.out.println("Pretul final al masinii: " + PretFinal);
    }

    //Suprascriu metoda din parinte

    public void ConducMasina(){
      switch (getModel()){
          case "Logan":
              System.out.println("Loganul se conduce pe stanga");
              break;
          case "Sandero":
              System.out.println("Sandero se conduce pe dreapta");
              break;
      }
    }



}
