public class appCinema{
    public static void main(String args[]){

        Sala sala = new Sala(10, "Amazonas");
        Filme filme = new Filme("Mulher marvilha", 130, sala);

        System.out.println("Filme: " + filme.getTitulo());
        System.out.println("Duração: " + filme.getDuracao());
        System.out.println("Sala: " + sala.getNome() + " | Número: " + sala.getNumero());
}
}