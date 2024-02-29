public class appTurma {
    public static void main(String args[]){
        Aluno aluno[] = new Aluno[5]; // criando um array para armazenar os alunos
        
        aluno[0] = new Aluno(1234, "João", 15, "Agro", 9.75f);
        aluno[1] = new Aluno(5678, "Maria", 14, "Agro", 8.5f);
        aluno[2] = new Aluno(9101, "Pedro", 16, "Agro", 10f);
        aluno[3] = new Aluno(1213, "Thiago", 17, "Agro", 7f);
        aluno[4] = new Aluno(1415, "Caim", 13, "Agro", 6.5f);
        
        float aux = 0;
        for (int i = 0; i < 5; i++) {
            aux = aluno[i].mediaGeral + aux;
        }

        System.out.println("A média da turma é: " + aux/5);
    }
}