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
        System.out.printf("Saldo R$ %.2f" + conta1.saldo);

        System.out.println("Dados da conta 2");
        System.out.println("Número: " + conta2.numero);
        System.out.println("Correntista: " + conta2.correntista);
        System.out.printf("Saldo R$ %.2f" + conta2.saldo);

        System.out.println("Dados da conta 3");
        System.out.println("Número: " + conta3.numero);
        System.out.println("Correntista: " + conta3.correntista);
        System.out.printf("Saldo R$ %.2f" + conta3.saldo);
    
        
    }
}