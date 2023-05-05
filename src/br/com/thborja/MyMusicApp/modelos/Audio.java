package br.com.thborja.MyMusicApp.modelos;

public class Audio {
    private String titulo;
    private int duracaoEmSegundos;
    private int totalDeReproducoes;
    private int curtidas;

    public double getNota() {
        double nota = (double) this.getCurtidas() / this.getTotalDeReproducoes() * 10;
        return nota;
    }

    public String getTitulo() {
        return titulo;
    }



    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracaoEmSegundos() {
        return duracaoEmSegundos;
    }

    public void setDuracaoEmSegundos(int duracaoEmSegundos) {
        this.duracaoEmSegundos = duracaoEmSegundos;
    }

    public int getTotalDeReproducoes() {
        return totalDeReproducoes;
    }

    public int getCurtidas() {
        return curtidas;
    }

    public void curtir(){
        this.curtidas++;
    }

    public void reproduzir(){
        this.totalDeReproducoes++;
    }






}
