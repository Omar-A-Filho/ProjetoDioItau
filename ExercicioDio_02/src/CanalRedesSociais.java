public class CanalRedesSociais implements ServicoMensagem {


    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem via Redes Sociais: " + mensagem);
    }
}
