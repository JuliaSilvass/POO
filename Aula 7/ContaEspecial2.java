public class ContaEspecial2 extends Conta{
    
    private float limite;

    public ContaEspecial2(){}   

    public ContaEspecial2(int numero, Pessoa correntista, float limite){
        this.setNumero(numero);
        this.setCorrentista(correntista);
        this.limite = limite;
    }

    public void setLimite(float limite){
        this.limite = limite;
    }

    public float getLimite(){
        return this.limite;
    }
    
}