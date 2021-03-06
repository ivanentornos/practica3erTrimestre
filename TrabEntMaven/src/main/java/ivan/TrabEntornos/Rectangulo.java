package ivan.TrabEntornos;

public class Rectangulo {
	
	private String color;
	private int base;
	private int altura;
	
	public Rectangulo() {
		color = "";
		base = 0;
		altura = 0;
	}
	
	public Rectangulo(String color, int base, int altura) {
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

	public int getBase() {
		return base;
	}
	
	public void setBase(int base) {
		this.base = base;
	}
	
	public int getAltura() {
		return altura;
	}
	
	public void setAltura(int altura) {
		this.altura = altura; 
	}

	@Override
	public String toString() {
		return "Rectangulo [color=" + color + ", base=" + base + ", altura=" + altura + "]";
	}

	public int calcularArea(int base, int altura) {
		return base*altura; 
	}

	public int calcularPerimetro(int base, int altura) {
		return (base*2)+(altura*2);
	}

}
