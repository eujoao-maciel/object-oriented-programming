public class Aluno {
  private String nome;

  public void inserirNome(String nome) {
    this.nome = nome;
  }

  public String recuperarNome() {
    return nome;
  }

  public static void main(String args[]) {
    Aluno aluno1 = new Aluno();
    aluno1.inserirNome("João");
    System.out.println("Aluno: "+aluno1.recuperarNome());
  }
}
