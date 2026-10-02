public class Endereco {
    private String pais;
    private String uf;
    private String cidade;
    private String rua;
    private String numero;
    private long cep;
    private String complemento;

    public void definirPais(String pais) {
        this.pais = pais;
    }

    public void definirUF(String uf) {
        this.uf = uf;
    }

    public void definirCidade(String cidade) {
        this.cidade = cidade;
    }

    public void definirRua(String rua) {
        this.rua = rua;
    }

    public void definirNumero(String numero) {
        this.numero = numero;
    }

    public void definirCEP(long cep) {
        this.cep = cep;
    }

    public void definirComplemento(String complemento) {
        this.complemento = complemento;
    }
}
