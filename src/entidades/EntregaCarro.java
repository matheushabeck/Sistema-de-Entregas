package entidades;

public class EntregaCarro extends Entrega {

    private double pesoMaximo= 100;

    public EntregaCarro(int codigo, double distanciaKm, double pesoKg) {
        super(codigo, distanciaKm, pesoKg);
    }

    @Override
    public double calcularCusto() {

        if (pesoKg > pesoMaximo){
            System.out.println("Peso acima do limite do carro");
            return 0;
        }
        return 15 + (distanciaKm * 1.50) + (pesoKg * 0.40);
    }

    @Override
    public double calcularPrazo() {

        if (distanciaKm <= 50) {
            return 2;
        } else {
            return 3;
        }
    }
}
