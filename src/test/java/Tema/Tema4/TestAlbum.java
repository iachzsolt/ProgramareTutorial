package Tema.Tema4;

import Tema.Tema4.Album;
import org.testng.annotations.Test;

import java.util.Arrays;
import java.util.List;

public class TestAlbum {

    @Test
    public void MetodaTest(){
        List<String> PieseKendrickLamar = Arrays.asList("DNA.", "BLOOD.", "HUMBLE.", "GOD.");
        Album KendrickLamar = new Album("Kendrick Lamar", "DAMN", "Hip-hop", PieseKendrickLamar, 2017, 50);
        KendrickLamar.infoAlbum();

        System.out.println("--------------------------------------------");

        List<String> PieseMetallica = Arrays.asList("Fuel", "Devil's Dance", "The Unforgiven II", "Fixxer");
        Album Metallica = new Album("Metallica", "Reload", "Metal", PieseMetallica, 1997, 56);
        Metallica.infoAlbum();

        System.out.println("--------------------------------------------");

        List<String> PieseNetsky = Arrays.asList("Hold On", "Destiny", "Free",  "Broken Bottles");
        Album Netsky = new Album("Netsky", "Second Nature", "Drum&Bass", PieseNetsky, 2020, 34);
        Netsky.infoAlbum();

        System.out.println("--------------------------------------------");


        List<String> PieseDuaLipa = Arrays.asList("Future Nostalgia", "Cool", "Love Again", "Boys will be boys");
        Album DuaLipa = new Album("Dua Lipa", "Future Nostalgia", "Pop", PieseDuaLipa, 2020, 45);
        DuaLipa.infoAlbum();

        System.out.println("--------------------------------------------");

        Album BugMafia = new Album("B.U.G. MAFIA", "Strazile", 2005,30);
        BugMafia.infoAlbum();
    }
}
