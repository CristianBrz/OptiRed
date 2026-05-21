package grafo;

public class Vertice{
	private String localidad;
	private Coordenadas coordenada;

	public Vertice(String localidad, Coordenadas coordenada) {
		this.localidad=localidad;
		this.coordenada=coordenada;	
	}
	
	public Coordenadas getCoordenadas() {
		return this.coordenada;
	}
	
	public String getLocalidad() {
		return this.localidad;
		
	}

	public boolean equals(Vertice o) {
		if(this.coordenada.equals(o.getCoordenadas())) {
			return true;
		};
	return false;
	}
	
	
	
	
}