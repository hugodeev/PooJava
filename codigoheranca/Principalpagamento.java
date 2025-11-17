
public class Principalpagamento {

    public static void main(String[] args) {

        CadastroPagamento c = new CadastroPagamento();

        c.adicionar(new Pix("Hugo", 150, "abc123"));
        c.adicionar(new Boleto("Maria", 200, "999.888.777"));
        c.adicionar(new CartaoCredito("João", 100, 3));

        c.imprimirPagamentos();

        System.out.println("Total: " + c.calcularTotal());
    }
}
