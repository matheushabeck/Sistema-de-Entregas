package entidades;

import java.util.ArrayList;

public class CentralEntregas {

    private ArrayList<Pedido> listaDePedidos = new ArrayList<>();

    public void adicionarPedido(Pedido novoPedido){
        listaDePedidos.add(novoPedido);
    }

    public double calcularCustoTotal() {
        double total= 0;

        for (Pedido pedidoAtual : listaDePedidos){
            total += pedidoAtual.getEntrega().calcularCusto();
        }
        return total;
    }

    public void mostrarPrazos(){
        for (Pedido pedidoAtual : listaDePedidos){
            System.out.println("Pedido: " + pedidoAtual.getCodigo());
            System.out.println("Prazo: " + pedidoAtual.getEntrega().calcularPrazo());
        }
    }

    public void contarModalidades() {
        int quantidadeMotos = 0;
        int quantidadeCarros = 0;
        int quantidadeCaminhoes = 0;

        for(Pedido pedidoAtual : listaDePedidos){

        }

    }

}
