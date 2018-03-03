package FigurasGeometricas;

public class Trapezio extends Quadrilatero {
	

	double b2;

	public Trapezio(double h, double b, double bzinho) {
		super(h, b);
		this.b2 = bzinho;
	}

	@Override
	public double area() {
		
		return ((getB() + b2) * getH()) /2;
	}

	
	public double perimetro() {
		
		return 0;
	}
	
}
