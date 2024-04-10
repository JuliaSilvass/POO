public class Categoria{
    private String descricao;
    private float valor;

    // Construtores
    public Categoria(){}

    public Categoria(String descricao, float valor){
        this.setDescricao(descricao);
        this.setValor(valor);
    }

    //Metodos de acesso
    public void setDescricao (String descricao){
        this.descricao = descricao;
    }

    public void setValor (float valor){
        this.valor = valor;
    }

    public String getDescricao(){
        return this.descricao;
    }

    public float getValor(){
        return this.valor;
    }

}