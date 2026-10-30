package entidades;

public class Pedido {

    private int codigo;
    private String enderecoDestino;
    private Entrega novaEntrega;

    public Pedido(int codigo, String enderecoDestino, Entrega novaEntrega){
        this.codigo = codigo;
        this.enderecoDestino = enderecoDestino;
        this.novaEntrega = novaEntrega;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getEnderecoDestino() {
        return enderecoDestino;
    }

    public Entrega getEntrega() {
        return novaEntrega;
    }

    public void setEntrega(Entrega novaEntrega){
        this.novaEntrega = novaEntrega;
    }
}
