public class appConta {
    public static void main (String args[]){
        Pessoa pessoa = new Pessoa("Fulano", "fulano@gmail.com", 99895965);
        ContaEspecial c1 = new ContaEspecial (1235, pessoa);
        ContaEspecial2 c2 = new ContaEspecial2 (2564, pessoa);
        ContaEspecial3 c3 = new ContaEspecial3 (7754, pessoa);

        System.out.println("Número da conta c1: " + c1.getNumero());
        System.out.println("Número da conta c2: " + c2.getNumero());
        System.out.println("Número da conta c3: " + c3.getNumero());

        
    }
}