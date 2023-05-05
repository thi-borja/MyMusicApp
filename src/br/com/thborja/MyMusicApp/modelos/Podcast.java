package br.com.thborja.MyMusicApp.modelos;

public class Podcast extends Audio{
    private String host;
    private String descricao;
    private int fator;

    public Podcast(String titulo, int duracaoEmSegundos, String host, String descricao) {
        setTitulo(titulo);
        setDuracaoEmSegundos(duracaoEmSegundos);
        this.host = host;
        this.descricao = descricao;
    }

    public void imprime(){
        System.out.println(this.toString());
        System.out.println("\n");
    }

    @Override
    public String toString() {
        return this.getTitulo() + "\n" +
                " host: " + host + "\n" +
                " descricao: " + descricao + "\n" +
                " duracao: " + this.getDuracaoEmSegundos() + "s" + "\n" +
                " reproducoes: " + this.getTotalDeReproducoes() + "\n" +
                " curtidas: " + this.getCurtidas() + "\n" +
                " nota: " + (double)this.getCurtidas()/this.getTotalDeReproducoes()*10
                ;
    }
}
