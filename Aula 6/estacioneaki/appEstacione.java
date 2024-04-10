import java.util.Scanner;

public class appEstacione{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        Categoria categoria = new Categoria();
        Automovel automovel = new Automovel("", 0, categoria);
        Estadia estadia = new Estadia(automovel, 0);

        //Inserindo dados em categoria
        System.out.println("Bem Vindo ao estacione aki !!!");
        System.out.println("Qual a categoria do automóvel? ");
        categoria.setDescricao(teclado.nextLine());
        System.out.println("Qual o valor desta categoria? ");
        categoria.setValor(teclado.nextFloat());

        //Inserindo dados em automóvel
        System.out.println("Qual a placa do automóvel? ");
        teclado.nextLine();
        automovel.setPlaca(teclado.nextLine());
        System.out.println("Qual o rg do motorista? ");
        automovel.setRg(teclado.nextLong());

        //Inserindo dados em estadia
        System.out.println("Quantas horas ficou/pretende ficar? ");
        estadia.setHoras(teclado.nextInt());
        

        //Retornando ao usuário
        System.out.println(" ");
        System.out.println("O automóvel é: " + categoria.getDescricao());
        System.out.println("O valor/h é: " + categoria.getValor());
        System.out.println("A placa é: " + automovel.getPlaca());
        System.out.println("O RG é : " + automovel.getRg());
        System.out.println(" ");
        System.out.printf("A estadia durou %d horas, cujo valor é R$%.2f", estadia.getHoras(), estadia.calcularEstadia());
        System.out.println(" ");


    }
}