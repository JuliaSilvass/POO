public class ContaEspecial extends Conta{
    private float limite;

    public ContaEspecial(){
        super();
    }   

    public ContaEspecial(int numero, Pessoa correntista, float limite){
        super(numero, correntista);
        this.limite = limite;
    }

     public void setLimite(float limite){
        this.limite = limite;
    }

    public float getLimite(){
        return this.limite;
    }
}