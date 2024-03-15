import java.util.Scanner;

public class appExemplo{
    public static void main(String args[]){
        Scanner teclado = new Scanner (System.in);
        Pessoa pessoa = new Pessoa();

        System.out.println("Digite seu nome: ");
        pessoa.nome = teclado.nextLine();    //Lê qualquer caractere até uma nova linha, ou seja pressionado enter

        System.out.println("Digite sua idade: ");
        int idade = teclado.nextInt();      //Lê somente inteiros

        System.out.println("Digite seu salário: ");
        float salario = teclado.nextFloat();   //Lê somente números float

        System.out.println("Digite seu email: ");
        teclado.nextLine(); //Limpa o buffer do teclado.
        pessoa.email = teclado.nextLine();

        System.out.println("Digite seu telefone: ");
        pessoa.celular = teclado.nextInt();

        System.out.println ("Seu nome é " + pessoa.nome);
        System.out.println("A sua idade é " + idade);
        System.out.println("Seu salário é %.2f" + salario);
        System.out.println("Seu email é " + pessoa.email);
        System.out.println("Seu telefone é " + pessoa.celular);
    }
}