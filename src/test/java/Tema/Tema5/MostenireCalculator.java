package Tema.Tema5;

import org.testng.annotations.Test;

public class MostenireCalculator {

    @Test
    public void MetodaTest(){

        Dell Vostro = new Dell("Dell", true, "Vostro 3510", "Alb", "Intel Core i3-1115G4", 4.1, 8, "Intel UHD", 256,1750);
        Vostro.InfoCalculator();
        Vostro.InfoDell();
        Vostro.CalcDupaCuloare();
    }
}
