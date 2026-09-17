public class CanalEmail implements ServicoMensagem {


    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem via Email: " + mensagem);
    }
}
