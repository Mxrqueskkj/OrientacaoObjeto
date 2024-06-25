package Equipamentomultiuso.Estabelecimento;

import Equipamentomultiuso.Equipamentos.Digitalizadora.Digitalizadora;
import Equipamentomultiuso.Equipamentos.Digitalizadora.Scanner;
import Equipamentomultiuso.Equipamentos.Impressora.Deskjet;
import Equipamentomultiuso.Equipamentos.Impressora.Impressora;
import Equipamentomultiuso.Equipamentos.Impressora.Laserjet;
import Equipamentomultiuso.Equipamentos.copiadora.Copiadora;
import Equipamentomultiuso.multifuncional.EquipamentoMultifuncional;

public class Fabrica {
    public static void main(String[] args) {
        EquipamentoMultifuncional em = new EquipamentoMultifuncional();

        Scanner deskjet = new Scanner();

        Impressora impressora = em;
        Digitalizadora digitalizadora= em;
        Copiadora copiadora = em;

        impressora.imprimir();
        digitalizadora.digitar();
        copiadora.copiar();


    }
}
