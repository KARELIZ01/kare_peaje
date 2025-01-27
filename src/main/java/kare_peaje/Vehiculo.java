package kare_peaje;

public abstract class Vehiculo {
    protected String placa;

    public Vehiculo(String placa) {
        this.placa = placa;
    }

    public abstract double getCostoPeaje();
}