package ivan.TrabEntornos;

public class Circulo{
	
	private String color;
	private double radio;
	
	public Circulo() {
		color = "";
		radio = 0.0; 
	}
	
	public Circulo(String color, double radio) {
		this.color = color;
		this.radio = radio;
	}
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public double getRadio() {
		return radio;
	}
	
	public void setRadio(double radio) {
		this.radio = radio;
	}

	@Override
	public String toString() {
		return "Circulo [color=" + color + ", radio=" + radio + "]";
	}

	public double calcularArea(double radio) {
		return Math.PI * Math.pow(radio, 2);
	}

	public double calcularPerimetro(double radio) {
		return 2 * Math.PI * radio;
	}

}