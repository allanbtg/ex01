package FigurasGeometricas;

public class Retangulo extends Quadrilatero implements Diagonal {

	public Retangulo(double h, double b) {
		super(h, b);
	}

	@Override
	public double diagonal() {
		double diag = Math.sqrt((Math.pow(super.getH(), 2))+(Math.pow(super.getB(), 2)));
		return diag;
		}
	
	@Override
	public String toString() {
		
		return "Area: "+super.area()+" Perimetro: "+super.perimetro()+"Diagonal: "+diagonal();
	}
}
