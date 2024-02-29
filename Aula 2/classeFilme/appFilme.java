public class appFilme {
    public static void main(String args[]){
        Filme filme = new Filme();
        Filme filme2 = new Filme();
        Filme filme3 = new Filme();

        filme.titulo = "harry potter";
        filme.genero = "fantasia";
        filme.ano = 2000;
        filme.duracao = 2;
        filme.sinopse = "menino chato que mora debaixo da escada";
        filme.preco = 1.50;

        filme2.titulo = "jogos vorazes";
        filme2.genero = "fantasia";
        filme2.ano = 2013;
        filme2.duracao = 1;
        filme2.sinopse = "menina que vai pra selva";
        filme2.preco = 2.50;

        filme3.titulo = "one piece";
        filme3.genero = "anime";
        filme3.ano = 2005;
        filme3.duracao = 3;
        filme3.sinopse = "pirata que estica";
        filme3.preco = 3.50;

        System.out.println("Título: " + filme.titulo);
        System.out.println("Genero: " + filme.genero);
        System.out.println("Ano: " + filme.ano);
        System.out.println("Duração : " + filme.duracao);
        System.out.println("Sinopse: " + filme.sinopse);
        System.out.println("Preço: " + filme.preco);
        System.out.println("  ");

        System.out.println("Título: " + filme2.titulo);
        System.out.println("Genero: " + filme2.genero);
        System.out.println("Ano: " + filme2.ano);
        System.out.println("Duração : " + filme2.duracao);
        System.out.println("Sinopse: " + filme2.sinopse);
        System.out.println("Preço: " + filme2.preco);
        System.out.println("  ");

        System.out.println("Título: " + filme3.titulo);
        System.out.println("Genero: " + filme3.genero);
        System.out.println("Ano: " + filme3.ano);
        System.out.println("Duração : " + filme3.duracao);
        System.out.println("Sinopse: " + filme3.sinopse);
        System.out.println("Preço: " + filme3.preco);

        if(filme.preco > filme2.preco){
            if (filme.preco > filme3.preco) {
                System.out.println("O " + filme.titulo + " é o filme mais caro!");               
            }
        } else {
            if (filme2.preco > filme3.preco) {
                System.out.println("O " + filme2.titulo + " é o filme mais caro!");
            } else {
                System.out.println("O " + filme3.titulo + " é o filme mais caro!");
            }
        }


    }
    }
 