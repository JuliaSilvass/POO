public class Disciplina{
    private String nome;
    private Professor professor;
    private int horas;

    //construtores
    public Disciplina(){}

    public Disciplina(String nome, Professor professor, int horas){
        this.nome = nome;
        this.professor =  professor;
        this.horas = horas;
    }

    //metodos set
    public void setNome(String nome){
        this.nome = nome;
    }
    public void setProfessor(Professor professor){
        this.professor = professor;
    }
    public void setHoras(int horas){
        this.horas = horas;
    }

    //metodos get
    public String getNome(){
        return this.nome;
    }
    public Professor getProfessor(){
        return this.professor;
    }
    public int getHoras(){
        return this.horas;
    }
    
}