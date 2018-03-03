package FigurasGeometricas;

public abstract class Poligonos extends Figura2D {

	private double h, b;
	
	public Poligonos(double h, double b) {
	
		this.b = b;
		this.h = h;
	}


	public double getH() {
		return h;
	}

	public void setH(double h) {
		this.h = h;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

}
