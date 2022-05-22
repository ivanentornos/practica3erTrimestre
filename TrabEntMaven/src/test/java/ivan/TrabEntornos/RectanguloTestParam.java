package ivan.TrabEntornos;

import static org.junit.Assert.*;

import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class RectanguloTestParam {
	
	private String color;
	private int base;
	private int altura;
	private int solucion;
	
	public RectanguloTestParam(String color, int base, int altura, int solucion) {
		this.color = color;
		this.base = base;
		this.altura = altura;
		this.solucion = solucion; 
	}
	
	@Parameters
	public static Collection <Object[]> datos(){
		return Arrays.asList(new Object[][] {{"rojo",5,10,50},{"azul",4,8,32},{"verde",2,4,8}});
	}
	

	@Test
	public void testCalcularArea() {
		Rectangulo rectangulo = new Rectangulo("", 5, 10); 
		assertEquals(solucion,rectangulo.calcularArea(5,10),0.01);
	}

}
