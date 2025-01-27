package kare_peaje;

import java.util.ArrayList;
import java.util.List;

public class EstacionPeaje {
    private String nombre;
    private String ciudad;
    private double totalRecaudado;
    private List<Vehiculo> vehiculos;

    public EstacionPeaje(String nombre, String ciudad) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.totalRecaudado = 0.0;
        this.vehiculos = new ArrayList<>();
    }

    public double cobrarPeaje(Vehiculo vehiculo) {
        double costo = vehiculo.getCostoPeaje();
        totalRecaudado += costo;
        vehiculos.add(vehiculo);
        return costo;
    }

    public double getTotalRecaudado() {
        return totalRecaudado;
    }

    public List<Vehiculo> getVehiculos() {
        return vehiculos;
    }
}