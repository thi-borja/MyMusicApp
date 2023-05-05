package br.com.thborja.MyMusicApp.teste;

import br.com.thborja.MyMusicApp.modelos.Musica;
import br.com.thborja.MyMusicApp.modelos.Podcast;

public class Teste {
    public static void main(String[] args) {
        Musica musica1 = new Musica("Dethroned Messiah", 281,"Antichrist Reborn", "The Troops of Doom", "Metal Brasileiro");
        Musica musica2 = new Musica("I sat by the ocean", 243,"...Like Clockwork", "Queens Of The Stone Age", "Rock alternativo");
        Podcast podcast1 = new Podcast("Multiverso Genético", 3180,"Nerdcast","Hoje vamos falar sobre a genética no multiverso com a Genera! O seu eu de outra realidade seria geneticamente igual a você?");
        Podcast podcast2 = new Podcast("Episodio fake", 1920,"Nerdcast","Inventei um episodio nota boa");


        for (int i = 0; i < 125; i++) {
            musica1.curtir();
            for (int j = 0; j < 2; j++) {
                musica1.reproduzir();
            }
        }

        for (int i = 0; i < 140; i++) {
            musica2.curtir();
            for (int j = 0; j < 5; j++) {
                musica2.reproduzir();
            }
        }
        for (int i = 0; i < 450; i++) {
            musica2.curtir();
        }

        for (int i = 0; i < 325; i++) {
            podcast1.curtir();
            for (int j = 0; j < 3; j++) {
                podcast1.reproduzir();
            }
        }

        for (int i = 0; i < 325; i++) {
            podcast2.curtir();
            podcast2.reproduzir();
        }

        musica1.imprime();
        musica2.imprime();
        podcast1.imprime();
        podcast2.imprime();

    }
}
