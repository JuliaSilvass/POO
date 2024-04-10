public class appEscola {
    public static void main (String args[]){
        Professor professor = new Professor ("João da Silva", "joão@gmail.com", 119959565, 1234, "TI", "Programação");
        Aluno aluno = new Aluno ("Julia Silva", "julia@gmail.com", 119656575, 2365, "TADS");
        Disciplina disciplina = new Disciplina ("POO", professor, 120);

        System.out.println("Informações sobre disciplina");
        System.out.println("Nome: " + disciplina.getNome());
        System.out.println("Professor: " + disciplina.getProfessor().getNome());
        System.out.println("Horas: " + disciplina.getHoras());

    }
}