public class Aluno extends Pessoa{
    private int matricula;
    private String curso;

    //Construtores
    public Aluno(){
        super();
    }

    public Aluno(String nome, String email, long celular, int matricula, String curso){
        super(nome, email, celular);
        this.matricula = matricula;
        this.curso = curso;
    }

    //Metodos set
    public void setMatricula(int matricula){
        this.matricula = matricula;
    }
    public void setCurso(String curso){
        this.curso = curso;
    }

    //Metodos get
    public int getMatricula(){
        return this.matricula;
    }
    public String getCurso(){
        return this.curso;
    }
}