package Lanchonete;

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
    public void prepararLanche(){
        System.out.println("PREPARANDO LANCHE TIPO HAMBURGUER");
    }
    public void prepararVitanima(){
        System.out.println("PREPARANDO SUCO");
    }
    public void prepararCombo(){
        prepararLanche();
        prepararVitanima();
    }
    public void selecionarIngredientesLanche(){
        System.out.println("SELECIONANDO O PÃO, SALADA, OVO, CARNE");
    }
    public void  selecionarIngredientesVitamina(){
        System.out.println("SELECIONANDO FRUTA, LEITE, SUCO");
    }
    public void lavarIngredientes(){
        System.out.println("LAVANDO INGREDIENTES");
    }
    public void baterVitanimaLiquidificador(){
        System.out.println("BATENDO VITAMINA NO LIQUIDIFICADOR");
    }
    public void fritarIngredienteslanche(){
        System.out.println("FRITANDO A CARNE E O OVO PARA O HAMBURGUER");
    }
    public void pedirParaTrocarGas(Atendente meuAmigo){
        meuAmigo.trocarGas();
    }
    public void pedirParaTrocarGas(Almoxarife meuAmigo){
        meuAmigo.trocarGas();
    }
    public void pedirIngredientes(Almoxarife almoxarife){
        almoxarife.entregarIngredientes();
    }
}
