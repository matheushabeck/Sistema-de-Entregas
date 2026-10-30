package entidades;

public class EntregaCaminhao extends Entrega{

    private double pesoMaximo = 5000;

    public EntregaCaminhao(int codigo, double distanciaKm, double pesoKg) {
        super(codigo, distanciaKm, pesoKg);
    }

    @Override
    public double calcularCusto() {

        if (pesoKg > pesoMaximo){
            System.out.println("Peso acima do limite do caminhão");
            return 0;
        } else {
            return 100 + (distanciaKm * 3.00) + (pesoKg * 0.10);
        }
    }

    @Override
    public double calcularPrazo() {

        if (distanciaKm <=100){
            return 4;
        } else {
            return 5;
        }
    }
}
