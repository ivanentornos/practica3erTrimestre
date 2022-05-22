package figuras;

public class Cuadrado {
	
	private String color;
	private int lado;
	
	public Cuadrado() {
		color = "";
		lado = 0;
	}
	
	public Cuadrado(String color, int lado) {
		this.color = color;
		this.lado = lado;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public int getLado() {
		return lado;
	}
	
	public void setLado(int lado) {
		this.lado = lado; 
	}
	
	
	@Override
	public String toString() {
		return "Cuadrado [color=" + color + ", lado=" + lado + "]";
	}

	public int calcularArea(int lado) {
		return lado * lado;
	}

	public int calcularPerimetro(int lado) {
		return (lado*4);
	}

}
