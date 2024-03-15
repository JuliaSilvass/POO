public class appConta {
    public static void main(String args[]){
        Conta conta1 = new Conta();
        Conta conta2 = new Conta(1029, "Fulano", 153.98f);
        Conta conta3 = new Conta(1130, "beltrano");

        conta1.numero=1745;
        conta1.correntista ="ciclano";
    
        System.out.println("Dados da conta 1");
        System.out.println("Número: " + conta1.numero);
        System.out.println("Correntista: " + conta1.correntista);
        System.out.printf("Saldo R$ %.2f\n", conta1.saldo);
        System.out.println();
        
        System.out.println("Dados da conta 2");
        System.out.println("Número: " + conta2.numero);
        System.out.println("Correntista: " + conta2.correntista);
        System.out.printf("Saldo R$ %.2f\n", conta2.saldo);
        System.out.println();

        System.out.println("Dados da conta 3");
        System.out.println("Número: " + conta3.numero);
        System.out.println("Correntista: " + conta3.correntista);
        System.out.printf("Saldo R$ %.2f\n", conta3.saldo);
        System.out.println();

        //utilizando o método depositar
        conta1.depositar(300f);
        conta2.depositar(100f);
        conta3.depositar(200f);

        //printando atulização do saldo
        System.out.printf("Saldo da conta 1 atualizado R$ %.2f\n", conta1.saldo);
        System.out.println();
        System.out.printf("Saldo da conta 2 atualizado R$ %.2f\n", conta2.saldo);
        System.out.println();
        System.out.printf("Saldo da conta 3 atualizado R$ %.2f\n", conta3.saldo);
        System.out.println();

        //Utilizando o metodo sacar
        if (conta1.sacar(250)){
            System.out.println("O saque foi realizado com sucesso na conta 1!");
            System.out.printf("Seu novo saldo é R$%.2f\n", conta1.saldo);
            System.out.println();
        } else {
            System.out.println("Não foi possível realizar o saque!\n");
            System.out.println();
        } 

        if (conta2.sacar(300)){
            System.out.println("O saque foi realizado com sucesso na conta 2!");
            System.out.printf("Seu novo saldo é R$%.2f\n", conta2.saldo);
        } else {
            System.out.println("Não foi possível realizar o saque!\n");
            System.out.println();
        } 

        if (conta3.sacar(50)){
            System.out.println("O saque foi realizado com sucesso na conta 3!");
            System.out.printf("Seu novo saldo é R$%.2f\n", conta3.saldo);
            System.out.println();
        } else {
            System.out.println("Não foi possível realizar o saque!\n");
            System.out.println();
        } 
    }
}