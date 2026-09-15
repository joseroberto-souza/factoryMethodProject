public class IngressoMeia implements Ingresso{
    @Override
    public double calcularPreco() {
        return 25;
    }

    @Override
    public String obterDescricao() {
        return "Meia entrada";
    }
}
