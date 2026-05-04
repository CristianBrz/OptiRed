package logica;

public class CalculadoraCostos {
	private ParametrosConexion parametros;

	private final double DISTANCIA_MAXIMA_SIN_ADICIONAL = 300.0;

	public CalculadoraCostos(ParametrosConexion parametros) {
		this.parametros = parametros;
	}

	public double costoConexion(Localidad origen, Localidad destino) {
		double distancia = calcularDistancia(origen, destino);

		double costo = distancia * parametros.getCostoPorKm();

		if (distancia > DISTANCIA_MAXIMA_SIN_ADICIONAL) {
			costo *= (1 + parametros.getPorcentajeExtra() / 100);
		}

		if (!origen.getProvincia().equals(destino.getProvincia())) {
			costo += parametros.getCostoFijoProvincia();
		}

		return costo;
	}

	// https://en.wikipedia.org/wiki/Haversine_formula
	// Implementacion de la formula de Heversine (Tiene en cuenta la curvatura
	// terrestre)
	private double calcularDistancia(Localidad origen, Localidad destino) {
		final double RADIO_TERRESTRE_KM = 6371.2; // radio de la Tierra en km

		Coordenadas cordOrigen = origen.getCoordenadas();
		double latOrigen = cordOrigen.getLatitudRad();
		double longOrigen = cordOrigen.getLongitudRad();

		Coordenadas cordDestino = destino.getCoordenadas();
		double latDestino = cordDestino.getLatitudRad();
		double longDestino = cordDestino.getLongitudRad();

		double deltaLat = latDestino - latOrigen;
		double deltaLong = longDestino - longOrigen;

		double terminoHaversiano = hav(deltaLat) + Math.cos(latOrigen) * Math.cos(latDestino) * hav(deltaLong);

		double anguloCentral = 2 * Math.atan2(Math.sqrt(terminoHaversiano), Math.sqrt(1 - terminoHaversiano));

		double distancia = RADIO_TERRESTRE_KM * anguloCentral;

		return distancia;
	}

	private double hav(double x) {
		double seno = Math.sin(x / 2);
		double senoCuadrado = seno * seno;

		return senoCuadrado;
	}

}
