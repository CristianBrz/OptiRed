package controlador;

import java.util.List;
import java.util.ArrayList;

import logica.Localidad;

public class ControladorRegistroLocalidades {
	private List<Localidad> localidades;

	public ControladorRegistroLocalidades() {
		localidades = new ArrayList<>();
	}

	public void agregarLocalidad(String nombre, String provincia, double latitud, double longitud) {
		Localidad nuevaLocalidad = new Localidad(nombre, provincia, latitud, longitud);
		localidades.add(nuevaLocalidad);
	}

	public List<Localidad> getLocalidades() {
		return localidades;
	}

} 
