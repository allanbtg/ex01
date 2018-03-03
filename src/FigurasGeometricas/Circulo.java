package FigurasGeometricas;

public class Circulo extends Figura2D {

	private double raio;
	
	public Circulo(double raio) {
		this.raio = raio;
		
	}

	public double getRaio() {
		return raio;
	}

	
	@Override
	public double area() {
		double a = Math.pow(raio, 2) * Math.PI;
		return a;
		
	}

	@Override
	public double perimetro() {
		double perimetro = 2*Math.PI*getRaio();
		return perimetro;
	}

	@Override
	public String toString() {
		
		return "Area: "+area()+" Perimetro: "+perimetro();
	}
	
	
	
	


	
	
}