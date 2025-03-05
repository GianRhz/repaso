package Servicios;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

class CalculaTest {
	static Calcula calcularuta;
	
	@BeforeAll
	static void setUpBeforeClass() throws Exception{
		calcularuta = new Calcula();
	}

	@Test
	void testRutaMasRapida() {
		String ruta = calcularuta.rutaMasRapida("Ventilla","Barrio del Pilar");
		assertTrue(ruta.contains("Ventilla"));
	}

	@Test
	void testRutaMasEconomica() {
		fail("Not yet implemented");
	}

	@Test
	void testRutaConLugaresDeInteres() {
		fail("Not yet implemented");
	}

	@Test
	void testRutaConGasolineras() {
		fail("Not yet implemented");
	}

}
