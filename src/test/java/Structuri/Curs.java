package Structuri;

import org.testng.annotations.Test;

public class Curs {

    //Structurile in programare sunt de doua feluri: alternative si repetitive.
    //Structurile alternative - se pot realiza folosind: if then else, switch case;
    //Structurile repetitive(loop) - se pot realiza folosind: for, while, do while, for each;

    @Test
    public void MetodaTest(){
//        VerificareNumar(15);
  //      VerificareNumar(9);
   //     VerificareNumar(-2);


       //VerificamNumarParPozitiv(4);
       // VerificamNumarParPozitiv(5);
        //VerificamNumarParPozitiv(-2);
       // VerificamNumarParPozitiv(-3);
        //VerificamNumarParPozitiv(0);

        ZiuaSaptamana(4);
        ZiuaSaptamana(2);
        ZiuaSaptamana(5);
    }
    //Verificam daca un numar este mai mare decat 10.

    public void VerificareNumar(Integer Numar){
        if (Numar > 10){
            System.out.println("Numarul este mai mare decat 10");
        } else {
            System.out.println("Numarul este mai mica decat 10");
        }
    }


    //Verificam daca un numar este par si pozitiv.

    public void VerificamNumarParPozitiv(Integer Numar){
        if(Numar > 0){
            if(Numar % 2 == 0){
                System.out.println("Numarul"+Numar+" este par si pozitiv.");
            } else {
                System.out.println("Numarul"+Numar+" este impar si pozitiv.");
            }
        }
        if (Numar < 0){
            if(Numar % 2 == 0){
                System.out.println("Numarul "+Numar+" este par si negativ.");
            } else {
                System.out.println("Numarul "+Numar+" este impar si negativ.");
            }
        }
        if(Numar == 0){
            System.out.println("Numarul "+Numar+" este egal cu 0.");
        }
    }

// Metoda cu Switch case.
//Afisam ziua curenta din saptamana.

    public void ZiuaSaptamana(Integer Numar){
        switch (Numar){
            case 1:
                System.out.println("Luni");
                break;
            case 2:
                System.out.println("Marti");
                break;
            case 3:
                System.out.println("Miercuri");
                break;
            case 4:
                System.out.println("Joi");
                break;
            default:
                System.out.println("Altceva");
        }
    }

    //
}

