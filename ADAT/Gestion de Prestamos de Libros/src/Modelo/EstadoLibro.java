package Modelo;

public enum EstadoLibro {

	NUEVO("Nuevo"),
	USADONUEVO("Usado Nuevo"),
	USADOSEMINUEVO("Usado Seminuevo"),
	USADOESTROPEADO("Usado Estropeado"),
	RESTAURADO("Restaurado");
	
	private String estado;
	
	EstadoLibro(String estado){
		
		this.estado=estado;
		
	}
	
	public String estadoTexto() {
		return estado;
	}
	
}
