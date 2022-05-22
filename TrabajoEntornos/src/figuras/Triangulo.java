package figuras;

import daw.com.Pantalla;

public class Triangulo {
	
	private String color;
	private double base;
	private double altura;

	public Triangulo() {
		color = "";
		base = 0.0;
		altura = 0.0;
	}

	public Triangulo(String color, double base, double altura) {
		this.color = color;
		this.base = base;
		this.altura = altura;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public String toString() {
		return "Triangulo [color=" + color + ", base=" + base + ", altura=" + altura + "]";
	}

	public double calcularArea(double base, double altura) {
		return (base * altura) / 2;
	}

	public double calcularPerimetro(double base, double altura) {
		return -1.0;
	}
	
	public void mostrarFigura() {
		Pantalla.escribirString("\nEsto es un triángulo");
	}

}
