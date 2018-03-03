package FigurasGeometricas;

import java.util.ArrayList;

public class Geometria {

	public static void main(String[] args) {
		ArrayList<Figura> figuras = new ArrayList<>();
		// circulo para composicao do cilindro
		Circulo circuloCilindro = new Circulo(15);
		Triangulo triangulo = new Triangulo(2,2);

		figuras.add(new Retangulo(8, 2));
		figuras.add(new Quadrado(4, 6));
		figuras.add(new Triangulo(6, 8));
		figuras.add(new Losango(2, 2));
		figuras.add(new Circulo(24));
		figuras.add(new Trapezio(5, 4, 4));
		figuras.add(new Cilindro(circuloCilindro, 2));
		figuras.add(new Esfera(10));
		figuras.add(new Cubo(7, 2));
		figuras.add(new Piramide(triangulo, 2));

		for (Figura fig : figuras) {
			
			String nomeFigura = "" + fig.getClass().getName();
			System.out.println(nomeFigura + ": "+fig.toString());

		}
	}
}
