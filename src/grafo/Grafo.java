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

class Grafo{
	
	private HashMap<Coordenadas,Vertice> vertices=new HashMap<>();
	PriorityQueue<Arista> minHeap = new PriorityQueue<>();
	
	public void insertarVertice(String localidad, Coordenadas coordenada){
		Vertice vertice=new Vertice(localidad);
		vertices.put(coordenada, new Vertice(localidad));
	}
	
	public void conectarVertices(Arista arista) {
		minHeap.add(arista);
	}
} 

