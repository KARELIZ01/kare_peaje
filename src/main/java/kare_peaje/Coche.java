package kare_peaje;

public class Coche extends Vehiculo {
    
    public Coche(String placa) {
        super(placa);
    }

    @Override
    public double getCostoPeaje() {
        return 100.0;
    }
}