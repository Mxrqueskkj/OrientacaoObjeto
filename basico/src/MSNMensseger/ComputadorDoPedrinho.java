package MSNMensseger;
import MSNMensseger.apps.FacebookMenseger;
import MSNMensseger.apps.MSNMensseger;
import MSNMensseger.apps.ServicoPai;
import MSNMensseger.apps.Telegram;

import java.util.Scanner;
import javax.swing.*;

public class ComputadorDoPedrinho {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ServicoPai smi = null;
        
        String appEscolhido = entrada.next();

        if (appEscolhido.equals("msn")){
            smi = new MSNMensseger();
        } else if (appEscolhido.equals("fgm")){
            smi = new FacebookMenseger();
        } else if (appEscolhido.equals("tlg")){
            smi = new Telegram();
        }

        smi.enviarMensagem();
        smi.receberMensagem();


        
        entrada.close();
        
    }
}
