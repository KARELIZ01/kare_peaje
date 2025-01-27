package kare_peaje;

public class Camion extends Vehiculo {
    private int numeroEjes;

    public Camion(String placa, int numeroEjes) {
        super(placa);
        this.numeroEjes = numeroEjes;
    }

    @Override
    public double getCostoPeaje() {
        return 50.0 * numeroEjes;
    }
}
