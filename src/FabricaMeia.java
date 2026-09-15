public class FabricaMeia implements FabricaIngresso{
    @Override
    public Ingresso criarIngresso() {
        return new IngressoMeia();
    }
}
