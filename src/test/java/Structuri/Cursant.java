package Structuri;

import com.sun.security.jgss.GSSUtil;
import org.testng.annotations.Test;

public class Cursant {

    //Structuri repetitive: for, while, do While, for each


    @Test
    public void MetodaTest() {
//        NumereFor();
//        NumereWhile();
//        NumereDivizibile();
        NumereImpareDivizibile(50);
    }

    //Afisam primele 10 numere.

    public void NumereFor(){
        for(Integer index = 0; index < 10; index++){
            System.out.println(index);
        }
    }

    public void NumereWhile(){
        Integer index = 0;
        while (index < 10){
            System.out.println(index);
            index++;
        }
    }
    public void NumereDoWhile(){
        Integer index = 0;

        do {
            System.out.println(index);
            index++;
        }
        while(index < 10);

    }

    //Afisam numere divizibile cu 3(interval 0-20)

    public void NumereDivizibile(){
        for (Integer index = 0; index < 20;index++){
            if(index % 3 == 0){
                System.out.println(index);
            }
        }
    }

    //Afisam numerele impare si divizibile cu 5 (interval random)

    public void NumereImpareDivizibile(Integer capat){
        for(Integer index = 0; index < capat; index++){
            if(index % 5 == 0 && index % 2 == 1){
                System.out.println(index);
            }
        }
    }
}
