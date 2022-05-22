package ivan.TrabEntornos;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class RectanguloTest {
	Rectangulo rectangulo;
	
	@Before
	public void nuevoCuadrado() {
		rectangulo = new Rectangulo("", 4, 2);
	}
	
	@Test
	public void testcalcularArea() {
		assertEquals(8,rectangulo.calcularArea(4,2));
	}
	
	@Test
	public void testcalcularPerimetro() {
		assertEquals(12,rectangulo.calcularPerimetro(4,2));
	}

}