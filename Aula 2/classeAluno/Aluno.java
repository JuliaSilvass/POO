public class Aluno {
    long matricula;
    String nome;
    int idade;
    String curso;
    float mediaGeral;

    // Construtor que aceita todos os atributos como argumentos
    public Aluno(long matricula, String nome, int idade, String curso, float mediaGeral) {
        this.matricula = matricula;
        this.nome = nome;
        this.idade = idade;
        this.curso = curso;
        this.mediaGeral = mediaGeral;
    }

    
}
