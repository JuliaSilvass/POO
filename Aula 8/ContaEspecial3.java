public class ContaEspecial3 extends Conta{

    private float limite;

    public ContaEspecial3(){
        super();
    }
 
 // So é possível acessar direto assim, pq em conta os atributos estão como protected
    public ContaEspecial3(int numero, Pessoa correntista, float limite){
        this.numero =  numero;
        this.correntista = correntista;
        this.limite = limite;
    }

     public void setLimite(float limite){
        this.limite = limite;
    }

    public float getLimite(){
        return this.limite;
    }
}