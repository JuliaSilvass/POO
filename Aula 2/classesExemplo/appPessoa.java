public class appPessoa {
    public static void main(String args[]){
        Pessoa pessoa = new Pessoa();

        pessoa.nome = "Fulano";
        pessoa.idade = 25;
        pessoa.email = "fulano@gmail.com";
        pessoa.celular = 8435534;

        System.out.println("Nome: " + pessoa.nome);
        System.out.println("idade: " + pessoa.idade);
        System.out.println("email: " + pessoa.email);
        System.out.println("celular: " + pessoa.celular);

    }
}