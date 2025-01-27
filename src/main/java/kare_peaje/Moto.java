package kare_peaje;

public class Moto extends Vehiculo {

    public Moto(String placa) {
        super(placa);
    }

    @Override
    public double getCostoPeaje() {
        return 50.0;
    }
}
