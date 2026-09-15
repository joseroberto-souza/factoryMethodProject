public class IngressoInteira implements Ingresso{
    @Override
    public double calcularPreco() {
        return 50;
    }

    @Override
    public String obterDescricao() {
        return "Ingresso Inteira";
    }
}
