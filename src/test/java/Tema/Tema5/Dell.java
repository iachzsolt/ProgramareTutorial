package Tema.Tema5;

public class Dell extends Calculator{

    private String Culoare;
    private Double VitezaProcesor;

    public String getCuloare() {
        return Culoare;
    }

    public void setCuloare(String culoare) {
        Culoare = culoare;
    }

    public Double getVitezaProcesor() {
        return VitezaProcesor;
    }

    public void setVitezaProcesor(Double vitezaProcesor) {
        VitezaProcesor = vitezaProcesor;
    }

    public Dell(String brand, Boolean laptop, String model, String culoare, String processor, Double vitezaProcesor , Integer ram, String modelCardVideo, Integer spatiuDeStocare, Integer pret) {
        super(brand, laptop, model, processor, ram, modelCardVideo, spatiuDeStocare, pret);

        this.Culoare = culoare;
        this.VitezaProcesor = vitezaProcesor;
    }
    public void InfoDell(){
        System.out.println("Are culoare de: " + Culoare);
        System.out.println("Procesorul are viteza de: " + VitezaProcesor + " GHz");
    }
    public void CalcDupaCuloare(){
        Integer PretNou = null;
        if (Culoare.contains("Alb")) {
            PretNou = getPret() + 15;
        } 
        if (Culoare.contains("Gri")){
            PretNou = getPret() + 5;
        }
        System.out.println("Pretul nou este: " + PretNou);
    }
}
