public class Elevador {
    int totalAndares;
    int andarAtual;
    int capacidade;
    int numeroPessoasAtual;

    // 1º construtor
    public Elevador(int totalAndares, int capacidade){
        this.totalAndares = totalAndares;
        this.capacidade = capacidade;
        this.andarAtual = 0;
        this.numeroPessoasAtual = 0;
    }

    //Metodo subir 
    public boolean subir (){
        if (this.totalAndares == this.andarAtual){
            return false;
        } else {
            andarAtual ++;
            return true;
        }
    }

    //Metodo descer
    public boolean descer(){
        if(this.andarAtual < 0){
            return false;
        } else {
            andarAtual --;
            return true;
        }
    }

    //Metodo entrar(numero)
    public boolean entrar(int numero){
        if(numero > this.capacidade || numero < 0){
            return false;
        } else {
            numeroPessoasAtual += numero;
            return true; 
        }
    }
    
    //Método sair(numero
    public boolean sair( int numero){
        if (numero <= numeroPessoasAtual && numero > 0){
            numeroPessoasAtual -= numero;
            return true;
        } else {
            return false;
        }
    }
}
