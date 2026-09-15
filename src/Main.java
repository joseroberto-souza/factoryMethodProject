public class Main {
    public static void main(String[] args){
        FabricaIngresso minhaFabrica;

        String tipo = "meia";// sistema pode ser atualizado para receber dados
        // a proposta inicial era so fazer o teste

        minhaFabrica = new FabricaMeia();

        System.out.println("Tipo: "+ minhaFabrica.criarIngresso().obterDescricao());
        System.out.println("Preço R$: "+ minhaFabrica.criarIngresso().calcularPreco());








    }
}
