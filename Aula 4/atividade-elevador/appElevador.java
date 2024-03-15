public class appElevador {
    public static void main(String args[]){
        Elevador elevador = new Elevador (5, 10);

        //Ingressando 6 pessoas
        if (elevador.entrar (6)){
            System.out.printf("Entrou! Tem %d pessoa no elevador!\n", elevador.numeroPessoasAtual);
            System.out.println();
        } else {
            System.out.println ("Não foi permitido a entrada!\n");
            System.out.printf("Total de pessoas: %d \n", elevador.numeroPessoasAtual);
            System.out.println();
        }

        //Subir um andar
        if(elevador.subir()){
            System.out.printf ("Estamos no %dº andar \n", elevador.andarAtual);
            System.out.println();
        } else {
            System.out.printf ("Não é possível subir, vocês esta no andar: %d\n", elevador.andarAtual);
            System.out.println();
        }

        //Ingressando 4 pessoas
        if (elevador.entrar (4)){
            System.out.printf("Entrou! Tem %d pessoa no elevador!\n", elevador.numeroPessoasAtual);
            System.out.println();
        } else {
            System.out.println ("Não foi permitido a entrada!\n");
            System.out.printf("Total de pessoas: %d \n", elevador.numeroPessoasAtual);
            System.out.println();
        }
        
        //Subir um andar
        if(elevador.subir()){
            System.out.printf ("Estamos no %dº andar \n", elevador.andarAtual);
            System.out.println();
        } else {
            System.out.printf ("Não é possível subir, vocês esta no andar: %d\n", elevador.andarAtual);
            System.out.println();
        }

        //Descer 5 pessoas
        if(elevador.sair(5)){
            System.out.printf("Saiu! Tem %d pessoa no elevador!\n", elevador.numeroPessoasAtual);
            System.out.println();
        } else {
            System.out.println ("Não foi permitido a saída!\n");
            System.out.printf("Total de pessoas: %d \n", elevador.numeroPessoasAtual);
            System.out.println();
        }

        //Subindo até o último andar
        for(int i = elevador.andarAtual; i < elevador.totalAndares; i++){
            //Subir um andar
            if(elevador.subir()){
                System.out.printf ("Estamos no %dº andar \n", elevador.andarAtual);
                System.out.println();
            } else {
                System.out.printf ("Não é possível subir, vocês esta no andar: %d\n", elevador.andarAtual);
                System.out.println();
            }
        }

        //Ingressando 3 pessoas
        if (elevador.entrar (3)){
            System.out.printf("Entrou! Tem %d pessoa no elevador!\n", elevador.numeroPessoasAtual);
            System.out.println();
        } else {
            System.out.println ("Não foi permitido a entrada!\n");
            System.out.printf("Total de pessoas: %d \n", elevador.numeroPessoasAtual);
            System.out.println();
        }

        //Descendo até o térreo
        for (int i = elevador.andarAtual; i > 0; i--){
            if(elevador.descer()){
                System.out.printf ("Estamos no %dº andar \n", elevador.andarAtual);
                System.out.println();
            } else {
                System.out.printf ("Não é possível descer, vocês esta no andar: %d\n", elevador.andarAtual);
                System.out.println();
            }
        }
    }
}