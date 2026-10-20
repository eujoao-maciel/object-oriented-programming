public class Main {
    public static void main(String[] args) {
        Funcionario funcionario1 = new FuncionarioCLT(
            "Jorge", "333", 1500
        );

        Funcionario funcionario2 = new FuncionarioComissionado(
            "Italo", "666", 1500, 3000
        );

        System.out.println(funcionario1.calcularSalario());
        System.out.println(funcionario2.calcularSalario());
    }
}
