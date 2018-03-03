package FigurasGeometricas;

public class Esfera extends Figura3D {

	private double raio;
	public Esfera(double raio) {
		this.raio=raio;
	}

	@Override
	public double volume() {
		
		return 4*Math.PI*Math.pow(raio, 3)/3;
	}

	@Override
	public String toString() {
		
		return "Volume: "+volume();
	}

}
