package FigurasGeometricas;

public class Triangulo extends Poligonos {

	public Triangulo(double h, double b) {
		super(h, b);
	}


	public double area() {
		return (super.getB()*super.getH())/2;
	}


	@Override
	public double perimetro() {
		double perimetro = 3 * getB();
		return perimetro;
	}


	@Override
	public String toString() {
		
		return "Area: "+area()+" Perimetro: "+perimetro();
	}
	

	
	


}
