package AbstractizareInterfete;

public class AngajatStudent extends Persoana implements InterfaceAngajat, InterfaceStudent{

    public AngajatStudent(String nume, String adresa, Integer varsta) {
        super(nume, adresa, varsta);
    }

    @Override
    public void Munceste() {
        System.out.println("Angajatul student munceste");
    }

    @Override
    public void primesteSalar() {
        System.out.println("Angajatul student primeste salar");
    }

    @Override
    public void mergeAcasa() {
        System.out.println("Angajatul student merge acasa");
    }

    @Override
    public void invata() {
        System.out.println("Angajatul student invata");
    }

    @Override
    public void doarme() {
        System.out.println("Angajatul student doarme");
    }

    @Override
    public void primesteBursa() {
        System.out.println("Angajatul student primeste bursa");
    }
}
