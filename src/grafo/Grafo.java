package grafo;
import java.util.HashMap;
import java.util.Objects;
import java.util.PriorityQueue;


class Coordenadas{
	private double longitud;
	private double latitud;
	
	public Coordenadas(double longitud, double latitud) {
		super();
		this.longitud = longitud;
		this.latitud = latitud;
	}
	public int hashCode() {
	    return Objects.hash(longitud, latitud);
	}
	
	@Override
	public boolean equals(Object obj) {
	    if (this == obj) return true;
	    if (obj == null || getClass() != obj.getClass()) return false;
	    Coordenadas c = (Coordenadas) obj;
	    return Double.compare(c.latitud, this.latitud) == 0 && 
	           Double.compare(c.longitud, this.longitud) == 0;
	}
}

class Grafo{
	
	private HashMap<Coordenadas,Vertice> vertices;
	private PriorityQueue<Arista> minHeap;
	
	Grafo(){
		vertices=new HashMap<>();
		minHeap=new PriorityQueue<>();
	}
	
	public void insertarVertice(String localidad, Coordenadas coordenada){
		Vertice vertice=new Vertice(localidad,coordenada);
		vertices.put(coordenada, vertice);
	}
	
	public void conectarVertices(Vertice vertice1,  Vertice vertice2, double peso) {
		Arista arista=new Arista(vertice1,vertice2,peso);
		minHeap.add(arista);
	}
	
	public void insertarArista(Arista arista) {
		minHeap.add(arista);
	}
	
	public  Arista devolverAristaMinima() {
		return minHeap.poll();
	}
	
	public boolean AristaVacia() {
		return minHeap.isEmpty();
	}
	
	public void Eliminar_arista() {
		minHeap.poll();
		
	}
	
public Grafo devolverKruscal(Grafo grafo) {
		Grafo kruscal=new Grafo();
		Union_find ver_bucle=new Union_find();
		
		while(!minHeap.isEmpty()) {
		Arista arista=devolverAristaMinima();
		Vertice vertice1=arista.getOrigen();
		Vertice vertice2=arista.getDestino();
		
		if(ver_bucle.find(vertice1)!=null && ver_bucle.find(vertice2)!=null) {
			if(!ver_bucle.find(vertice1).equals(ver_bucle.find(vertice2))) {
			ver_bucle.union(vertice1, vertice2);
			}
			continue;
		}
		else {
		ver_bucle.make_set(vertice1);
		ver_bucle.make_set(vertice2);
		kruscal.insertarArista(arista);
		}
		}
		return kruscal;
	}

class Union_find {
	HashMap<Vertice,Vertice> parent=new HashMap<>();
	HashMap<Vertice,Integer> rank=new HashMap<>();
	
	
	void make_set(Vertice vertice){
		if(find(vertice)==null){
		parent.put(vertice, vertice);
		rank.put(vertice, 0);}
	}
	
	public Vertice find(Vertice x){
		if(parent.get(x)==null) {return null;}
		if(!parent.get(x).equals(x)) {
			Vertice raiz = find(parent.get(x));
			parent.replace(x, raiz);
			return raiz;
		}
		return x;
	}
	
	void union(Vertice x, Vertice y){
		Vertice root_x=find(x);
		Vertice root_y=find(y);
		if(root_x.equals(root_y)) {return;}
		if(rank.get(root_x).compareTo(rank.get(root_y))==0) {
			rank.replace(root_y, rank.get(root_y)+1);
			parent.replace(root_x, root_y);
			return;
		}
		if(rank.get(root_x).compareTo(rank.get(root_y))>0) {
			parent.replace(root_y, root_x);
		} else {
			parent.replace(root_x, root_y);
		}
	}
	
	
}
}
























