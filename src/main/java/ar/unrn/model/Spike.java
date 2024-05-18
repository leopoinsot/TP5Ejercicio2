package ar.unrn.model;

public class Spike implements Item {
	private float tiempo;

	public Spike(float tiempo) {
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
