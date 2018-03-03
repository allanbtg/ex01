package FigurasGeometricas;

public class Quadrado extends Quadrilatero implements Diagonal {

	public Quadrado(double h, double b) {
		super(h, b);
	}

	@Override
	public double diagonal() {
		double diag = super.getH() * Math.sqrt(2);
		return diag;
	}
	@Override
	public String toString() {
		
		return "Area: "+super.area()+" Perimetro: "+super.perimetro()+"Diagonal: "+diagonal();
	}
 
	


	

	
	


}
