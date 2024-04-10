public class Conta{
    protected int numero;
    protected Pessoa correntista;
    protected float saldo;

    public Conta(){}

    public Conta(int numero, Pessoa correntista){
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = 0.00f;
    }

    public void setNumero(int numero){
        this.numero = numero;
    }

    public void setCorrentista(Pessoa correntista){
        this.correntista = correntista;
    }

    public int getNumero(){
        return this.numero;
    }

    public Pessoa getCorrentista(){
        return this.correntista;
    }

    public void depositar(float valor){
        this.saldo += valor;
    }
    public boolean sacar(float valor){
        if(this.saldo - valor >= 0){
            this.saldo -= valor;
            return true;
        }
        return false;
    }

}