package entidades;

public class EntregaMoto extends Entrega {

    private double pesoMaximo = 10;

    public EntregaMoto(int codigo, double distanciaKm, double pesoKg) {
        super(codigo, distanciaKm, pesoKg);
    }

    @Override
    public double calcularCusto() {

        if (pesoKg > pesoMaximo){
            System.out.println("Peso acima do limite da moto");
            return 0;
        }
        return 5 + (distanciaKm * 1) + (pesoKg * 0.50);
    }

    @Override
    public double calcularPrazo() {

        if (distanciaKm <= 30){
            return 1;
        } else {
            return 2 ;
        }
    }
}
