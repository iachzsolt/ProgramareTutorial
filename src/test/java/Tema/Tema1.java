package Tema;

import org.testng.annotations.Test;

public class Tema1 {

    //Definesc cateva atribute pentru un calculator, crearea unei metode prin care se printeaza toate atributile.

    public String Producator_procesor;
    public String Tip_procesor;
    public String Model_procesor;
    public String Architectura;
    public Integer Numar_nuclee;
    public Double Frecventa_nominala;
    public Integer Frecventa_turbo;
    public Integer Catch;
    public Integer Tehnologie_procesor;
    public String Procesor_grafic_integrat;
    public Float  Diagonala_display;
    public String Format_display;
    public String Tehnologie_display;
    public Integer Rata_de_refresh;
    public Integer Luminozitate;
    public String Finisaj_display;
    public Boolean Touchscreen;
    public String Rezolutie;
    public Integer Capacitate_memorie;
    public String Tip_memorie;
    public Integer Numar_sloturi;
    public Integer Sloturi_ocupate;
    public Integer Frecventa_memorie;
    public Integer Cap_mem_max_sup;
    public String Tip_stocare;
    public Integer Capacitate_hdd;
    public Integer Viteza_hdd;
    public Integer Capacitate_ssd;
    public String Interfata_ssd;
    public String Tip_placa_video;
    public String Chipset_video;
    public String Model_placa_video;
    public Integer Capacitatea_memoriei_video;
    public String Tip_memorie_placa_vide;
    public String[] Tehnologii_placa_video;
    @Test
    public void Prezentare()
    {
        Producator_procesor = "Inter®";
        Tip_procesor = "i5";
        Model_procesor = "8300H";
        Architectura = "Coffe Lake";
        Numar_nuclee = 4;
        Frecventa_nominala = 2.3;
        Frecventa_turbo = 4;
        Catch = 8192;
        Tehnologie_procesor = 14;
        Procesor_grafic_integrat = "Intel® UHD Graphics 630";
        Diagonala_display = 15.6F;
        Format_display = "Full HD";
        Tehnologie_display = "IPS";
        Rata_de_refresh = 144;
        Luminozitate = 300;
        Finisaj_display = "Anti-Glare";
        Touchscreen = false;
        Rezolutie = "1920 x 1080";
        Capacitate_memorie = 8;
        Tip_memorie = "DDR4";
        Numar_sloturi = 2;
        Sloturi_ocupate = 1;
        Frecventa_memorie = 2666;
        Cap_mem_max_sup = 16;
        Tip_stocare = "HDD + SSD";
        Capacitate_hdd = 1;
        Viteza_hdd = 7200;
        Capacitate_ssd = 128;
        Interfata_ssd = "PCI Express";
        Tip_placa_video = "Dedicata";
        Chipset_video = "nVidia GeForce GTX";
        Model_placa_video = "GTX 1060";
        Capacitatea_memoriei_video = 6144;
        Tip_memorie_placa_vide = "GDDR5";
        Tehnologii_placa_video = new String[]{"DirectX 12", "nVidia CUDA", "nVidia PhysX", "nVidia Ansel", "nVidia GameStream", "nVidia FXAA", "GeForce Experience"};


        System.out.println("Specificatii");
        System.out.println();
        System.out.println("Procesor");
        System.out.println("Producator pocesor: " + Producator_procesor);
        System.out.println("Tip pocesor: " + Tip_procesor);
        System.out.println("Model pocesor: " + Model_procesor);
        System.out.println("Architectura: " + Architectura);
        System.out.println("Numar nuclee: " + Numar_nuclee);
        System.out.println("Frecventa nominala: " + Frecventa_nominala + " GHz");
        System.out.println("Frecventa turbo boost: " + Frecventa_turbo + " GHz");
        System.out.println("Catch: " + Catch + "KB");
        System.out.println("Tehnologie procesor: " + Tehnologie_procesor + "nm");
        System.out.println("Procesor grafic integrat: " + Procesor_grafic_integrat );
        System.out.println();
        System.out.println("Afisare");
        System.out.println("Diagonala dispaly: " + Diagonala_display + "inch");
        System.out.println("Format dispaly: " + Format_display);
        System.out.println("Tehnologie display: " + Tehnologie_display);
        System.out.println("Rata de refresh: " + Rata_de_refresh + "Hz");
        System.out.println("Luminozitate: " + Luminozitate + "niti");
        System.out.println("Finisaj display: " + Finisaj_display);
        if(Touchscreen == true){
            System.out.println("Touchscreen: Da");
        }else {
            System.out.println("Touchscreen: Nu");
        }
        System.out.println("Rezolutie: " + Rezolutie);
        System.out.println();
        System.out.println("Memorie");
        System.out.println("Capacitate memorie: " + Capacitate_memorie + " GB");
        //System.out.println("Tip memorie: " + Tip_memorie +);
        System.out.println("Numar sloturi: " + Numar_sloturi);
        System.out.println("Sloturi ocupate: " + Sloturi_ocupate);
        System.out.println("Frecventa: " + Frecventa_memorie + " MHz");
        System.out.println("Capacitate memorie maxima suportata: " + Cap_mem_max_sup + " GB");
        System.out.println();
        System.out.println("Hard disk");
        System.out.println("Tip stocare: " + Tip_stocare);
        System.out.println("Capacitate HDD: " + Capacitate_hdd);
        System.out.println("Viteza HDD: " + Viteza_hdd + " rpm");
        System.out.println("Capacitate SSD: " + Capacitate_ssd + " GB");
        System.out.println("Interfata SSD: " + Interfata_ssd);
        System.out.println();
        System.out.println("Placa video");
        System.out.println("Tip placa video: " + Tip_placa_video);
        System.out.println("Chipset video: " + Chipset_video);
        System.out.println("Model placa video: " + Model_placa_video);
        System.out.println("Capacitate memorie video: " + Capacitatea_memoriei_video + " MB");
        System.out.println("Tip memorie placa video: " + Tip_memorie_placa_vide);
        System.out.println("Tehnologii placa video: " + Tehnologii_placa_video[0] +"; " + Tehnologii_placa_video[1] +"; "+ Tehnologii_placa_video[2] +"; " + Tehnologii_placa_video[3] +"; " + Tehnologii_placa_video[4] +"; "+ Tehnologii_placa_video[5]+"; "+ Tehnologii_placa_video[6]);




    }
}

