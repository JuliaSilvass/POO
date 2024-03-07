public class Conta{
    int numero;
    String correntista;
    float saldo;

    //construtor padrão (default)
    public Conta(){}

    // construtor sobrecarregado
    public Conta(int numero, String correntista, float saldo){
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = saldo;
    }

    //Outra sobrecarga do construtor
    public Conta(int numero, String correntista){
        this.numero = numero;
        this.correntista = correntista;
        this.saldo = 0.00f;
    }
    // Metodos 
    // metodo depositar
    public void depositar (float valor){
        this.saldo = this.saldo + valor;
    }
    //metodo sacar
    public boolean sacar (float valor){
        if(this.saldo - valor >= 0){
            this.saldo = this.saldo-valor;
            return true;
        }
        return false;
    }
}