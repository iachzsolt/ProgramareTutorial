package Lombok;

import org.testng.annotations.Test;

public class TelefontTest {

    @Test
    public void MetodaTest(){
        Telefon Nokia = new Telefon("Nokia", "3310", 2023, "plastic","Foarte buna");
        System.out.println(Nokia.getBrand());
        System.out.println(Nokia.getCamera());
        Nokia.setMaterial("aluminiu");
        System.out.println(Nokia.getMaterial());
        System.out.println(Nokia);
    }
}
