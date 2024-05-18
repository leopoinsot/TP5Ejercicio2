package ar.unrn.model;

import java.util.ArrayList;
import java.util.List;

public class HistoriaDeUsuario implements Item {
	private float tiempo;
	List<Item> tareas = new ArrayList<>();

	public HistoriaDeUsuario(float tiempo, Item... tareas) {
		this.tiempo = tiempo;
		this.tareas = List.of(tareas);
	}

	@Override
	public float tiempoDeTrabajo() {
		float tiempoTotalDeTrabajo = tiempo;
		for (Item tarea : tareas) {
			tiempoTotalDeTrabajo = tiempoTotalDeTrabajo + tarea.tiempoDeTrabajo();
		}
		return tiempoTotalDeTrabajo;
	}

	@Override
	public float tiempoDeHistoriaDeUsuario() {
		float tiempoTotalDeTrabajo = tiempo;
		for (Item tarea : tareas) {
			tiempoTotalDeTrabajo = tiempoTotalDeTrabajo + tarea.tiempoDeTrabajo();
		}
		return tiempoTotalDeTrabajo;
	}
}
