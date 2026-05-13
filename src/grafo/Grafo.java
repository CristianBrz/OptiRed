package grafo;
import java.util.HashMap;
import java.util.PriorityQueue;


class Coordenadas{
	
	private double longitud;
	private double latitud;
	
	public Coordenadas(double longitud, double latitud) {
		super();
		this.longitud = longitud;
		this.latitud = latitud;
	}
}

class Vertice{
	private String localidad;
	
	public Vertice(String localidad, Arista arista) {
		super();
		this.localidad = localidad;
	}
	public Vertice(String localidad) {
		super();
		this.localidad = localidad;
	}
}

class Grafo{
	
	private HashMap<Coordenadas,Vertice> vertices=new HashMap<>();
	PriorityQueue<Arista> minHeap = new PriorityQueue<>();
	
	public void insertarVertice(String localidad, Coordenadas coordenada){
		Vertice vertice=new Vertice(localidad);
		
		vertices.put(coordenada, new Vertice(localidad));
	}
	public void insertarVertice(String localidad, Coordenadas coordenada, Arista arista){
		vertices.put(coordenada, new Vertice(localidad));
	}
	
	public void insertarArista(Arista arista) {
		minHeap.add(arista);
	}
	
	
	
	
	
} 

