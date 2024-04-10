public class Filme{
    private String titulo;
    private int duracao;
    private Sala sala;

    //construtores 

    public Filme(){} 

    public Filme(String titulo, int duracao, Sala sala){
        this.titulo = titulo;
        this.duracao = duracao;
        this.sala = sala;
    }

    // metodo de acesso

    public String getTitulo(){
        return this.titulo;
    }

    public int getDuracao(){
        return this.duracao;
    }

    public void setTitulo(String titulo){
        this.titulo = titulo;
    }

    public void setDuracao(int duracao){
        this.duracao = duracao;
    }
}