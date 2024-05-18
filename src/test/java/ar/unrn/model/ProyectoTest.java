package ar.unrn.model;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ProyectoTest {

	@Test
	void calcularTiempoEmpleadoParaFinalizarProyectoTest() {
		var tarea1 = new Tarea(1.00f);
		var tarea2 = new Tarea(1.00f);
		var historiaDeUsuario = new HistoriaDeUsuario(1.00f, tarea1, tarea2);
		var spike = new Spike(2.00f);
		var proyecto = new Proyecto(historiaDeUsuario, spike);

		assertEquals(5.00f, proyecto.calcularTiempoEmpleadoParaFinalizar());
	}

	//HICE TODO ESTO(AGREGAR OTRO CALCULO EN ITEM) PARA AGREGAR ESTE CASO DE TEST DEBIDO A QUE LA ACTIVIDAD DICE 2 TEST
	@Test
	void calcularTiempoEmpleadoParaFinalizarHistoriaDeUsuarioTest() {
		var tarea1 = new Tarea(1.00f);
		var tarea2 = new Tarea(1.00f);
		var historiaDeUsuario = new HistoriaDeUsuario(1.00f, tarea1, tarea2);
		var spike = new Spike(2.00f);
		var proyecto = new Proyecto(historiaDeUsuario, spike);

		assertEquals(3.00f, proyecto.calcularTiempoEmpleadoParaFinalizarHistoriaDeUsuario());
	}
}