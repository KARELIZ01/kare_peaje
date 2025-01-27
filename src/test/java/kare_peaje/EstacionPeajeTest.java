package kare_peaje;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class EstacionPeajeTest {

    @Test
    public void testCobrarPeajeCoche() {
    
        EstacionPeaje estacion = new EstacionPeaje("Estación Central", "Ciudad");
        
        Coche coche = new Coche("ABC123");
        
        double costo = estacion.cobrarPeaje(coche);
        
        assertEquals(100.0, costo, "El costo del peaje para un coche debe ser 100");
        assertEquals(100.0, estacion.getTotalRecaudado(), "El total recaudado debe ser 100");
        assertEquals(1, estacion.getVehiculos().size(), "Debe haber un vehículo en la lista");
    }

    @Test
    public void testCobrarPeajeMoto() {
        EstacionPeaje estacion = new EstacionPeaje("Estación Central", "Ciudad");
        Moto moto = new Moto("XYZ789");
        
        double costo = estacion.cobrarPeaje(moto);
        
        assertEquals(50.0, costo, "El costo del peaje para una moto debe ser 50");
        assertEquals(50.0, estacion.getTotalRecaudado(), "El total recaudado debe ser 50");
    }
}
