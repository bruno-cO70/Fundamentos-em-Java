package POO.Exemplo_aluno;

public class Programa {
    public static void main(String[] args) {
        Aluno aluno1 = new Aluno();
        aluno1.nome = "Ana";
        aluno1.nota1 = 8.0;
        aluno1.nota2 = 7.5;

        Aluno aluno2 = new Aluno();
        aluno2.nome = "Bruno";
        aluno2.nota1 = 10.0;
        aluno2.nota2 = 9.5;

        System.out.println(aluno1.nome + " tirou " + aluno1.nota1);
        System.out.println(aluno2.nome + " tirou " + aluno2.nota1);
    }
}
