package ivan.TrabEntornos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CuadradoTest {
	Cuadrado cuadrado;
	
	@Before
	public void nuevoCuadrado() {
		cuadrado = new Cuadrado("", 2);
	}
	
	@Test
	public void testcalcularArea() {
		assertEquals(4,cuadrado.calcularArea(2));
	}
	
	@Test
	public void testcalcularPerimetro() {
		assertEquals(8,cuadrado.calcularPerimetro(2));
	}

}
