package ar.edu.unlam.pb2;

import static org.junit.Assert.*;

import org.junit.Test;

public class VueloTest {

	@Test
	public void queSePuedaAgregarUnPasajeroAUnVueloCorrectamente() {
		String nombre="Mario";
		String apellido="Lopez";
		Integer pasaporte = 23445;
		Integer dni = 40001002;
		Integer numeroDeVuelo = 1;
		Boolean valorEsperado = true;
		
		Pasajero pasajero = new Pasajero(nombre, apellido, pasaporte, dni, TipoDeVuelo.CLASETURISTA);
		
		Vuelo vuelo = new Vuelo(numeroDeVuelo);
		
		Boolean valorObtenido = vuelo.agregarPasajero(pasajero);
		
		assertEquals(valorEsperado, valorObtenido);	
		//Si no recuerdo mal tambi�n se puede verificar de esta forma
		assertTrue(valorObtenido);
	}
	
	@Test
	public void queAlSuperarLaCapacidadMaximaNoPermitaIngresarPasajero() {
		String nombre="Mario";
		String apellido="Lopez";
		Integer pasaporte = 23445;
		Integer dni = 40001002;
		Integer numeroDeVuelo = 1;
		Boolean valorEsperado = false;
		
		Pasajero pasajero1 = new Pasajero(nombre, apellido, pasaporte, dni, TipoDeVuelo.CLASETURISTA);
		Pasajero pasajero2 = new Pasajero(nombre, apellido, pasaporte, dni, TipoDeVuelo.CLASETURISTA);
		Pasajero pasajero3 = new Pasajero(nombre, apellido, pasaporte, dni, TipoDeVuelo.CLASETURISTA);
		Pasajero pasajero4 = new Pasajero(nombre, apellido, pasaporte, dni, TipoDeVuelo.CLASETURISTA);
		
		Vuelo vuelo = new Vuelo(numeroDeVuelo);
		
		Boolean valorObtenido = vuelo.agregarPasajero(pasajero1);
		valorObtenido = vuelo.agregarPasajero(pasajero2);
		valorObtenido = vuelo.agregarPasajero(pasajero3);
		valorObtenido = vuelo.agregarPasajero(pasajero4);
		
		assertEquals(valorEsperado, valorObtenido);	
	}

}
