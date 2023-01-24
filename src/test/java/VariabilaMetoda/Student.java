package VariabilaMetoda;

import org.testng.annotations.Test;

public class Student {

    //Asta este un comentariu
    //Clasa = sablon care contine variabiel si metode
    //Intr-un fisier java putem avea mai multe clase diferentiate prin numele lor. (nu ii un lucru bun
    //sa ai mai multe clase intr-un fisier)
    //O clasa trebuie sa aiba un nume
    //O clasa se recunoaste dupa cuvantul  class
    //Tot timpul o clasa trebuie sa fie publica
    //Variabila = atributul unei clase
    //Variabilele sunt de doua feluri: global si local
    //Variabila globala este vizibila peste tot in program
    //Variabila locala este vizibila doar unde o declari

    public String Nume;
    public String Prenume;
    public String Adresa;
    public Integer Varsta;
    public Double Inaltime;
    public Float Greutate;
    public Character Sex;
    public Boolean Este_angajat;

    //Metoda este egal cu actiune la nivel de clasa
    //Metodele sunt de 2 feluri: void, return

    @Test
    public void Prezentare_student()
    {
        Nume = "Iachmanovski";
        Prenume = "Zsolt";
        Adresa = "Oradea";
        Varsta = 28;
        Inaltime = 1.80;
        Greutate = 81.5f;
        Sex = 'M';
        Este_angajat = true;

        //Print afiseaza pe tastatura si ramane pe acelasi rand
        //Println afiseaza si sare la randul urmator
        //Daca vrem sa legam doua siruri de caractere folosim conceptul de concatenare (+)

        System.out.println("Numele studentului este: " + Nume);
        System.out.println("Prenumele studentului este: " + Prenume);
        System.out.println("Adresa este: " + Adresa);
        System.out.println("Varsta este: " + Varsta);
        System.out.println("Greutatea este: " + Greutate);
        System.out.println("Sexul este: " + Sex);
        System.out.println("Studentul este angajat? " + Este_angajat);


    }
    @Test
    public void Adaugare_nume()
    {
        //Declaram o variabila locala
        String Prenume2 = "Alex";
        Nume = "Iachmanovski";
        Prenume = "Zsolt";
        System.out.println("Numele complet este: " + Nume + " " + Prenume + " " + Prenume2);
        System.out.println("Bonusul de craciun este: " + String.format("%.3f", getBonus()));
    }


    //Facem o metoda cu return

    public Double getBonus(){
        Double Bonus = 1.000;
        return Bonus;
    }
}
