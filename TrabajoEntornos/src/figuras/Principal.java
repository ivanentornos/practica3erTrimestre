package figuras;

import daw.com.Pantalla;

public class Principal {

	public static void main(String[] args) {
		
	
		Pantalla.escribirString("\nTipos de figuras.");
		
		Cuadrado cuadrado = new Cuadrado("verde", 2); 
		Rectangulo rectangulo = new Rectangulo("rojo", 2, 4); 
		Triangulo triangulo = new Triangulo("azul", 2, 4);
		Circulo circulo = new Circulo("amarillo", 2); 
		
		System.out.println(cuadrado.toString());
		System.out.println(rectangulo.toString());
		System.out.println(triangulo.toString());
		System.out.println(circulo.toString());
		
		System.out.println();
		System.out.println("�rea cuadrado: " + cuadrado.calcularArea(2));
		System.out.println("�rea rect�ngulo: " + rectangulo.calcularArea(2,4));
		System.out.println("�rea tri�ngulo: " + triangulo.calcularArea(2,4));
		System.out.println("�rea c�rculo: " + circulo.calcularArea(2));

	}

}
