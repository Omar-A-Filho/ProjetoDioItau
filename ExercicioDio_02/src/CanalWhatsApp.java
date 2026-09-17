public class CanalWhatsApp implements ServicoMensagem {


    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem via WhatsApp: " + mensagem);
    }
}
