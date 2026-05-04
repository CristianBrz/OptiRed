package logica;

public class Coordenadas {
  private double latitud;
  private double longitud;

  public Coordenadas(double latitud, double longitud) {
      this.latitud = latitud;
      this.longitud = longitud;
  }

  public double getLatitud() {
      return latitud;
  }

  public double getLongitud() {
      return longitud;
  }

  public double getLatitudRad() {
      return Math.toRadians(latitud);
  }

  public double getLongitudRad() {
      return Math.toRadians(longitud);
  }
}