package Tema.Tema4;

import java.util.List;

public class Album {

    public String Artist;
    public String NumeAlbum;
    public String Stil;
    public List <String> Piese;
    public Integer Anul;
    public Integer Pret;

    public Album(String artist, String numeAlbum, String stil, List<String> piese, Integer anul, Integer pret) {
        Artist = artist;
        NumeAlbum = numeAlbum;
        Stil = stil;
        Piese = piese;
        Anul = anul;
        Pret = pret;
    }

    public Album(String artist, String numeAlbum, Integer anul, Integer pret) {
        Artist = artist;
        NumeAlbum = numeAlbum;
        Anul = anul;
        Pret = pret;
    }

    public void infoAlbum(){
        System.out.println("Artistul este: " + Artist);
        System.out.println("Numele albumului este: " + NumeAlbum);
        if (Stil != null){
            System.out.println("Stilul este: " + Stil);
        }
        if (Piese != null){
            System.out.println("Piesele sunt: ");
            for (Integer index = 0; index < Piese.size(); index++) {
                System.out.println(Piese.get(index));
            }
        }
        System.out.println("Anul aparitiei este: " + Anul);
        System.out.println("Pretul albumului este: " + Pret + " lei");
    }


}
