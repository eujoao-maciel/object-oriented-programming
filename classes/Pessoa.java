import java.util.Random;

public class Pessoa {
  private String nome;
  private double codigo_id;
  private Random aleatorio;

  public Pessoa(String nome) {
    aleatorio = new Random();
    this.setNome(nome);
    this.codigo_id = aleatorio.nextDouble();
  }

  private void setNome(String nome) {
    this.nome = nome;
  }

  public String getNome() {
    return this.nome;
  }

  public double getCodigoId() {
    return this.codigo_id;
  } 

  public static void main(String args[]) {
    Pessoa pessoa1 = new Pessoa("Tomas");
    System.out.println("Nome: " + pessoa1.getNome());
    System.out.println("id: " + pessoa1.getCodigoId());
  }
}
