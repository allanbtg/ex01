package FigurasGeometricas;

public class Piramide extends Figura3D {

	private double altura3d;
	private double area;

	public Piramide(Triangulo triangulo, double altura3d) {
		this.area = triangulo.area();
		this.altura3d = altura3d;

	}

	@Override
	public double volume() {

		return area * altura3d / 3;
	}

	@Override
	public String toString() {
		
		return "Volume: "+volume();

	}
}
