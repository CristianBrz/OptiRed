package logica;

public class ParametrosConexion {
	private final double costoPorKm;
	private final double porcentajeExtra;
	private final double costoFijoProvincia;

	public ParametrosConexion(double costoPorKm, double porcentajeExtra, double costoFijoProvincia) {
		this.costoPorKm = costoPorKm;
		this.porcentajeExtra = porcentajeExtra;
		this.costoFijoProvincia = costoFijoProvincia;
	}

	public double getCostoPorKm() {
		return costoPorKm;
	}

	public double getPorcentajeExtra() {
		return porcentajeExtra;
	}

	public double getCostoFijoProvincia() {
		return costoFijoProvincia;
	}
}
