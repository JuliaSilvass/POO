public class appConta{
    public static void main(String args[]){
        Pessoa pessoa = new Pessoa("Fulano", "fulano@gmail.com", 59107205);
        Conta conta = new Conta(1987, pessoa);

        System.out.println("Número: " + conta.numero);
        System.out.println("Nome: " + conta.correntista.getNome());
        System.out.println("Email: " + conta.correntista.getEmail());
        System.out.println("Celular: " + conta.correntista.getCelular());
        System.out.printf("Saldo: R$ %.2f", conta.getSaldo());
    }
}