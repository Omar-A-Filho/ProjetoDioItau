public class CanalSms implements ServicoMensagem {


    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem via SMS: " + mensagem);
    }
}
