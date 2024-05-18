package ar.unrn.model;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
	List<Item> itemsDeTrabajos = new ArrayList<>();

	public Proyecto(Item... itemsDeTrabajos) {
		this.itemsDeTrabajos = List.of(itemsDeTrabajos);
	}

	public float calcularTiempoEmpleadoParaFinalizar() {
		float tiempoTotalEmpleado = 0;
		for (Item item : itemsDeTrabajos) {
			tiempoTotalEmpleado = tiempoTotalEmpleado + item.tiempoDeTrabajo();
		}
		return tiempoTotalEmpleado;
	}

	public float calcularTiempoEmpleadoParaFinalizarHistoriaDeUsuario() {
		float tiempoTotalEmpleado = 0;
		for (Item item : itemsDeTrabajos) {
			tiempoTotalEmpleado = tiempoTotalEmpleado + item.tiempoDeHistoriaDeUsuario();
		}
		return tiempoTotalEmpleado;
	}
}
