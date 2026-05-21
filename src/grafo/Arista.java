package grafo;

import java.util.Objects;

public class Arista implements Comparable<Arista>{
	private Vertice desde;
	private Vertice hasta;
	private double peso;

	public Arista(Vertice vertice1, Vertice vertice2, double kilometros) {
		super();
		this.desde = vertice1;
		this.hasta = vertice2;
		this.peso = kilometros;
	}
	
	public Vertice getOrigen() {
	      return desde;
	  } 

	  public Vertice getDestino() {
	      return hasta;
	  }

	  public double getCosto() {
	      return peso;
	  }

	@Override
	public int compareTo(Arista ar) {
		return Double.compare(this.peso, ar.peso);
		}
	
	public boolean equals(Arista a) {
		if(a.desde.equals(hasta) && a.hasta.equals(this.desde)) {
			return true;
		}
		return false;
	}
	
	//true si van a la misma direccion
	public boolean comparar_direccion(Arista o) {
		if(o.hasta.equals(this.hasta)) {
			return true;
		}
		return false;
	}
	
	@Override
	public int hashCode() {
		//ordenar de mayor a menor para que no importe el orden
		String primero = (desde.getLocalidad().compareTo(hasta.getLocalidad()) < 0) ? desde.getLocalidad() : hasta.getLocalidad();
		String segundo = (primero.equals(desde.getLocalidad())) ? hasta.getLocalidad() : desde.getLocalidad();
	    return Objects.hash(primero, segundo, peso);
	}
}
