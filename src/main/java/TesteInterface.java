public class TesteInterface {

    public static void main(String[] args) {

        Imprimivel i = new NotaFiscal(1234);
        i.imprimir();

        EnviavelPorEmail e = (EnviavelPorEmail) i;
        e.enviar("junir@email.com");

        NotaFiscal n = (NotaFiscal) e;
        n.adicionarPedido("caixa de leite");

    }
}
