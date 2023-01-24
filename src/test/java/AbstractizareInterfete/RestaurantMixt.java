package AbstractizareInterfete;

public class RestaurantMixt extends Restaurant implements InterfaceRestaurantVegan, InterfaceRestaurantCarne{
    public RestaurantMixt(String denumire, String felPrincipal, Integer numarStele) {
        super(denumire, felPrincipal, numarStele);
    }

    @Override
    public void cumparaCarne() {
        System.out.println("Cumpara carne");
    }

    @Override
    public void cresteAnimale() {
        System.out.println("Creste animale");
    }

    @Override
    public void preparaCarne() {
        System.out.println("Prepara carne");
    }

    @Override
    public void cresteLegume() {
        System.out.println("Creste legume");
    }

    @Override
    public void cumparaZarzavat() {
        System.out.println("Cumpara zarzavat");
    }

    @Override
    public void preparaLegume() {
        System.out.println("Prepara legume");
    }
}
