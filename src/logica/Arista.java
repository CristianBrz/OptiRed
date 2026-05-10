package logica;

public class Arista {
	private Localidad origen;
  private Localidad destino;
  private double costo;

  public Arista(Localidad origen, Localidad destino, double costo) {
      this.origen = origen;
      this.destino = destino;
      this.costo = costo;
  }

  public Localidad getOrigen() {
      return origen;
  } 

  public Localidad getDestino() {
      return destino;
  }

  public double getCosto() {
      return costo;
  }

  @Override
  public boolean equals(Object obj) {
      if (this == obj)
          return true;
      if (obj == null || getClass() != obj.getClass())
          return false;
      Arista conexion = (Arista) obj;
      return (origen.equals(conexion.origen) && destino.equals(conexion.destino)) ||
              (origen.equals(conexion.destino) && destino.equals(conexion.origen));
  }

  @Override
  public int hashCode() {
      return origen.hashCode() + destino.hashCode();
  }
}
