public class Gerente extends UsuarioBase implements ConsultorDeVendas {

    public Gerente(String nome, String email, String senha, boolean administrador) {
        super(nome, email, senha, true);
    }


    public void gerarRelatoriosFinanceiros() {

    }

    @Override
    public void consultarVendas() {

    }
}
