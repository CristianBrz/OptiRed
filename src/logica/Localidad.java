package logica;

public class Localidad {
	private String nombre;
	private String provincia;
  private Coordenadas coordenadas;
  
	public Localidad(String nombre, String provincia, double latitud, double longitud) {
		this.nombre = nombre;
		this.provincia = provincia;
    this.coordenadas = new Coordenadas(latitud, longitud);
	}

	public String getNombre() {
		return nombre;
	}

	public String getProvincia() {
		return provincia;
	}


  public Coordenadas getCoordenadas() {
      return coordenadas;
  }
}
