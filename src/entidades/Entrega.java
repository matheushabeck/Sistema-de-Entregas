package entidades;

public abstract class Entrega {

    protected  int codigo;
    protected  double distanciaKm;
    protected  double pesoKg;

    public Entrega(int codigo, double distanciaKm, double pesoKg) {
        this.codigo = codigo;
        this.distanciaKm = distanciaKm;
        this.pesoKg = pesoKg;
    }

    public abstract double calcularCusto();
    public abstract double calcularPrazo();
}
