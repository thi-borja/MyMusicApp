package br.com.thborja.MyMusicApp.modelos;

public class Musica extends Audio{
    private String album;
    private String artista;
    private String genero;
    private int fator;

    public Musica(String titulo, int duracaoEmSegundos,String album, String artista, String genero) {
        setTitulo(titulo);
        setDuracaoEmSegundos(duracaoEmSegundos);
        this.album = album;
        this.artista = artista;
        this.genero = genero;
    }

    public void imprime(){
        System.out.println(this.toString());
        System.out.println("\n");
    }

    @Override
    public String toString() {
        return getTitulo() + "\n" +
                " album: " + this.album + "\n" +
                " artista: " + this.artista + "\n" +
                " genero: " + this.genero + "\n" +
                " descricao: " + this.genero + "\n" +
                " duracao: " + this.getDuracaoEmSegundos() + "s" + "\n" +
                " reproducoes: " + this.getTotalDeReproducoes() + "\n" +
                " curtidas: " + this.getCurtidas() + "\n" +
                " nota: " + (double)this.getCurtidas()/this.getTotalDeReproducoes()*10
                ;
    }

}
