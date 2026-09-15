public class FabricaInteira implements FabricaIngresso{
    @Override
    public Ingresso criarIngresso() {
        return new IngressoInteira();
    }
}
