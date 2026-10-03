public class Animal {
  public void emitirSom() {
    System.out.println("O animal emitiu um som.");
  }

  public static void main(String[] args) {
    Animal animal = new Cachorro();
    animal.emitirSom();
  }
}
