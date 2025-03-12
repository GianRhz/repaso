package Servicios;

import java.util.List;

public class Calcula {
    public static String rutaMasRapida(String origen, String destino) {
    if (!origen.isEmpty() && !destino.isEmpty())
    	return "Ruta mas rapida entre " + origen + " y " + destino;
    return "Ruta no valida";
    }

    public static String rutaMasEconomica(String origen, String destino, double presupuesto) {
    	if (presupuesto>0)
        	return "Ruta mas economico entre " + origen + " y " + destino + " con presupuesto";
        return "Sin presupuesto";
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
