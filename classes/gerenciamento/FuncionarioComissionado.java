public class FuncionarioComissionado extends Funcionario {
    private double totalVendas;

    public FuncionarioComissionado 
        (String nome, String cpf, double salarioBase, double totalVendas) {
            super (nome, cpf, salarioBase);
            this.totalVendas = totalVendas;
        }

    @Override
    public double calcularSalario() {
        return getSalarioBase() + (totalVendas * 0.10);
    }
}
