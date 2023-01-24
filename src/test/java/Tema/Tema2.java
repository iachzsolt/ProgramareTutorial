package Tema;

import net.bytebuddy.asm.Advice;
import org.testng.annotations.Test;


import java.text.DecimalFormat;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;
import java.util.Locale;

public class Tema2 {
    public String HelloWord;
    public Integer Varsta;
    public String Prenume;
    public String Nume;
    public String Date;
    public String Time;
    public String Today;
    public Double Rezultat;
    public Double SumaTreiVariabile;
    public Integer ProdDouaNumereInt;
    public String Salut;
    public String Hello;

    public String Consoana;

    @Test
    public void Variables(){
        HelloWord = "Hello Word!";
        Varsta = 28;
        Prenume = "Zsolt";
        Nume = "Iachmanovski";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDateTime now = LocalDateTime.now();
        Date = String.valueOf(dtf.format(now));

        DateTimeFormatter ltm = DateTimeFormatter.ofPattern("HH:mm a");
        LocalTime currentTime = LocalTime.now();
        Time = String.valueOf(ltm.format(currentTime));

        DateTimeFormatter dnf = DateTimeFormatter.ofPattern("EEEE", Locale.ENGLISH);
        LocalDateTime today = LocalDateTime.now();
        Today = String.valueOf(dnf.format(today));

        Rezultat =  (double) ( 2 + ( 3 * 4 ) - 3 ) / 3;
        DecimalFormat numberFormat = new DecimalFormat("#.0");
        Double Variabila1 = 3.2;
        Double Variabila2 = 2.35;
        Double Variabila3 = 8.42;
        SumaTreiVariabile = Variabila1 + Variabila2 + Variabila3;
        int Numar1 = 6;
        int Numar2 = 8;
        ProdDouaNumereInt = Numar1 * Numar2;
        Salut = "Salut";
        Hello = "Hello";
        Consoana = "Z";

        System.out.println(HelloWord + " - Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("Varsta mea este: " + Varsta + " de ani. - Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("Prenumele meu este: " + Prenume + " - Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("Numele meu este: " + Nume + " - Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("Data de azi este: " + Date + " - Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("Ora este: " + Time + " - Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("Azi este: " + Today + " - Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("Cat face [2+(3*4)-3]/3 ?");
        System.out.println("Rezultatul corect este: {" + numberFormat.format(Rezultat) + "} - Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("Suma celor trei numere double este: " + SumaTreiVariabile + " - Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("Produsu a 2 numere integer este: " + ProdDouaNumereInt + " - Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("Stiu ca am calculat bine! " + numberFormat.format(Rezultat) + " - Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("Stiu ca am calculat bine! " + SumaTreiVariabile + " - Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("Stiu ca am calculat bine! " + ProdDouaNumereInt + " - Poti pleca acasa dupa ce iti verific munca!");
        System.out.println(Salut + "M - Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("H" + Hello + " - Poti pleca acasa dupa ce iti verific munca!");
        System.out.println("A" + Consoana + "na" + Consoana + " a" + Consoana + "re" + Consoana + " me" + Consoana + "re" + Consoana + ",pe"
        +Consoana + "re" + Consoana + ",pru" + Consoana + "ne" + Consoana + " - Poti pleca acasa dupa ce iti verific munca!");
    }
}
