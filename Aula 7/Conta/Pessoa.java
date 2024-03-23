public class Pessoa {
    private String nome;
    private String email; 
    private long celular;

    public Pessoa (){}

    public Pessoa(String nome, String email, long celular){
        this.nome = nome;
        this.email = email;
        this.celular =  celular;
    }

    // metodos set para inserir
    public void setNome(String nome){
        this.nome = nome;
    }

    public void setEmail(String email){
        this.email = email;
    }

    public void setCelular(long celular){
        this.celular = celular;
    }

    //metodos get para ler
    public String getNome(){
        return this.nome;
    }
    public String getEmail(){
        return this.email;
    }
    public long getCelular(){
        return this.celular;
    }


}