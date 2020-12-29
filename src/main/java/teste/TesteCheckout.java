package teste;

import caixa.Checkout;
import caixa.Compra;
import impressoras.Impressora;
import impressoras.impressoras.ImpressoraHP;
import pagamento.Cartao;
import pagamento.Operadora;
import pagamento.operadoras.RedeCard;

public class TesteCheckout {

    public static void main(String[] args) {

        Operadora operadora = new RedeCard();
        Impressora impressora = new ImpressoraHP();

        Cartao cartao = new Cartao();
        cartao.setNomeTitular("JOAO M COUVES");
        cartao.setNumeroCartao("456");

        Compra compra = new Compra();
        compra.setNomeCliente("João Mendoça Couves");
        compra.setProduto("Sabonete");
        compra.setValorTotal(50);

        Checkout checkout = new Checkout(operadora, impressora);
        checkout.fecharCompra(compra, cartao);

    }
}
