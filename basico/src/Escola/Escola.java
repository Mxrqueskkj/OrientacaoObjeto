package Escola;

public class Escola {
    public static void main(String[] args) {
        Aluno felipe = new Aluno();

        felipe.setNome("Felipe junior");
        felipe.setIdade(12);
        felipe.setSexo("homi");

        System.out.println("o aluno " + felipe.getNome() + " tem " + felipe.getIdade() + " anos");
    }
}
