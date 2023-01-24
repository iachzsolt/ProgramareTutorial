package Multimi;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Craciun {
    @Test
    public void MetodaTest(){
//        MultimeNumeArray();
//        MultimeNumeLista();
//            MultimeValori();

        TariOrase();
    }

    //Array

    public void MultimeNumeArray(){
        String[] NumeCursanti = new String[5];
        NumeCursanti[0] = "Daniele";
        NumeCursanti[1] = "Liliana";
        NumeCursanti[2] = "Alex";
        NumeCursanti[3] = "Raul";
        NumeCursanti[4] = "Delia";

        for(Integer index = 0; index < NumeCursanti.length; index++){
            System.out.println(NumeCursanti[index]);
        }
    }

    //Lista

    public void MultimeNumeLista(){
        List<String> NumeCursanti = new ArrayList<>();
        NumeCursanti.add("Daniela");
        NumeCursanti.add("Liliana");
        NumeCursanti.add("Alex");
        NumeCursanti.add("Raul");

        for(Integer index = 0; index < NumeCursanti.size(); index++){
            System.out.println(NumeCursanti.get(index));
        }
    }

    //Hashmap
    //key = value

    public void MultimeValori(){
        //fotbal, cana, acadea
        HashMap<String, String> Obiecte = new HashMap<>();
        Obiecte.put("Sport", "fotban");
        Obiecte.put("Obiect", "cana");
        Obiecte.put("Dulciuri", "acadea");

        for(String Key: Obiecte.keySet()){
            System.out.println(Key + " " + Obiecte.get(Key));
        }

    }

    //Tari, orase

    public void TariOrase(){
        List<String> OraseRomania = new ArrayList<>();
        OraseRomania.add("Timisoara");
        OraseRomania.add("Valcea");
        OraseRomania.add("Oradea");
        List<String> OraseItalia = new ArrayList<>();
        OraseItalia.add("Roma");
        OraseItalia.add("Milano");
        OraseItalia.add("Venetia");
        List<String> OraseSpania = new ArrayList<>();
        OraseSpania.add("Barcelona");
        OraseSpania.add("Valencia");
        OraseSpania.add("Madrid");

        HashMap<String, List<String>> Tari = new HashMap<>();
        Tari.put("Romania", OraseRomania);
        Tari.put("Italia", OraseItalia);
        Tari.put("Spania", OraseSpania);

        for(String Key: Tari.keySet()){
            System.out.println(Key + " " + Tari.get(Key));
        }
    }
}
