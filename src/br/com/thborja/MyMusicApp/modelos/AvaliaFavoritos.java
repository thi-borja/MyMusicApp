package br.com.thborja.MyMusicApp.modelos;

public class AvaliaFavoritos {
    public void inclui(Audio audio){
        if(audio.getNota()>8){
            System.out.println("Bom gosto!");
        } else if (audio.getNota()>4) {
            System.out.println("Audivel...");
        } else if (audio.getNota()>0) {
            System.out.println("Pessimo...");
        }
    }

}
