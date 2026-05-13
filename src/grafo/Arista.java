package grafo;

public class Arista implements Comparable<Arista>{
	private Vertice vertice1;
	private Vertice vertice2;
	private double peso;

	public Arista(Vertice vertice1, Vertice vertice2, double kilometros) {
		super();
		this.vertice1 = vertice1;
		this.vertice2 = vertice2;
		this.peso = kilometros;
	}

	@Override
	public int compareTo(Arista ar) {
		return Double.compare(this.peso, ar.peso);
		}
}
