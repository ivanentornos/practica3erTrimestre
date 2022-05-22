package ivan.TrabEntornos;

import ivan.TrabEntornos.Circulo;
import ivan.TrabEntornos.Cuadrado;
import ivan.TrabEntornos.Figura;
import ivan.TrabEntornos.Rectangulo;
import ivan.TrabEntornos.Triangulo;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
		
		Cuadrado cuadrado = new Cuadrado("verde", 2); 
		Rectangulo rectangulo = new Rectangulo("rojo", 2, 4); 
		Triangulo triangulo = new Triangulo("azul", 2, 4);
		Circulo circulo = new Circulo("amarillo", 2); 
		
		System.out.println(cuadrado.toString());
		System.out.println(rectangulo.toString());
		System.out.println(triangulo.toString());
		System.out.println(circulo.toString());
		
		System.out.println();
		System.out.println("Área cuadrado: " + cuadrado.calcularArea(2));
		System.out.println("Área rectángulo: " + rectangulo.calcularArea(2,4));
		System.out.println("Área triángulo: " + triangulo.calcularArea(2,4));
		System.out.println("Área círculo: " + circulo.calcularArea(2));

	}

}

