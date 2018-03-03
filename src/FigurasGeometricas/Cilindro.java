package FigurasGeometricas;

public class Cilindro extends Figura3D {
	
	private double area;
	private double h;
	
	public Cilindro(Circulo circulo, double h) {
		this.area = circulo.area();
		this.h = h;
		
	}

	@Override
	public double volume() {
		return area*h;
		
	}

	@Override
	public String toString() {
		
		return "Volume: "+volume();
	}
	

}
