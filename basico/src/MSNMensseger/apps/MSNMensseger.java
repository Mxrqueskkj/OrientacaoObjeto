package MSNMensseger.apps;

public class MSNMensseger extends ServicoPai{
    public void enviarMensagem(){
        validarConectadoInternet();
        System.out.println("Enviando mensagem pelo Msn Mensseger");
    }
    public void receberMensagem(){
        System.out.println("recebendo mensagem pelo Msn Mensseger");
    }

    @Override
    public void salvarHistoricoMensagem() {

    }

}
