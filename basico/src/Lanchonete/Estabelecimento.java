package Lanchonete;

public class Estabelecimento {

    public static void main(String[] args) {

        Cozinheiro cozinheiro = new Cozinheiro();
        //acoes do cozinheiro
        cozinheiro.lavarIngredientes();
        cozinheiro.baterVitanimaLiquidificador();
        cozinheiro.selecionarIngredientesVitamina();
        cozinheiro.prepararLanche();
        cozinheiro.prepararVitanima();
        cozinheiro.prepararVitanima();

        //acoes que o estabelecimento precisa ter ciencia
        cozinheiro.adicionarSucoNoBalcao();
        cozinheiro.adicionarLancheNoBalcao();
        cozinheiro.adicionarComboNoBalcao();

        Almoxarife almoxarife = new Almoxarife();
        //acoes que nao precisam estarem disponiveis para toda a aplicaçao
        almoxarife.controlarEntrada();
        almoxarife.controlarSaida();
        //acao que somente o seu pacote cozinha precusa conhecer (defalt)
        almoxarife.entregarIngredientes();
        almoxarife.trocarGas();

        Atendente atendente = new Atendente();
        atendente.pegarLancheCozinha();
        atendente.receberPagamento();
        atendente.servindoMesa();
        //acao que somente o seu pacote cozinha preceisa conhcer (defalt)
        atendente.trocarGas();

        Cliente cliente = new Cliente();
        cliente.escolherLanche();
        cliente.fazerPedido();
        cliente.pagarConta();

        //nao deveria mas o  estabelecimento nao definiu normas de atendimento
        cliente.pegarPedidoBalcao();

        //esta açao é muito sigilosa, que tal ser privada?
        cliente.consultarSaldoAplicativo();

        //ja pensou os cliente ouvindo que o gas acabou?
        cozinheiro.pedirParaTrocarGas(atendente);
        cozinheiro.pedirParaTrocarGas(almoxarife);

    }
}
