package OrientacaoCarro;

public class Autodromo {
    public static void main(String[] args) {
        Carro jeep = new Carro();
        jeep.setChassi("1231312");
        jeep.ligar();

        Moto z400 = new Moto();
        z400.setChassi("2313123");
        z400.ligar();
    }

}
