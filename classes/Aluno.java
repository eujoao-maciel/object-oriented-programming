import java.util.Random;

public class Aluno {
  private String nome;
  private int idade;
  private double codigo_identificador;
  private Random aleatorio;

  public Aluno(String nome, int idade) {
    aleatorio = new Random();
    this.nome = nome;
    this.idade = idade;
    this.codigo_identificador = aleatorio.nextDouble();
  }

  public String recuperarDados() {
    return "Nome: " + nome + ", Idade: " + idade; 
  }
  
  public static void main(String args[]) {
    Aluno aluno1 = new Aluno("João", 24);
    System.out.println(aluno1.recuperarDados());
  }
}
