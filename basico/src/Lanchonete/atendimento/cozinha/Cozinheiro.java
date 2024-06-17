package Lanchonete.atendimento.cozinha;

public class Cozinheiro {
    public void adicionarLancheNoBalcao(){
        System.out.println("ADICIONANDO LANCHE NATURAL HAMBURGUER NO BALCÃO");
    }
    public void adicionarSucoNoBalcao(){
        System.out.println("ADICIONANDO SUCO NO BALCÃO");
    }
    public void adicionarComboNoBalcao(){
        adicionarLancheNoBalcao();
        adicionarSucoNoBalcao();
    }
    private void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }
    private void prepararVitanima(){
        System.out.println("PREPARANDO SUCO");
    }
    private void prepararCombo(){
        prepararLanche();
        prepararVitanima();
    }
    private void selecionarIngredientesLanche(){
        System.out.println("SELECIONANDO O PÃO, SALADA, OVO, CARNE");
    }
    private void  selecionarIngredientesVitamina(){
        System.out.println("SELECIONANDO FRUTA, LEITE, SUCO");
    }
    private void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }
    private void baterVitanimaLiquidificador(){
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }
    private void fritarIngredienteslanche(){
        System.out.println("FRITANDO A CARNE E O OVO PARA O HAMBURGUER");
    }
    private void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    private void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
