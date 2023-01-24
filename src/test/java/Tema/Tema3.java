package Tema;

import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Tema3 {

    @Test
    public void Tema() {
//    PrimaCerinta(3, 2, 1);
//    PrimaCerinta(3, 2, 10);
//    PrimaCerinta(3, 2, 5);
//    Cerinta2(3);
//        Cerinta3(4);
//        Cerinta4();
//        Cerinta5();
//        Cerinta6(3);
//        Cerinta7();
//        Cerinta8();

        Retete();

    }

    public void PrimaCerinta(int Num1, int Num2, int Num3) {
        if (Num1 + Num2 > Num3) {
            System.out.println("Suma primelor 2 numere este: " + (Num1 + Num2) + ", si este mai mare decat numarul 3 care este: " + Num3);
        } else if (Num1 + Num2 < Num3) {
            System.out.println("Numarul trei este: " + Num3 + ", si este mai mare decat suma primelor 2 numere: " + (Num1 + Num2));
        } else {
            System.out.println("Suma primelor 2 numere este: " + (Num1 + Num2) + ", si este egala cu numarul 3: " + Num3);
        }
    }

    public void Cerinta2(Integer Number) {
        if (Number <= 5) {
            System.out.print("DA");
            System.out.print(" DA");
            System.out.print(" DA");
            System.out.print(" DA");
            System.out.print(" DA");
        } else {
            System.out.println("Numarul este mai mare decat 5.");
        }
   }
//    public void Cerinta3(Integer Number){
//        for(Integer i = 0; i < Number; i++){
//            if(Number == 5) {
//                System.out.print(" DA");
//            }
//        }
//        if(Number != 5){
//            System.out.println("Numarul este mai mic sau mare decat 5.");
//        }
//    }

    public void Cerinta3(Integer Number){
        Integer i = 0;
        while (i < Number){
            if(Number == 5) {
                System.out.print(" Da");
            }
            i++;
        }
        if(Number != 5){
            System.out.println("Numarul este mai mic sau mare decat 5.");
        }
    }


//    public void Cerinta4(){
//        for (Integer i = 0; i <= 15; i++){
//            if(i % 3 == 0 && i != 0) {
//                System.out.println(i);
//            }
//        }
//    }

//    public void Cerinta4(){
//        Integer i = 1;
//        while (i <= 15) {
//            if (i % 3 == 0) {
//                System.out.println(i);
//            }
//            i++;
//        }
//    }
//    public void Cerinta5(){
//        for(Integer i = 0; i <= 15; i++){
//            if(i % 5 == 0 && i != 0){
//                System.out.println(i);
//            }
//        }
//    }
    public void Cerinta5(){
        Integer i = 0;
        while (i <= 15){
            if(i % 5 == 0 && i != 0){
                System.out.println(i);
            }
            i++;
        }
    }

//    public void Cerinta6(Integer Number){
//        if(Number < 10){
//            for(Integer i = 1; i <= Number; i++){
//                if(i % 2 == 0){
//                    System.out.println(i);
//                }
//            }
//        }else {
//            System.out.println("Numarul este mult prea mare, introduce un numar mai mic decat 10!");
//        }
//    }
    public void Cerinta6(Integer Number){
        if(Number < 10){
            Integer i = 1;
            while (i <= Number){
                if(i % 2 == 0){
                    System.out.println(i);
                }
                i++;
            }
        }else {
            System.out.println("Numarul este mult prea mare, introduce un numar mai mic decat 10!");
        }
    }

    
//    public void Cerinta7(){
//        Integer Number = 0;
//        for(Integer i = 0; i <= 10; i++){
//            Number += i;
//
//        }
//        System.out.println(Number);
//    }

    public void Cerinta7(){
        Integer Number = 0;
        Integer i = 0;
        while (i <= 10){
            Number += i;
            i++;
        }
        System.out.println(Number);
    }

//    public void Cerinta8(){
//        Integer Number = 1;
//        for(Integer i = 1; i <= 5; i++){
//            Number *= i;
//        }
//        System.out.println(Number);
//    }

    public void Cerinta8(){
        Integer Number = 1;
        Integer i = 1;
        while (i <= 5){
            Number *= i;
            i++;
        }
        System.out.println(Number);
    }


    //Tema cu HashMap

    public void Felul1(){
        List<String> SupaDePui = new ArrayList<>();
        SupaDePui.add("1 gaina");
        SupaDePui.add("2 morcovi medii");
        SupaDePui.add("1 radacina pastarnac");
        SupaDePui.add("1 radacina patrunjel");
        SupaDePui.add("1 ceapa medie etc.");;
        List<String> SupaCartofi = new ArrayList<>();
        SupaCartofi.add("400g cartofi");
        SupaCartofi.add("1 legatura de ceapa verde");
        SupaCartofi.add("2-3 morcovi");
        SupaCartofi.add("1 pastranac");
        SupaCartofi.add("telina etc.");
        List<String> Ciorba = new ArrayList<>();
        Ciorba.add("300g fasole");
        Ciorba.add("morcov");
        Ciorba.add("patrunjel");
        Ciorba.add("ardei rosu");
        Ciorba.add("ceapa etc.");


        HashMap<String, List<String>> Ingrediente = new HashMap<>();
        Ingrediente.put("Supa de pui", SupaDePui);
        Ingrediente.put("Supa de cartofi", SupaCartofi);
        Ingrediente.put("Ciorba", Ciorba);

        for(String Key: Ingrediente.keySet()){
            System.out.println(Key + " " + Ingrediente.get(Key));
        }
    }

    public void Felul2() {

        List<String> PulpeCuCartofi = new ArrayList<>();
        PulpeCuCartofi.add("8 pulpe de inferioare de pui");
        PulpeCuCartofi.add("1 kg de cartofi");
        PulpeCuCartofi.add("sare");
        PulpeCuCartofi.add("piper");
        PulpeCuCartofi.add("boia dulce");
        PulpeCuCartofi.add("chimen seminte");
        PulpeCuCartofi.add("pudra de usturoi");
        PulpeCuCartofi.add("2 linguri de ulei");
        List<String> Chiftele = new ArrayList<>();
        Chiftele.add("750g carne tocata");
        Chiftele.add("1 ceapa");
        Chiftele.add("usturoi");
        Chiftele.add("piper");
        Chiftele.add("sare etc.");
        List<String> Snitel = new ArrayList<>();
        Snitel.add("2 bucati de piept de pui");
        Snitel.add("sare");
        Snitel.add("piper");
        Snitel.add("faina");
        Snitel.add("3 oua");
        Snitel.add("pesmet");

        HashMap<String, List<String>> Ingrediente = new HashMap<>();
        Ingrediente.put("Pulpe cu cartoif la cuptor", PulpeCuCartofi);
        Ingrediente.put("Chiftele", Chiftele);
        Ingrediente.put("Snitel", Snitel);

        for (String Key : Ingrediente.keySet()) {
            System.out.println(Key + " " + Ingrediente.get(Key));
        }
    }

    public void Deserturi(){
        List<String> Clatite = new ArrayList<>();
        Clatite.add("350g faina");
        Clatite.add("50g unt topit ");
        Clatite.add("3 oua");
        Clatite.add("500ml lapte rece etc.");
        List<String>PrajituraMere = new ArrayList<>();
        PrajituraMere.add("8 mere");
        PrajituraMere.add("1 cana faina");
        PrajituraMere.add("1 cana gris");
        PrajituraMere.add("1 cana zahar etc.");
        List<String> ChecDovleac = new ArrayList<>();
        ChecDovleac.add("2 oua");
        ChecDovleac.add("200g faina");
        ChecDovleac.add("200g dovleac gatit");
        ChecDovleac.add("praf de gatit etc.");

        HashMap<String, List<String>> Ingrediente = new HashMap<>();
        Ingrediente.put("Clatite", Clatite);
        Ingrediente.put("Prajitura cu mere", PrajituraMere);
        Ingrediente.put("Chec cu dovleac", ChecDovleac);

        for(String Key: Ingrediente.keySet()) {
            System.out.println(Key + " " + Ingrediente.get(Key));
        }

    }


    public void Retete(){
        System.out.println("Idei pentru felul 1:");
        System.out.println();
        Felul1();
        System.out.println();
        System.out.println("Idei pentru felul 2:");
        System.out.println();
        Felul2();
        System.out.println();
        System.out.println("Idei pentru desert: ");
        System.out.println();
        Deserturi();
    }
}

