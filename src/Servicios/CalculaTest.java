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
		String ruta = Calcula.rutaMasRapida("Ventilla","Barrio del Pilar");
		assertTrue(ruta.contains("Ventilla"));
	}

	@Test
	void testRutaMasEconomica() {
		assertEquals("Ruta no valida", Calcula.rutaMasEconomica("","Barrio del Pilar",100));
	}

	@Test
	void testRutaConLugaresDeInteres() {
		assertEquals("Ruta no valida", Calcula.rutaMasRapida("","Barrio del Pilar"));
	}

	@Test
	void testRutaConGasolineras() {
		fail("Not yet implemented");
	}

}
