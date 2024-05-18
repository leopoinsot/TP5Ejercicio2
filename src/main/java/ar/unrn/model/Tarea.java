package ar.unrn.model;

public class Tarea implements Item {
	private float tiempo;

	public Tarea(float tiempo) {
		this.tiempo = tiempo;
	}

	@Override
	public float tiempoDeTrabajo() {
		return tiempo;
	}

	@Override
	public float tiempoDeHistoriaDeUsuario() {
		return 0;
	}
}
