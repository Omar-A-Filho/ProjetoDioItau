public class Vendedor extends UsuarioBase implements ConsultorDeVendas {

    private int quantidadeDeVendas;

    public Vendedor(String nome, String email, String senha, boolean administrador, int quantidadeDeVendas) {
        super(nome, email, senha, administrador);
        this.quantidadeDeVendas = 0;
    }

    public void realizarVendas(Vendedor vendedor) {}

    @Override
    public void consultarVendas() {

    }

    public int getQuantidadeDeVendas() {
        return quantidadeDeVendas;
    }
    public void setQuantidadeDeVendas(int quantidadeDeVendas) {
        this.quantidadeDeVendas = quantidadeDeVendas;
    }
}
