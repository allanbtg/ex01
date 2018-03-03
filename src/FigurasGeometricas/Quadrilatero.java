package FigurasGeometricas;

public class Quadrilatero extends Poligonos{

	public Quadrilatero(double h, double b) {
		super(h, b);
		
	}

	@Override
	public double area() {
		double a;
		a = getB() * getH();
		return a;
	}

	@Override
	public double perimetro() {
		double perimetro = 2*getB()+2*getH();
		return perimetro;
	}

	@Override
	public String toString() {
		
		return "Area: "+area()+" Perimetro: "+perimetro();
	}

	

}
