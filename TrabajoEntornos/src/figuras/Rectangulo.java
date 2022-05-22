package figuras;

import daw.com.Pantalla;

public class Rectangulo {
	
	private String color;
	private double base;
	private double altura;
	
	public Rectangulo() {
		color = "";
		base = 0;
		altura = 0;
	}
	
	public Rectangulo(String color, double base, double altura) {
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
		return "Rectangulo [color=" + color + ", base=" + base + ", altura=" + altura + "]";
	}

	public double calcularArea(double base, double altura) {
		return base*altura; 
	}

	public double calcularPerimetro(double base, double altura) {
		return (base*2)+(altura*2);
	}
	
	public void mostrarFigura() {
		Pantalla.escribirString("\nEsto es un rectángulo");
	}

}
