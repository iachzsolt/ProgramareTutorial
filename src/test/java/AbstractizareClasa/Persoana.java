package AbstractizareClasa;

public abstract class Persoana {

    //O clasa abstracta poate sau nu sa contine metode abstracte
    //Clasa care mosteneste clasa abstracta => implementeaza toate metodele abstracte
    //Putem mosteni o singura clasa abstracta
    //0 clasa abstracta poate implementa o interfata
    //Intr-o clasa abstacta poti avea un constructor => dar nu putem face un obiect
    //Intr-o clasa abstaca putem sa avem metode public, private, protected
    //Metodele abstracte trebuie sa contina cuvantul abstract

    //Definim metode abstracte
    public abstract void munceste();
    public abstract void primesteSalariu();
    public abstract void mergeLaCurs();
    public abstract void primesteBursa();

    //Definim metode simple
    public void curs(){
        System.out.println("Asta e o metoda normala");
    }
}
