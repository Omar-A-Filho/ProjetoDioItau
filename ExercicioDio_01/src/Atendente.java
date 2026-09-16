public class Atendente extends UsuarioBase {

    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha, boolean administrador, double valorEmCaixa) {
        super(nome, email, senha, false);
        this.valorEmCaixa = valorEmCaixa;
    }

    public void receberPagamentos () {

    }
    public void fecharCaixa() {

    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }

    public void setValorEmCaixa(double valorEmCaixa) {
        this.valorEmCaixa = valorEmCaixa;
    }
}
