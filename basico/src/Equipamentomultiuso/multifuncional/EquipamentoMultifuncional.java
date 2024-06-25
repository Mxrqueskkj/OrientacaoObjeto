package Equipamentomultiuso.multifuncional;


import Equipamentomultiuso.Equipamentos.Digitalizadora.Digitalizadora;
import Equipamentomultiuso.Equipamentos.Impressora.Impressora;
import Equipamentomultiuso.Equipamentos.copiadora.Copiadora;

public class EquipamentoMultifuncional implements Copiadora, Digitalizadora, Impressora {

    public void copiar() {
        System.out.println("Copiando via equipamento multifuncional");
    }
    public void digitar() {
        System.out.println("Digitalizando via equipamento multifuncional");
    }
    public void imprimir() {
        System.out.println("Imprimindo via equipamento multifuncional");
    }
}
