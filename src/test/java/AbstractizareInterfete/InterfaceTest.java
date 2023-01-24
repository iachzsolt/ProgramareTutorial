package AbstractizareInterfete;

import org.testng.annotations.Test;

public class InterfaceTest {

    @Test
    public void metodaTest(){

        Angajat Angajat1 = new Angajat("Ionut", "Adresa test", 40);
        Angajat1.Munceste();

        Student Student1 = new Student("Delia", "Adresa", 20);
        Student1.invata();

        AngajatStudent AngajatStudent1 = new AngajatStudent("Maria", "adresa21", 23);
        AngajatStudent1.Munceste();
        AngajatStudent1.invata();
    }
}
