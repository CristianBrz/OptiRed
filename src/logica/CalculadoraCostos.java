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
		final double RADIO_TERRESTRE = 6371; // radio de la Tierra en km

		double lat1 = Math.toRadians(origen.getLatitud());
		double lon1 = Math.toRadians(origen.getLongitud());
		double lat2 = Math.toRadians(destino.getLatitud());
		double lon2 = Math.toRadians(destino.getLongitud());

		double deltaLat = lat2 - lat1;
		double deltaLong = lon2 - lon1;

		double terminoHaversine = Math.sin(deltaLat / 2) * Math.sin(deltaLat / 2)
				+ Math.cos(lat1) * Math.cos(lat2) * Math.sin(deltaLong / 2) * Math.sin(deltaLong / 2);

		double anguloCentral = 2 * Math.atan2(Math.sqrt(terminoHaversine), Math.sqrt(1 - terminoHaversine));

		double distancia =  RADIO_TERRESTRE * anguloCentral;
		
		return distancia;
	}

}
