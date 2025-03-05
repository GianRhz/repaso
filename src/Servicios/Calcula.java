package Servicios;

import java.util.List;

public class Calcula {
    public String rutaMasRapida(String origen, String destino) {
    if (!origen.isEmpty() && !destino.isEmpty())
    	return "Ruta mas rapida entre " + origen + " y " + destino;
    return "Ruta 1";
    }

    public String rutaMasEconomica(String origen, String destino, double presupuesto) {
    	
    return "Ruta 2";
    }

    public String rutaConLugaresDeInteres(String origen, String destino, List<String> lugaresDeInteres) {
    // Simulación de cálculo de ruta con lugares de interés
    return "Ruta 3";
    }

    public String rutaConGasolineras(String origen, String destino, int numGasolineras) {
    // Simulación de cálculo de ruta con gasolineras
    return "Ruta 4";
    }
}
