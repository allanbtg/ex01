package FigurasGeometricas;

public class Cubo extends Figura3D  {

	private  double h,b;
	public Cubo(double h, double b) {
		this.b = b;
		this.h = h;
	
	}

	@Override
	public double volume() {
		return Math.pow(h, 3);
	}

	@Override
	public String toString() {
		
		return "Volume: "+volume();
	}
	
}
