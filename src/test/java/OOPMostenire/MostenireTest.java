package OOPMostenire;

import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class MostenireTest {

    @Test
    public void MetodaTest(){
        //facem un obiect dacia
        List<String> DotariExterioareLogan = Arrays.asList("Geamuri electrice", "Aer conditionat");
        Dacia Logan = new Dacia("Dacia", "Logan", "Manuala", 10000, "Alb Metalizat", DotariExterioareLogan);
        Logan.InfoDacia();
        Logan.CalcPretFinal();
        Logan.ConducMasina();


        List<String> DotariInterioareSandero = Arrays.asList("Navigatie", "Incalzire scaun");
        Dacia Sandero = new Dacia("Dacia", "Sandero", "Automata", 7500, "Negru", DotariInterioareSandero);
        Sandero.InfoDacia();


        System.out.println("==Obiecte Audi==");
        List<String> DotariExterioareA3 = Arrays.asList("Geamuri electrice", "Aer conditionat");
        List<String> DotariInterioareA3 = Arrays.asList("Navigatie", "Incalzire scaun");

        Audi A3 = new Audi("Audi", "A3", "Manuala", 20000, DotariExterioareA3, DotariInterioareA3);
        A3.InfoAudi();
        A3.ConducMasina();


        List<String> DotariExterioareQ7 = Arrays.asList("Geamuri electrice", "Aer conditionat");
        List<String> DotariInterioareQ7 = Arrays.asList("Navigatie", "Incalzire scaun");
        Audi Q7 = new Audi("Audi", "Q7", "Automata", 43000, DotariExterioareQ7, DotariInterioareQ7);
        Q7.InfoAudi();

        System.out.println("==BMW==");

        BMW X5 = new BMW("BMW", "X5", "Automata", 55000, false);
        X5.InfoBMW();
        X5.AfisareMasini("masina");
        X5.AfisareMasini(123);


    }
}
