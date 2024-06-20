package OrientacaoCarro;

public class Carro  extends Veiculo {
    public void ligar(){
        conferindoCambio();
        conferindoCombustivel();
        System.out.println("CARRO LIGADO");
    }
    private void conferindoCombustivel(){
        System.out.println("Conferindo Combustivel");
    }
    private void conferindoCambio(){
        System.out.println("Conferindo Cambio em P");
    }
}
