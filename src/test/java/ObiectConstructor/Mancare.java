package ObiectConstructor;

import java.util.List;

public class Mancare {

    public String Nume;
    public String Descriere;
    public List <String> Ingrediente;
    public Integer Calorii;
    public Boolean DePost;

    //Declaram un constructor cu parametrii;

    public Mancare (String Nume, String Descriere, List <String> Ingrediente, Integer Calorii){
        this.Nume = Nume;
        this.Descriere = Descriere;
        this.Ingrediente = Ingrediente;
        this.Calorii = Calorii;
    }

    public Mancare(String nume, String descriere, List<String> ingrediente, Integer calorii, Boolean dePost) {
        Nume = nume;
        Descriere = descriere;
        Ingrediente = ingrediente;
        Calorii = calorii;
        DePost = dePost;

    }

    public void InfoMancare (){
        System.out.println("Numele mancarii este " + Nume);
        System.out.println("Descrierea mancarii este " + Descriere);
        System.out.println("Ingredientele pentru mancare sunt ");
        for (Integer index = 0; index < Ingrediente.size(); index++){
            System.out.println(Ingrediente.get(index));
        }
        System.out.println("Caloriile pentru mancare sunt " + Calorii);

        if(DePost != null && DePost){
            System.out.println("Mancarea este de post ");
        }

    }

}
