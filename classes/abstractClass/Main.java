abstract class Animal {
  public abstract void emitirSom();

  public void dormir() {
    System.out.println("Zzzz...");
  }
}

class Cachorro extends Animal {
  public void emitirSom() {
    System.out.println("Auau");
  }
}

class Gato extends Animal {
  public void emitirSom() {
    System.out.println("Miau");
  }
}

public class Main {
  public static void main(String[] args) {
    Animal cachorro = new Cachorro();
    Animal gato= new Gato();

    cachorro.emitirSom();
    cachorro.dormir();

    gato.emitirSom();
    gato.dormir();
  }
}


