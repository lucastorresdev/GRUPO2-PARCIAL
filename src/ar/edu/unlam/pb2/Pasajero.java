package ar.edu.unlam.pb2;

public class Pasajero extends Persona {

	private Integer pasaporte;
	private TipoDeVuelo tipo;
	
	
	public Pasajero(String nombre, String apellido, Integer pasaporte, Integer dni, TipoDeVuelo tipo) {
		super(nombre, apellido, dni);
		this.pasaporte = pasaporte;
		this.tipo = tipo;
	}
	
	public Integer comprarBoletoDeAvion() {
		return 0;
	}

	public TipoDeVuelo getTipo() {
		return tipo;
	}
	
	public Integer precioPasaje(TipoDeVuelo tipoDeVuelo) {
		Integer precioDelPasaje=0;
		switch(tipoDeVuelo) {
		case PRIMERACLASE:
			precioDelPasaje=10000;
			break;
		case CLASETURISTA:
			precioDelPasaje=5000;
			break;
		case CLASEBUSINESS:
			precioDelPasaje=2500;
		}
		
		return precioDelPasaje;
	}

	public void setTipo(TipoDeVuelo tipo) {
		this.tipo = tipo;
	}

	public Integer getPasaporte() {
		return pasaporte;
	}

	public void setPasaporte(Integer pasaporte) {
		this.pasaporte = pasaporte;
	}
	
	
	
	

}
