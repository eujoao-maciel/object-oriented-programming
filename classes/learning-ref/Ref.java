class Ref {
  private Aluno aluno1, aluno2;
  public Ref () {
    aluno1 = new Aluno("Emerson", 24);
    aluno2 = new Aluno("Batista", 25);

    System.out.println("O nome do aluno1 é " + aluno1.recuperarNome());
    System.out.println("O nome do aluno2 é " + aluno2.recuperarNome());

    aluno1 = aluno2;
    aluno2.definirNome("Otávio");

    System.out.println("O nome do aluno1 é " + aluno1.recuperarNome());
    manipulaNomeAluno(aluno1);
    System.out.println("O nome do aluno1 é " + aluno1.recuperarNome());
  }

  public void manipulaNomeAluno(Aluno aluno) {
    aluno.definirNome("teste de mudandança de nome");
  }

  public void main (String args[]) {
    Ref referencia = new Ref();
    System.out.println("Fim da Execução");
  }
}
