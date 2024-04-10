public class Sala{
    private int numero;
    private String nome;

    //Construtores
    public Sala(){}

    public Sala(int numero, String nome){
        this.numero = numero;
        this.nome = nome;
    }

    //metodos de acesso
    public int getNumero(){
        return this.numero;
    }

    public String getNome(){
        return this.nome;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setNome(String nome){
        this.nome = nome; 
    }
}